package day7;

import java.util.Arrays;

public class Ex709 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=1; i<=10; i++)
			arr[i-1] = i*10;		// i=1: arr[0] = 10;
									// i=2: arr[1] = 20;
									// i=3: arr[2] = 30;
									// ...
									// i=10: arr[9] = 100;
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<=9; i++)
			System.out.print(arr[i] + " ");
		System.out.println();   // 줄바꿈
		
		int sum = 0;
		for(int i=0; i<=9; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}
}














