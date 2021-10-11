package day14;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		// "for-each문" ('향상된 for문')
//		int[] arr = { 100, 200, 300 };   // (간편법)
//		for(int n : arr) {
//			System.out.println(n);
//		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		for(int n : list) {
			System.out.println(n);
		}
		
	}
}









