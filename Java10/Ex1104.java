package day11;

import java.util.Scanner;

class Circle {
	int r;
	void showArea() {
		double area = 3.14 * r * r;
		System.out.println("반지름이 "+r+"인 원의 넓이는 "+area+"입니다");
	}
}

public class Ex1104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 값을 입력하세요 : ");
		int input = sc.nextInt();
		
		Circle c1 = new Circle();
		c1.r = input;
		c1.showArea();
	}
}






