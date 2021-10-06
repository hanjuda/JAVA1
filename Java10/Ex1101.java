package day11;

// "지역변수의 유효범위(scope)"
// 1. 메서드 중괄호{ } 안에서 선언 --> 해당 메서드 중괄호{ } 안에서만 살아있음.
// 2. 메서드의 파라미터는 지역변수! --> 해당 메서드 중괄호{ } 안에서만 살아있음.
// 3. if문의 중괄호{ } 안에서 선언 --> 해당 if문의 중괄호{ } 안에서만 살아있음.
// 4. for문의 괄호( ) 안에서 선언 --> 해당 for문 안에서만 살아있음.
public class Ex1101 {
	static void m(int p) {
		System.out.println(p);
	}
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			
		}
//		System.out.println(i);  // ERR.
		
		int num = 5;
		System.out.println(num);

		m(num);
//		System.out.println(p);   // ERR.

		if(3>2) {
			int num3 = 55;
		}
//		System.out.println(num3);   // ERR.
	}
}



















