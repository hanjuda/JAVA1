package day2;

// 실수리터럴(5.0f와 5.0), 문자리터럴(홑따옴표 '), 문자열리터럴(따옴표 ")
public class Ex203 {
	public static void main(String[] args) {
		double d = 5.0f;   // (이해) double d = (float)5.0; 과 다름.
		//float f = 5.0;   // ERR. 5.0이 8바이트 공간에 (실제) 만들어지기 때문.
		
		char ch = 'A';
		//char ch2 = "A";   // ERR. (이해) '한 문자'인데 왜?
		String s = "Hello";
		//String s2 = 'Hello';  // ERR.
	}
}








