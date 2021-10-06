package day10;

public class Ex1013 {
	static int fibo(int n) {    // 피보나치수열. 재귀. n번째 항을 리턴.   
		if(n==1) return 1;
		if(n==2) return 1;
		return fibo(n-1) + fibo(n-2);
	}
	static int fibo2(int n) {   // 피보나치수열. 반복. n번째 항을 리턴.
		int a = 1;
		int b = 1;
		int c = 0;

		if(n==1) return a;
		if(n==2) return b;
		for(int i=1; i<=n-2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
			System.out.print(fibo(i) + " ");
		System.out.println();
		for(int i=1; i<=10; i++)
			System.out.print(fibo2(i) + " ");
	}
}













