package day16;

public class Ex1604 {
	public static void main(String[] args) {
		// 이해 : 문자열 객체는 Immutable 객체(내용의 수정이 불가능한 객체).
		String s1 = new String("정처산기");
		String s2 = new String("/웹개발");
		System.out.println(s1.hashCode());  // 문자열 결합 전 s1의 참조값.
		s1 += s2;           //s1 = s1 + s2;
		
		System.out.println(s1);   // 정처산기/웹개발
		System.out.println(s1.hashCode());  // 문자열 결합 전 s1의 참조값.
		
		// 참고. 자바는 나름 최적화하려고 함.
		String s3 = s1 + ":" + s2 + ":" + 3 + "/" + 4.5;
	}
}









