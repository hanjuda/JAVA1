package day20;

class A5 {
	void m() {  }
}

class B5 extends A5 {
	//@Override
	//private void m() {  }   // ERR. 메서드 오버라이드할 때, 접근제어자의 접근의 범위를 좁힐 수 없음!
}

class AA {
	int num;

	@Override
	public String toString() {			// public 이 없으면 ERR! (이해★)
		return num+"";
	}
}

public class Ex2006 {
	public static void main(String[] args) {

	}
}












