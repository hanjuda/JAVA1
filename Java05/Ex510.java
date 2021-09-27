package day5;

import java.util.Scanner;

public class Ex510 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 몇까지 곱할까요? ");
		int n = sc.nextInt();
		int m = 1;
		
		for(int i=1; i<=n; i++) {
			m *= i;
			System.out.print(i + (i<n ? " * " : " = "));
		}
		
		System.out.println(m);
	}
}









