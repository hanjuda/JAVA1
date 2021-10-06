package day10;

import java.util.Scanner;

//3개의 정수를 입력받아, 
//[3개의 정수의 합계를 출력(ex. "3 + 5 + -1 = 7")하는 메서드]를 이용,
//아래와 같이 출력.
//(실행결과) 입력1 : 3 (엔터)
//	   입력2 : 5 (엔터)
//	   입력3 : -1 (엔터)
//	   3 + 5 + -1 = 7
public class Ex1002 {
	static void sum(int a, int b, int c) {
		int s = a + b + c;
		System.out.println(a + " + "+b+" + "+c+" = "+s);
	}
   	public static void main(String[] args) {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("입력1 : ");
   		int n1 = sc.nextInt();
   		System.out.print("입력2 : ");
   		int n2 = sc.nextInt();
   		System.out.print("입력3 : ");
   		int n3 = sc.nextInt();
   		
		sum(n1, n2, n3);   // "3 + 5 + -1 = 7"
	}
}











