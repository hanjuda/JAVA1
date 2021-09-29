package day7;

public class Ex708 {
	public static void main(String[] args) {
		int[] arr;         // ★ int형 배열 객체를 가리킬 변수 arr을 선언. (나중에 이해)
		arr = new int[3];  // ★ int형 배열(사이즈:3) 객체를 생성해서 변수 arr과 연결. (나중에 이해)

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		int total = 0;
		for(int i=0; i<=2; i++) {
			total += arr[i]; 
		}
		System.out.println("총합 : " + total);
		
		int avg = total / 3;
		System.out.println("평균 : " + avg);
	}
}









