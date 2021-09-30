package day8;

import java.util.Arrays;

//Ex806.	난D수발생(1 ~ 100) 값을 크기가 6인 배열에 채워서 배열 내용 출력 후,
//(+고급 : 이렇게 채워진 배열 내 중복값이 없도록)
//1) 제일 큰 값을 출력
//2) 두 번째로 큰 값을 출력  -- 고급.
//(실행결과) [17, 57, 33, 94, 81, 5]
//제일 큰 값 : 94
//두 번째로 큰 값 : 81
public class Ex806 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for(int i=0; i<=arr.length-1; i++)
			arr[i] = (int)(Math.random()*100)+1;   // 1 ~ 100

		System.out.println(Arrays.toString(arr));
		
		int maxIndex = 0;   // 최대값의 인덱스번호
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		arr[maxIndex] *= -1;
		
		int max = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("두 번째로 큰 값 : " + max);
	}
}










