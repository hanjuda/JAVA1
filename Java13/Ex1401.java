package day14;

import java.util.Arrays;

public class Ex1401 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		for(int i=1; i<=3; i++) {
			arr[i-1] = i*10;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[4];
										// 게임 소스.
		for(int i=0; i<=2; i++) {
			arr2[i] = arr[i];
		}
	
		for(int i=0; i<=2; i++) {
			arr2[3] += arr2[i];
		}
		
		arr = arr2;
		
		System.out.println(Arrays.toString(arr));
	}
}










