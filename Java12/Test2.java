package day13b;

class DDD {
	int num;
	void m2() {
		this.num = 100;
	}
	static void m() {
		//this.num = 100;   // ERR. this를 클래스메서드 안에서 쓸 수 없음.
	}
}
public class Test2 {
//	void m() {
//		System.out.println("m() 호출됨.");
//	}
//	public static void main(String[] args) {
//		m();
//	}
}
