package day16;

import java.util.Scanner;

// String 클래스 연습1. 
// 문자열 "YGacademy.com"에서,
// 입력받은 정수값(인덱스번호)에 해당하는 글자를 출력. 
public class Ex1609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "YGacademy.com";
		
		System.out.print("인덱스번호 입력 : ");
		int input = sc.nextInt();
		
		// 문자열 str에서, 인덱스번호 input인 위치의 글자를 출력:
		char ch = str.charAt(input);
		System.out.println("문자열 str에서 인덱스번호 " + input + "에 해당하는 글자 : " + ch);
	}
}













