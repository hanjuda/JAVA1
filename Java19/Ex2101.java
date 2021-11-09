package day21;

class Outer1 {	// Outer1 : "외부클래스"
	static class Static1 {   // Static1 : "스태틱클래스"
		void m() { System.out.println("m() 호출됨"); }
	}
}

public class Ex2101 {
	public static void main(String[] args) {
		Outer1.Static1 obj = new Outer1.Static1();
		obj.m();
	}
}











