package day19;

public class Test {
	static void m() { }	// 1
	static void m(int a) { }	// 2
	static void m(double b) { }	// 3
	static void m(int a, int b) { }	 // 4

	public static void main(String[] args) {
		m(); 
		m(10);
		m(10,30);

	}

}
