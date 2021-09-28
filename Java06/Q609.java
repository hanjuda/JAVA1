package day6;
														// 4:03~
// Q609. (실행결과) 1 -4 9 -16 25 -36 49 -64 81 -100
public class Q609 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
			System.out.print(i*i*(i%2==0 ? -1 : 1) + " ");
	}
}
 