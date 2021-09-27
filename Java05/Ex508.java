package day5;

//Ex508(고급)
//	n : 5 (엔터)
//	1				1
//	0 1				2 3
//	1 0 1			3 4 5
//	0 1 0 1			4 5 6 7
//	1 0 1 0 1		5 6 7 8 9
public class Ex508 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=1; i<=n; i++) {
			// i부터 시작해서 숫자를 i개 출력.
			for(int j=i; j<=2*i-1; j++) {
				System.out.print(j%2 + " ");
			}
			System.out.println();  // 줄바꿈
		}
	}
}








