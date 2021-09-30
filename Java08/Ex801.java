package day8;

import java.util.Arrays;

// Ex801(=Ex710re)	5개의 정수를 담을 수 있는 배열을 만들고,
// 난수발생(1~10) / 해서 5개의 정수를 랜덤하게 배열에 채워서, /   ---> Arrays.toString()
// 1) 반복문 -> 모든 요소 출력 : 형식 "(3 9 8 4 5)"
// 2) 이 배열에서 홀수의 개수와 짝수의 개수 출력:
//	  ex) [3, 9, 8, 4, 5] --> "홀수-3개, 짝수-2개"

public class Ex801 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<=4; i++) {   // i : 0 ~ 4
			// 난수발생 1~10
			arr[i] = (int)(Math.random()*10)+1;
		}
		
		// System.out.println(Arrays.toString(arr));
		
		System.out.print("[");
		for(int i=0; i<=4; i++) {
			System.out.print(arr[i] + (i<4 ? ", " : ""));
		}
		System.out.println("]");
		
		System.out.print("(");
		for(int i=0; i<=4; i++) {
			System.out.print(arr[i] + (i<4 ? " " : ""));
		}
		System.out.println(")");
		
		int odd = 0;   // 홀수의 개수
		int even = 0;  // 짝수의 개수
		
		for(int i=0; i<=4; i++) {
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("홀수-" + odd + "개, 짝수-" + even + "개");
	}	
}








