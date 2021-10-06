package day10;

import java.util.Scanner;

public class Ex1003 {
	static void sum(int[] a) {
		// a라는 (사이즈 3)인 배열의 모든 요소의 합계를 출력.
		int sum = 0;
		for(int i=0; i<=a.length-1; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// 정수 3개를 입력 -> 배열을 완성 -> 메서드에 전달(호출)
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i=0; i<=2; i++) {
			System.out.print("입력" + (i+1) + " : ");
			arr[i] = sc.nextInt();
		}
		
		sum(arr);
	}
}








