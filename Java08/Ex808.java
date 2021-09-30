package day8;

import java.util.Arrays;

// Ex808. 고급연습5. "로또번호생성기" - int 타입의 배열(사이즈:6) 사용 / 
// 고급 = 중복체크 / 
// 최고급 = 정렬 직접 구현
public class Ex808 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for(int i=0; i<=arr.length-1; i++) {
			// 난수발생  1 ~ 45  ----> 0 ~ 44 ------> 1 ~ 45
			int num = (int)(Math.random()*45) + 1;
			int cnt = 0;
			for(int j=0; j<=i-1; j++) {
				// num vs arr[j]
				if(num==arr[j]) {
					cnt++;
				}
			}
			if(cnt==0)
				arr[i] = num;
			else
				i--;
		}
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		// i : 5 ~ 1
		// j : 0 ~ (i-1)
		// arr[j] > arr[j+1] ---> Then, swap.
		for(int i=5; i>=1; i--) {
			for(int j=0; j<=i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}
}








