package day21;

import java.util.Arrays;

public class Ex2106 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=1; i<=5; i++) {
			arr[i] = i*10;			// ArrayIndexOutOfBoundsException
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("프로그램 정상 종료됨.");
	}
}







