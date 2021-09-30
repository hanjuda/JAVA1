package day8;

import java.util.Arrays;

//Ex805.	난수 발생(-3 ~ +3) 값을 크기가 6인 배열에 채워서 배열 내용 출력 후,
//모든 요소의 값을 (+)로 만든 후 다시 한번 배열 내용을 출력.
//(실행결과) 변경 전 : [-2, 0, 1, -1, 3, -3]
//	   변경 후 : [2, 0, 1, 1, 3, 3]
public class Ex805 {
	public static void main(String[] args) {
//		System.out.println( (int)(Math.random()*7)-3 );
		int[] arr = new int[6];
		for(int i=0; i<=arr.length-1; i++)
			arr[i] = (int)(Math.random()*7)-3;

		System.out.println("변경 전 : " + Arrays.toString(arr));

		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]<0)
				arr[i] *= -1;   // 또는 arr[i] = -arr[i];
		}
		
		System.out.println("변경 후 : " + Arrays.toString(arr));
	}
}









