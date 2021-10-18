package day18;

class A {      // A : 부모클래스
	void m1() { System.out.println("m1() 메서드 호출됨"); }
	void m2() { System.out.println("m2() 메서드 호출됨"); }
}
				// B : 자식클래스					// 객체지향 프로그래밍의 특징 : 캡슐화, "상속", 추상화, 다형성
class B extends A {   // "클래스 B는 클래스 A를 확장(상속)한다."  
	int num;
	B(int num) { this.num = num; }
	void showNum() { System.out.println("num : " + num); }
}

public class Ex1801 {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
		
		B b = new B(10);
		b.m1();		// 이해 : 클래스B는 클래스A를 상속받았으므로, m1() 메서드 호출 가능.
		b.m2();		// 이해 : 클래스B는 클래스A를 상속받았으므로, m2() 메서드 호출 가능.
		b.showNum();
		
	}
}













