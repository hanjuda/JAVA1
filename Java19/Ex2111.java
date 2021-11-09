package day21;

public class Ex2111 {
	static void m1() throws Exception {
//		try {
			m2();
//		} catch(Exception e) { e.printStackTrace(); }
	}
	static void m2() throws Exception {
//		try {
			m3();
//		} catch(Exception e) { e.printStackTrace(); }
	}
	static void m3() throws Exception {
		// (참고만) 예외객체를 직접 생성해서 직접 발생시킴:
		Exception obj = new Exception();
						// 또는 new Exception(힌트메시지 문자열);
//		try {
			throw obj;   // throw키워드 = "예외를 발생시킴!" = (바로 이 자리에서 예외가 발생됨!)
//		} catch(Exception e) { e.printStackTrace(); }
		// 또는 throw new Exception();
	}
	public static void main(String[] args) throws Exception {
//		try {
			m1();
//		} catch(Exception e) { e.printStackTrace(); }
		System.out.println("프로그램 정상 종료됨.");
	}
}








