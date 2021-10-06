package day10;

public class Ex1001 {
	static void printStars(int n, char c) {    // 이해: int n = 4;
		for(int i=1; i<=n; i++)
			System.out.print(c);
		System.out.println();
	}
	public static void main(String[] args) {
		printStars(4, '*');   	// ****
		printStars(6, '★');   	// ★★★★★★
	}
}







