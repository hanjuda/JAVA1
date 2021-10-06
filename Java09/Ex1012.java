package day10;

public class Ex1012 {
	static int fact(int n) {   // 팩토리얼, 재귀호출.
		if(n==0)
			return 1;
		return n * fact(n-1);
	}
	static int fact2(int n) {  // 팩토리얼, 반복문.
		return 0;   // TODO : 각자 작성해보세요.
	}
	public static void main(String[] args) {
		System.out.println("4! : " + fact(4));   // 4! : 24
		System.out.println("5! : " + fact2(5));   // 5! : 120
	}
}
