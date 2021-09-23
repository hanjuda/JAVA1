package day3;

public class Ex302 {
	public static void main(String[] args) {
		int num = 7;   // 0111
		// (1) num이 홀수 (2) num이 7, 이 둘 중 하나만 만족하는지?
		// ----> (1)만족(2)불만족 또는 (1)불만족(2)만족
		System.out.println((num%2!=0) ^ (num==7));
		
		int num2 = 5;   // 0101
		System.out.println(num ^ num2);   // 0010 = 2
	}
}










