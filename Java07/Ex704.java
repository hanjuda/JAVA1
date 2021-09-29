package day7;

import java.util.Scanner;

// Ex704 : (이해) '입력버퍼'
// 이해:
// 1. 스캐너(Scanner)는 (키보드가 아닌) '입력버퍼'를 바라보고 있음.
// 2. 스캐너 사용해서 입력받을 때, '입력버퍼'가 비어있는 상태(=가져올 수 있는 값이 전혀 없는 상태)라면
//    커서를 보여주고 입력을 기다린다.
// 3. 따라서, 스캐너 사용시 '입력버퍼'에 내용이 남아있는지 고려.

public class Ex704 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.next();     // "여러분 곧 점심시간입니다"
		System.out.print("문자열 입력 : ");
		String s2 = sc.next();    // 예상->"뭐 먹을지 정하셨나요?"
		
		System.out.println("s:" + s);  // 예상->"여러분 곧 점심시간입니다"
		System.out.println("s2:" + s2); // 예상->"뭐 먹을지 정하셨나요?"
		
	}
}











