package day4;

import java.util.Scanner;

public class Ex404 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단 수(n)를 입력하세요 : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(n + " * "+i+" = " + n*i);
		}
		
	}
}






