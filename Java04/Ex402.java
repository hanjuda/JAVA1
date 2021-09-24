package day4;

import java.util.Scanner;

public class Ex402 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // 스캐너 객체 생성 문장
		System.out.print("점수를 입력하세요(0-100) : ");
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}
	}
}




