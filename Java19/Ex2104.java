package day21;

abstract class AC {
	abstract void m();					
}
//class CC extends AC {
//	@Override
//	void m() { System.out.println("m() 호출됨"); }
//}

public class Ex2104 {
	public static void main(String[] args) {
		AC obj = new AC() {  // 익명클래스 --> "클래스 정의 + 동시에 객체 생성"
			@Override
			void m() { System.out.println("m() 호출됨"); }
		};
		obj.m();
	}
}









