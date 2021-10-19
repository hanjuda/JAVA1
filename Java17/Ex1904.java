package day19;

class A5 {
	int n;
	// 2) 생각: A5클래스에 파라미터 1개인 생성자를 정의하면, 그러면 왜 자식클래스에서 에러가 날까요?
	A5(int n) {
		this.n = n;
		System.out.println("A5 생성자가 호출됨.");
	}
}

class B5 extends A5 {
	// 1) 생각: B5클래스에 껴넣어지는 디폴트 생성자는 어떤 모양일까요?
//	B5() {
//		super();
//	}
	B5() {
		//super();  // 디폴트 생성자의 원래 내용 (이해) --> ERR (이해)
		super(0);
		System.out.println("자식클래스의 생성자가 실행됨..");  // 이해 : 이 문장이 첫줄에 있으면 에러.
		
	}
}

public class Ex1904 {
	public static void main(String[] args) {
		B5 obj = new B5();
		
	}
}

