package day13;

import java.util.Scanner;

//Ex1305. 연습. String배열의 사용.   // String[] arr = new String[100];   arr[0] = "...";
//- 과일의 이름을 입력받아서(최대 100개) 배열에 저장.
//- 과일의 이름으로 "끝"을 입력하면, 지금까지 입력한 과일들을 이름을 모두 출력(출력 형식은 자유)한 후 종료.
//
//(실행결과) 과일 이름을 입력 : 사과 (엔터)
//	   과일 이름을 입력 : 바나나 (엔터)
//	   과일 이름을 입력 : 포도 (엔터)
//	   과일 이름을 입력 : 끝 (엔터)
//	   입력한 과일 -> 사과,바나나,포도
public class Ex1305 {
	public static void main(String[] args) {
//		int[] arr2 = new int[100];   // int형 변수를 100개 선언한 효과.
//		int num = 5;
//		String[] arr = new String[100];   // String타입의 변수를 100개 선언한 효과.
//		String s = "Hello";			// 이해 : "문자열 객체를 만들어서 참조값을 s에 대입"
		
		String[] arr = new String[100];   // String타입의 변수를 100개 선언한 효과.
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("과일 이름을 입력 : ");
			arr[count++] = sc.next();
			if(arr[count-1].equals("끝")) {
				break;
			}
		}
		System.out.print("입력한 과일 -> ");
		for(int i=0; i<=count-2; i++) {
			System.out.print(arr[i] + (i<count-2 ? "," : ""));
		}
		
		sc.close();    // (optional)
	}
}














