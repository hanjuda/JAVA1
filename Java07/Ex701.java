package day7;

import java.util.Scanner;

//★Ex701.	사용자가 입력한 모든 정수의 합계를 출력하는 프로그램.
//	단, 사용자가 0을 입력하면 (그때까지의 합계를 출력하고) 종료.
//(실행결과) 입력 : 7 (엔터)
//	   입력 : -3 (엔터)
//	   입력 : 0 (엔터)
// 	   지금까지 입력한 값들의 합은 4입니다.
public class Ex701 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			// 입력하라고.
			System.out.print("입력 : ");
			
			// 입력받고. ---> 만약에 0이면 탈출.
			int input = sc.nextInt();
			if(input==0) {
				break;
			}
			
			// 합계.
			sum += input;
		}

		System.out.println("지금까지 입력한 값들의 합은 " + sum + "입니다.");
	}
}









