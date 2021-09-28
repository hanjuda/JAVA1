package day6;

// Q606. 1부터 100까지의 정수 중 7의 배수가 아니면서 13의 배수가 아닌 수만 출력.(continue를 사용)
public class Q606 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%7==0 || i%13==0) continue;
			System.out.print(i + " ");
		}
	}
}
