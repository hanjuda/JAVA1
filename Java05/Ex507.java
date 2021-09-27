package day5;

import java.util.Scanner;

// n : 4	i	공		별공
//    * 	1	3=(n-i)	1=(i)
//   * * 	2	2		2
//  * * * 	3	1		3
// * * * * 	4	0		4
public class Ex507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			// 공백(n-i)
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			// 별공(i)
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			// 줄바꿈
			System.out.println();
		}
		
	}
}














