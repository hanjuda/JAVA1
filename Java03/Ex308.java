package day3;

import java.util.Scanner;

public class Ex308 {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);  // 스캐너 객체 생성 문장
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:			// 90점 이상 -> A학점
			System.out.println("A학점");
			break;  // 해당 switch문을 빠져나옴!
		case 8:		// 80점 이상 -> B학점
			System.out.println("B학점");
			break;
		case 7:		// 70점 이상 -> C학점
			System.out.println("C학점");
			break;
		case 6:		// 60점 이상 -> D학점
			System.out.println("D학점");
			break;
		default:	// 그 외의 경우 전부.	
			System.out.println("F학점");
			break;  // (optional)
		}
	}
}








