package day6;

import java.util.Scanner;

//(실행결과) Guess(1~100) : 50 (엔터)            // 컴 : 37 가정.
//더 작아야.
//Guess(1~100) : 25 (엔터)
//더 커야.
//Guess(1~100) : 37 (엔터)
//3번 시도 끝에 맞췄습니다!
public class Ex607 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rd = (int)(Math.random()*100) + 1;
		int cnt = 0;
		while(true) {
			System.out.print("Guess(1~100) : ");
			int input = sc.nextInt();
			cnt++;
			if(input < rd) {
				System.out.println("더 커야.");
			} else if(input > rd) {
				System.out.println("더 작아야.");
			} else {
				System.out.println(cnt + "번의 시도 끝에 맞췄습니다!");
				break;
			}
		}
	}
}










