package day7;

import java.util.Scanner;

// 이해:
// 1. (직감적으로) '입력버퍼' 문제구나!
// 2. '입력버퍼'에 '줄바꿈문자'가 남아있기 때문. -> 이걸 어떻게?
// 3. sc.nextLine(); 을 추가하면 잘됨 --> 왜?
public class Ex705 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이와 이름을 입력하세요:");  	// 19
													// YG
		int age = sc.nextInt();    // 19
		sc.nextLine();    // '입력버퍼'에 있는 '줄바꿈문자'를 꺼내서 버림. (편법) / 취업전.
		String name = sc.nextLine();  // YG
//		String name = sc.next();
		
		System.out.println("입력된 내용 : " + name + "(" + age + ")");
		
//		System.out.print("1: "); int a = sc.nextInt();
//		System.out.print("2: "); int b = sc.nextInt();
//		System.out.print("3: "); int c = sc.nextInt();
//		System.out.println(a + "," + b + "," + c);
	}
}









