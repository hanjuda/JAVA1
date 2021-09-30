package day8;

import java.util.Scanner;

//Ex804.	난수 발생(-5 ~ +5) 값을 크기가 6인 배열에 채운 후,
//1) 배열의 내용 출력 (Arrays.toString() 사용 X)
//2) 정수 하나(변수 n)를 입력받고 그 값이 이 배열에 존재하는지 여부를 출력.
//(실행결과) 정수(n) 입력 : 3 (엔터)
//	   배열 : [-2, 3, 4, 4, -5, -1] -> 3 있음!
//(실행결과) 정수(n) 입력 : 4 (엔터)
//	   배열 : [2, 0, -4, -4, 5, 3] -> 4 없음!
public class Ex804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*11)-5;
		}
		
		System.out.print("정수(n) 입력 : ");
		int n = sc.nextInt();
		
		System.out.print("[");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {   // i가 '마지막 인덱스번호'가 아니라면.(보다 작다면) 
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		int cnt = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]==n) {
				cnt++;
			}
		}
		if(cnt==0)
			System.out.println(" -> " + n + " 없음!");
		else
			System.out.println(" -> " + n + " 있음!");
		
		//		-5-4-3-2-1 0 +1+2+3+4+5  ----> Math.random() 
//		0 ~~~~~~~~~~~~~~~~~~ 10  ----> (int)(Math.random()*11)
//		-5 ~~~~~~~~~~~~~~~~~ +5  ----> (int)(Math.random()*11)-5
//		for(int i=1; i<=20; i++) {
//			System.out.print( (int)(Math.random()*11)-5 + " ");
////			System.out.print( (int)(Math.random()*11-5) + " "); // 안돼!!!
////											// -4.9999999 -> 버림 -> -5
////											// -4.9999999 -> 형변환 -> -4
//		}
		
	}
}







