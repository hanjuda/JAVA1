package day20;

/*final*/ class A3 {
	/* final */ void m() { System.out.println("m()"); }
}

class B3 extends A3 {
	@Override
	void m() { System.out.println("B3의 m()"); }
}

public class Ex2002 {
	public static void main(String[] args) {
		final int num = 5;
//		num = 6;   // ERR. 상수니까.
//		num++;     // ERR. 상수니까.
		
	}
}












