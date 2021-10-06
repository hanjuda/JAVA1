package day11;

import java.util.Random;
import java.util.Scanner;

/*
	생성자(Constructor):
	1) 생성자는 객체를 생성하는 게 아님!
	2) 객체가 생성된 직후에 반드시 호출되도록 되어 있는 '일종의 메서드'
	3) (객체 속한 변수(그릇)를 채워주는 역할) -> (나중에)
	4) 클래스이름과 동일한 이름으로 / 리턴타입 없음 / 리턴하지도 않음. 
	
	객체 생성 문장: "Scanner sc = new Scanner(System.in);"
	1) 참조변수의 선언
	2) 어떤 클래스(설계도)로 객체 생성할건지?
	3) 생성자의 호출은 어떻게?
	

*/		

class Circle3 {
	int r;  // 반지름
	Circle3(int radius) {
		r = radius;
	}
	double area() {
		return 3.14*r*r;
	}
}

// 원1 객체 : 반지름이 1인 원 객체.  c3
// 원2 객체 : 반지름이 10인 원 객체. c4
public class Ex1106 {
	public static void main(String[] args) {
		Circle3 c3 = new Circle3(1);
		Circle3 c4 = new Circle3(10);
		
		System.out.println("c3의 넓이 : " + c3.area());
		System.out.println("c4의 넓이 : " + c4.area());
	}
}












