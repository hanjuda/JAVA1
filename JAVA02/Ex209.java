package day2;

// Ex209. 단항연산자 / 삼항연산자
public class Ex209 {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(-num);
		System.out.println(num++);  // 5
		
		int num2 = 3 + 5;
		
		int num3 = 15;
		char ch = num3%2==0 ? '짝' : '홀';
		System.out.println(ch);   // 홀

		int a = 15;
		int b = 17;
		int max = a>b ? a : b;
		int min = a>b ? b : a;
		//int min = a<b ? a : b;
		System.out.println("max : " + max);   // max : 17
		System.out.println("min : " + min);   // min : 15
		
	}
}










