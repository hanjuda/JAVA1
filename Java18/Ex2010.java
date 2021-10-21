package day20;

abstract class AC2 { 
	void m2() { }
}
abstract class AC3 { 
	void m2() { }
}
//class D4 extends AC2, AC3 {   // ERR. "자바는, 클래스의 다중상속을 금지하고 있음!"
//								// "추상클래스도 클래스임."
//}

interface I1 {
	void m1();
	void m2();
}
interface I2 {
	void m2();
	void m3();
}
interface I3 extends I1,I2 {     // "인터페이스는 다중상속이 가능함!" --> 문제될 게 없으니까.
}

public class Ex2010 {
	public static void main(String[] args) {
		
	}
}













