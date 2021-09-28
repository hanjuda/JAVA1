package day6;

import java.util.Scanner;

//Ex606.	정수 4개를 입력(a,b,c,d)받아서,
//a부터 b까지 출력하되,
//c부터 d까지는 제외하고 출력하세요.
//(단, 반복문은 무조건 무한반복문으로 하고, break와 continue를 꼭 사용하세요.)
//(실행결과)	a : 1 (엔터)
//		b : 11 (엔터)
//		c : 7 (엔터)
//		d : 10 (엔터)
//		1 2 3 4 5 6 11

public class Ex606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		System.out.print("d : ");
		int d = sc.nextInt();
		
		for(int i=a; ;i++) {
			if(i>=c && i<=d) {
				continue;
			}
			System.out.print(i + " ");
			
			if(i==b) { 
				break;
			}
		}
	}
}










