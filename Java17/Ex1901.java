package day19;

class A2 {
	int num = 5;
	void showNum() { System.out.println("num : " + num); }
}
class B2 extends A2 {
	int num2 = 55;
	@Override
	void showNum() {
		super.showNum();    // super : 부모클래스(A2) 객체의 참조값
							// super -> 자식클래스에서 오버라이드하면서 가려져 있던 멤버(메서드)를 호출할 수 있다! (이해)
		System.out.println("num2 : " + num2); 
	}
}

public class Ex1901 {
	public static void main(String[] args) {
		B2 obj = new B2();
		obj.showNum();
	}
}












