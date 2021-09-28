package day6;

import java.util.Scanner;

//Ex605. (실행결과) 입력(가위/바위/보) : 가위 (엔터)       # 문자열 입력 : sc.next()
//#1. 너=가위 / 컴=보
//#2. 너(가위) vs 컴(보) -> 너 승!
public class Ex605 {
	public static void main(String[] args) {
		String[] rps = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(가위/바위/보) : ");
		String input = sc.next();    // 문자열 입력
		int r = (int)(Math.random() * 3);  // 0,1,2 중에 하나
		String com = rps[r];
		
		//System.out.println("너=" + input + " / 컴=" + com);
		System.out.println("너(" + input + ") vs 컴(" + com + ") ->"); 
		if( (input.equals("가위") && com.equals("보")) 
				|| (input.equals("바위") && com.equals("가위")) 
				|| (input.equals("보") && com.equals("바위")) ) {
			System.out.println("너 승!");
		}
		// TODO : 비긴 상황과 사용자가 패배한 상황을 처리.
		
	}
}







