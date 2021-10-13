package day16;

// String 클래스 연습2. 
// 두 문자열 "yg" 와 "academy"라는 문자열이 있을 때,
// 둘 중 어느 문자열이 더 앞서는지(사전편찬순) 출력.
// (실행결과) academy가 앞섬.

public class Ex1610 {
	public static void main(String[] args) {
		String s1 = "yg";
		String s2 = "academy";
		
		if(s1.compareTo(s2)>0) {
			System.out.println(s2 + "가 앞섬.");
		} else if(s1.compareTo(s2)<0) {
			System.out.println(s1 + "가 앞섬.");
		} else {  // ==0
			System.out.println("같음.");
		}
	}
}









