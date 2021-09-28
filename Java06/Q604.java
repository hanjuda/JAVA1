package day6;

import java.util.Scanner;

// Q604. 세 정수를 입력받고(a,b,c), 세 정수의 합계가 짝수인지 출력. 
// "짝수가 아니라면, (짝수일 때까지) 처음부터 반복."
public class Q604 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("a : ");
			int a = sc.nextInt();
			System.out.print("b : ");
			int b = sc.nextInt();
			System.out.print("c : ");
			int c = sc.nextInt();
			
			if((a+b+c)%2==0) {
				System.out.println("a+b+c는 짝수임.");
				break;
			}
			System.out.println("짝수를 입력하라고.");
		}
	}
}











