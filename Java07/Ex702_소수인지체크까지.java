package day7;

//Ex702.	소수만 입력 후 모든 합계를 출력하는 프로그램.
//(실행결과) 소수를 입력 : 2 (엔터)
//	   소수를 입력 : 7 (엔터)
//	   소수를 입력 : 13 (엔터)
//	   소수를 입력 : 8 (엔터)                                 // 8의 약수 : 1, 2, 4, 8 -> 소수X
//	   지금까지 입력한 소수들의 합은 22입니다.		  // 소수X인 수는 더하지 마세요.
public class Ex702 {
	public static void main(String[] args) {
		int num = 8;
		int cnt = 0;
		// 소수(prime number) 해당 여부를 출력:
		// 7 을 1,2,3,4,5,6,7로 나눠봐서 -> 나누어 떨어지는 경우(=나머지가 0인 경우) 가 딱 2번이라면.
		// 														그러면 소수
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(num + "는 소수.");
		}
		
	}
}






