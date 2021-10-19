package day19;

class A3 {
//	private int num = 5;		// 부모의 private한 변수는 내(자식)가 볼 수 없음!
	int a = 5;
}
                                                            
class B3 extends A3 {
	int a = 10;
	void show2() {
		System.out.println("super.a : " + super.a);
		System.out.println("a : " + a);
	}
//	void show() {
//		System.out.println("num : " + num);
//	}
} 

public class Ex1902 {
	public static void main(String[] args) {
		B3 obj = new B3();
		obj.show2();
	}
}
