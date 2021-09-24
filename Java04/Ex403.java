package day4;

public class Ex403 {
	public static void main(String[] args) {
		int i;
		// (1) 1 2 3 4 5
		// for
		for(i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
		// while
		i=1;
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		// do-while
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i<=5);
		
		System.out.println();  // 줄바꿈.

		// (2) 9 7 5 3 1
		for(i=9; i>=1; i-=2) {
			System.out.print(i + " ");
		}
		i=9;
		while(i>=1) {
			System.out.print(i + " ");
			i-=2;
		}
		i=9;
		do {
			System.out.print(i + " ");
			i-=2;
		} while(i>=1);
		
		System.out.println();  // 줄바꿈.
		
		// (3) 9 6 3 0 -3
		for(i=9; i>=-3; i-=3) {
			System.out.print(i + " ");
		}
		i=9;
		while(i>=-3) {
			System.out.print(i + " ");
			i-=3;
		}
		i=9;
		do {
			System.out.print(i + " ");
			i-=3;
		} while(i>=-3);
		
	}
}








