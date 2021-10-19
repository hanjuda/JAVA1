package day19;

class A4 {
	A4() {
		System.out.println("부모클래스 생성자 호출됨!");
	}
}

class B4 extends A4 {
	B4() {
		//super();  // 자바가 알아서 껴넣어줌! (왜냐하면, 내가 언급하지 않았으므로)
					// 왜냐하면, 자식클래스의 첫줄에서는 (반드시) 부모클래스의 생성자를 호출해야 하므로! 
		super();
	}
}

public class Ex1903 {
	public static void main(String[] args) {
		B4 obj = new B4();
		// 자식클래스의 객체를 생성 --...--> 부모클래스의 생성자가 호출됨!
		// 자식클래스의 객체를 생성 ----> 그러면, 자식클래스의 생성자가 호출되었을까?
		//			그러면 혹시, 자식클래스의 생성자 안에서 부모클래스의 생성자를 호출하게 된 건 아닐까?
				
	}
}










