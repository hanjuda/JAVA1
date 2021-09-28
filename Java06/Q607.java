package day6;

// Q607. 1부터 100까지의 정수 중 7의 배수를 '내림차순'으로 출력.(큰 수부터 출력)
public class Q607 {
	public static void main(String[] args) {
		for(int i=100; i>=1; i--) {
			if(i%7==0) {
				System.out.print(i + " ");
			}
		}
	}
}
