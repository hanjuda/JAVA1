package day6;

import java.util.Scanner;

//Q602. 두 정수를 입력받고(a<b 가정), a부터 b까지 출력.
public class Q602 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			System.out.print(i + " ");
		}
		
	}
}




