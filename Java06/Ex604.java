package day6;

public class Ex604 {
	public static void main(String[] args) {
		// 0,1,2 중에서 하나를.
		// Math.random() : "0.0 이상 1.0 미만"의 수를 하나 골라줌.
		//System.out.println(Math.random());
		int n = (int)(Math.random()*3);
		System.out.println(n);   // 0 , 1 , 2
		
		// 문자열 배열
		String[] arr = {"세모", "네모", "동그라미"};
//		for(int i=0; i<=2; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(arr[n]);
		
		// 문자열 비교 : ".equals()" --> "문자열1.equals(문자열2)"
		if(arr[n].equals("동그라미")) {
			System.out.println("이번에 선택된 건 동그라미 입니다!");
		}
	}
}











