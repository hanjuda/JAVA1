package day10;

import java.util.Scanner;

// (실행결과) 입력1 : 5 (엔터)
//	   입력2 : -10 (엔터)
//	   입력3 : 17 (엔터)
//	   최대값 = 17

public class Ex1005 {
	static int max(int n1, int n2, int n3) {
		// n1이 최대값 -> n1을 리턴
		if(n1>n2 && n1>n3) {
			return n1;
		}
		// n2...
		if(n2>n1 && n2>n3) {
			return n2;
		}
		return n3;		// return문 : ①메서드 실행을 종료 ②리턴값을 메서드를 호출한 쪽으로 전달!
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int a = sc.nextInt();
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		
		System.out.println("최대값 = " + max(a,b,c));
	}
}









