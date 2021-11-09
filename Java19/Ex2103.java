package day21;

class Outer3 {    // Outer3 : 외부클래스
	void m() {
		int num = 5;
		class Local3 {		// Local3 : "로컬클래스"
			void showNum() { System.out.println(num); }
		}
		Local3 obj = new Local3();
		obj.showNum();
	}
}

public class Ex2103 {
	public static void main(String[] args) {
		//new Outer3().m();
	}
}










