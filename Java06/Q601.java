package day6;

//Q601. 1부터 100까지의 정수 중 홀수만 출력.
public class Q601 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%2!=0)
				System.out.print(i + " ");
		}
	}
}
