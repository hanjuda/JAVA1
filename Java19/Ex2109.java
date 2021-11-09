package day21;

import java.util.Scanner;

public class Ex2109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("<A를 B로 나누는 계산기>");
		System.out.print("A를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("B를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.print("저장할 인덱스번호(0~9)를 입력하세요 : ");
		int idx = sc.nextInt();

		try {
			int result = a / b;     // 0으로 나눌 때 : ArithmeticException
			arr[idx] = result;    // ArrayIndexOutOfBoundsException
			System.out.println("나눗셈의 결과 = " + arr[idx]);
		} catch(ArithmeticException e) {
			System.out.println("예외 : 0으로 나누려 했음!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 : 유효하지 않은 인덱스번호가 입력됨!");
		} catch(Exception e) {
			System.out.println("(무언가 예외가 발생됨)");
		}
		
		System.out.println("프로그램 정상 종료됨.");
	}
}











