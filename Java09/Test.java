package day10;

import java.util.Arrays;

public class Test {
	static void m2() {
		System.out.println(123);
		return;		  // 메서드의 실행을 종료한다.
		//System.out.println(456);
	}
	static int m() {
		return 10;    // 1) 메서드의 실행을 종료하면서.  2) 리턴값을 되돌려줌(호출한 쪽으로)
	}
	
	public static void main(String[] args) {
		m2();
		
		int n = 100 + m();
		System.out.println();

	}
}
