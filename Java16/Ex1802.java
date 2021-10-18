package day18;

class Parent1 {
	int num = 5;
	void showNum() {
		System.out.println("num : " + num);
	}
}

class Child1 extends Parent1 {
	double num2 = 10.5;
	void showNum2() {
		System.out.println("num2 : " + num2);
	}
}

public class Ex1802 {
	public static void main(String[] args) {
		Child1 obj = new Child1();
		// obj.showNum();    // 1) 호출가능? 2) 실행결과?
		// obj.showNum2();   // 1) 호출가능? 2) 실행결과?
	}
}

