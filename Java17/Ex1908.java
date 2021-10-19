package day19;

class AA9 extends Object { }
class A9 extends AA9 { 
	
}

public class Ex1908 {
	public static void main(String[] args) {
		A9 a9 = new A9();
		System.out.println(a9);
		System.out.println(a9.toString());   // --> Object클래스의 toString()메서드의 내용이 실행된 것.
		System.out.println(a9);    // --> a.toString()이 자동으로 호출됨.
						// (참고)
						// 먼저 System 클래스
						// out참조변수의 타입이 PrintStream
						// PrintStream 클래스 --> "println(Object x)" !!
		
	}
}









