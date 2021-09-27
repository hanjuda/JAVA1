package day5;

import java.util.Scanner;

/*
Ex501(복습)
	두 정수를 입력받아서(a<b),	
	a부터 b까지의 총합을 출력.
	(고급) a>b이어도 동일하게 실행.
*/
public class Ex501 {								// \\192.168.1.101
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();				// 3 (엔터)
		System.out.print("b : ");
		int b = sc.nextInt();				// 5 (엔터)

		if(a>b) {
			int t = a;
			a = b;
			b = t;
		}
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}
}








