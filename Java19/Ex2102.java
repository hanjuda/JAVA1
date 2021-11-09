package day21;

// 여기: 클래스 상속 ---> 생각한 것보다는 그 연관관계가 strong하지 않음! (이해:고급)
//class Parent1 {
//	private int num = 5;
//}
//class Child1 extends Parent1 {
//	void showNum() { System.out.println(num); }
//}

// 여기: 내부클래스
class Outer2 {   // Outer2 : 외부클래스
	private int num = 5;
	class Inner2 {   // Inner2 : "내부클래스(Inner Class)"
		void m() { System.out.println("m() 호출됨"); }
		void showNum() { System.out.println(num); }
	}
}

public class Ex2102 {
	public static void main(String[] args) {
		Outer2 o = new Outer2();
		Outer2.Inner2 obj = o.new Inner2();
		obj.m();
		obj.showNum();
	}
}









