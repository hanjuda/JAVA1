package day6;

//Q603. 1부터 100까지의 정수 중 일의 자리가 3, 6, 또는 9인 수만 출력.
public class Q603 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.print(i + " ");
			}
		}
	}
}
