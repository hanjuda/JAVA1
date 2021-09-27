package day5;

import java.util.Scanner;

//			공백문자	별
//*			3=(4-i)	1=i

public class Ex504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)		// 공백문자 
				System.out.print(" ");
			for(int j=1; j<=i; j++)			// 별
				System.out.print("*");
			System.out.println();			// 줄바꿈
		}
	}
}









