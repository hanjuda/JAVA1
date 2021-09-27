package day5;

import java.util.Scanner;

//Ex509.	(실행결과)
//1부터 몇까지 합할까요? 5 (엔터)
//15
//(고급)	1 + 2 + 3 + 4 + 5 = 15
public class Ex509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 몇까지 합할까요? ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {   // i : 1 ~ n
			// i를 변수 sum에 누적해서 더하면?
			sum += i;       // sum = sum + i;
			System.out.print(i + (i<n ? " + " : " = "));
//			System.out.print(i);
//			if(i==n)
//				System.out.print(" = ");
//			else 
//				System.out.print(" + ");
		}
		System.out.println(sum);
		
	}
}









 