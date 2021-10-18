package day18;

// 상속 --------------> 확장 / (부모의 것을) 수정
class A2 {
	int a;	    // 클래스의 필드 ---> 내가 초기화하지 않더라도 자동으로 '기본값(default value)'로 초기화됨.
	void show() { System.out.println("a : " + a); }	
}

class B2 extends A2 {     // 부모클래스=A2, 자식클래스=B2
	int b;		// 기본값으로 초기화됨.

	void show2() {
		System.out.println("b : " + b);
	}
	@Override    // optional -> 권장O
	void show() {  // (상속하는 과정에서) show() 메서드를 재정의. (이해) "메서드 오버라이드"
		System.out.println("a : " + a + ", b : " + b);
	}
	
	void show(int c) {    // (이해) "메서드 오버로딩"
		System.out.println("a....b....c....");
	}
}

public class Ex1803 {
	public static void main(String[] args) {
		B2 obj = new B2();
//		obj.show();
//		obj.show2();
		obj.show();   // 이해 : a랑 b가 둘 다 출력됨 ----> 자식클래스에서 '재정의'한 내용이 실행됨.
					  //                            부모클래스의 내용이 실행되는 게 아님.
	}
}










