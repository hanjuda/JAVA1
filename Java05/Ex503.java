package day5;

import java.util.Scanner;

public class Ex503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--) {  // i : 5,4,3,2,1
			for(int j=1; j<=i; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}









