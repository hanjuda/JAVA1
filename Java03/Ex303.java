package day3;

public class Ex303 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(5<a && a<15);   // _____
		System.out.println((5<a && a<15) && (a%2==0));  // _____
		a = 4;
		System.out.println((5<a && a<15) && (a%2==0));  // _____
		System.out.println((5<a && a<15) || (a%2==0));  // _____
		
		// 이하 고급(비트연산자)
		int b = 0b1111;
		int c = 0b0101;
		System.out.println(b|c);   // ____
		System.out.println(b&c);   // ____
		System.out.println(b^c);   // ____
	}
}











