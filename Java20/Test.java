package day22;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println("<성능측정>");
		long start, end;
		start = System.currentTimeMillis();
		for(int i=1; i<=500_000; i++)
			list1.add(0,i);
		end = System.currentTimeMillis();
		
		System.out.println("걸린 시간 : " + ((end-start)/1000.0) + "초.");
	}
}







