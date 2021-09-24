package day4;

import java.util.Scanner;

public class Ex401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // 스캐너 객체 생성 문장
		System.out.print("점수를 입력하세요(0-100) : ");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A학점");
		}
		else if(score>=80) {
			System.out.println("B학점");
		}
		else if(score>=70) {
			System.out.println("C학점");
		}
		else if(score>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
		
	}
}











