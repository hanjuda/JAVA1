package day20;

interface I8 {
	void m8();   // public abstract
}
interface I9 extends I8 {   // "인터페이스가 인터페이스를 상속할 수 있음!"
	void m9();	 // public abstract
}
class Impl implements I9 {	
	public void m8() { }
	public void m9() { }
}

public class Ex2009 {
	public static void main(String[] args) {

	}
}
