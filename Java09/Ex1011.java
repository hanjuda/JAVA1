package day10;

// Ex1011 : 메서드 재귀호출(Recursive Call)
public class Ex1011 {
	static void m() {
		System.out.print(".");
		//m();     // 재귀호출.
	}
	public static void main(String[] args) {
		m();
	}
}
