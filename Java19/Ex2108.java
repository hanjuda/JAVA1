package day21;

public class Ex2108 {
	public static void main(String[] args) {
		String s = null;   // null : '아무 객체도 참조하고 있지 않음'
		int len = s.length();   // NullPointerException
							// 예외발생 ---> ①'빨간글' ②프로그램실행종료
		System.out.println("문자열의 길이 : " + len);
	}
}
