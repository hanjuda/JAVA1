package day16;

public class Ex1602 {
	public static void main(String[] args) {
		String s1 = "문자열";		// 이해 : 문자열 객체가 생성되었을까?
		String s2 = "문자열";		// 이해 : 문자열 객체가 생성되었을까? ---> [경제성]
		System.out.println(s1==s2);  // true (이해)
		
		String s3 = new String("문자열");  // 이해 : 문자열 객체가 생성되었을까? --> new !
		System.out.println("s3:" + s3);   // 문자열
		
		System.out.println(s1==s3);	// false (이해) ---> s3는 객체가 새롭게 생성된 것!
		System.out.println(s2==s3);	// false (이해) ---> s3는 객체가 새롭게 생성된 것!
		
		
	}
}









