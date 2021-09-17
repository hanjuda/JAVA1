package day2;

import java.util.Scanner;

public class Ex211 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();   // 15327 -> 7 2 3 5 1
		int num2 = 0;    // 72351
//		while(num>0) {
//			System.out.print(num%10);
//			num /= 10;   // num: 15327 --> 1532
//		}
		while(num>0) {
			num2 = num2*10 + num%10;
			num /= 10;
		}
		System.out.println(num2);
	}
}








