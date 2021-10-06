package day10;

//★★Ex1007.	연습. 메서드 : [파라미터로 int형 배열을 받아서, 모든 요소의 합계를 리턴하는 메서드]
//		(실행결과) 정수 몇 개? 3 (엔터)     --------> 사이즈 3인 배열 객체 생성.
//			   입력1 : 5 (엔터)
//			   입력2 : 8 (엔터)
//			   입력3 : 2 (엔터)
//			   합계 = 15		    --------> 메서드에 배열 전달.
public class Ex1007 {
	static int sum(int[] a) {    // 실질상, int[] a = arr;
		int sum = 0;
		for(int i=0; i<=a.length-1; i++) {
			sum += a[i]; 
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 3;    // "3"개 입력.
		int[] arr = new int[n];
		arr[0] = 5;
		arr[1] = 8;
		arr[2] = 2;
		System.out.println("합계 = " + sum(arr));
	}
}










