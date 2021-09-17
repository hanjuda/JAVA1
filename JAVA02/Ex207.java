package day2;

import java.util.Scanner;

//Ex207.	연습
//C = 5 / 9 x ( F - 32 )
//[실행결과] 화씨온도를 입력하세요 : 100 (엔터)
//	   화씨 100도 --> 섭씨 37.777778도
public class Ex207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // "스캐너 객체 생성 문장"
		System.out.print("화씨온도를 입력하세요 : ");
		int f = sc.nextInt();
		float c = 5.0f / 9 * (f - 32);
		
		System.out.println("화씨 "+f+"도 --> 섭씨 "+c+"도");
		
		// 이하 고급(Ex208)
		System.out.println(c);  // 37.77778
		System.out.println((int)(c*10)/10.0);
		System.out.println((int)c);
	}
}











