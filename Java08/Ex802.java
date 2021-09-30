package day8;

import java.util.Scanner;

//(실행결과) 몇 과목인가요? 4 (엔터)
//		   점수를 입력하세요: 80 (엔터)
//		   90 (엔터)
//		   100 (엔터)
//		   70 (엔터)
//		   총점 : 340점
//		   평균 : 85점
public class Ex802 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 과목인가요? ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.print("점수를 입력하세요: ");
		for(int i=0; i<=n-1; i++) {
			arr[i] = sc.nextInt();    // 이해. 
		}
		
		int total = 0;
		for(int i=0; i<=n-1; i++) {
			total += arr[i];
		}
		System.out.println("총점 : " + total + "점");
		System.out.println("평점 : " + (total/n) + "점");
	}
}










