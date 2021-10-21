package day20b;

import day20.I7;

class I7Impl implements I7 {
	@Override
	public void m() { 
		System.out.println(num);
		// num = 5;  // 상수->final임을 확인.
	}
}

public class Ex2007b {
	public static void main(String[] args) {
		System.out.println(I7.num);  // static임을 확인. public임을 확인.
		
		I7Impl obj = new I7Impl();
		obj.m();
	}
}



