package day6;

// Ex603. num의 값이 '소수(Prime Number)'에 해당하는지.
public class Ex603 {
	public static void main(String[] args) {
		for(int num=1; num<=100; num++) {
			int cnt = 0;
			for(int i=1; i<=num; i++) {
				if(num % i == 0) {
					cnt++;
				}
			}
			if(cnt==2)
				System.out.println(num + "은(는) 소수임.");
		}
	}
}


