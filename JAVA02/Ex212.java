package day2;

// [정리] 문자열의 비교는 "문자열1.equals(문자열2)" 
public class Ex212 {
	public static void main(String[] args) {
		String a = "abc";
		String b = new String("abc");  // (나중에)
		System.out.println(a + " " + b);
		
		System.out.println(a==b);  // '문자열 내용의 비교'가 아님! (나중에)
		System.out.println(a.equals(b));  // 지금 이해
		System.out.println(b.equals(a));  // 지금 이해
	}
}









