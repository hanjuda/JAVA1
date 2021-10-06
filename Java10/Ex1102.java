package day11;

// 메서드 오버로딩 : "파라미터의 개수가 다르거나 타입이 다르거나"
public class Ex1102 {
	//static void plus(int a, int b) { }   // [주의] '리턴타입'은 X.
	static int plus(int a, int b) { return a+b; }
	static double plus(double a, double b) { return a+b; }

	public static void main(String[] args) {
		//plus(5, 3);
		int sum = plus(5, 3);
		double sum2 = plus(5.0, 3.0);
		System.out.println("5+3=" + sum);
		System.out.println("5.0+3.0=" + sum2);
	}
}
