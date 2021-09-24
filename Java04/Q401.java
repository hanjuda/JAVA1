package day4;
 
public class Q401 {
	public static void main(String[] args) {
//		char형 변수에 아무 문자나 하나 대입하고(ex. Y)
		char ch = 'Y';
		
//		1) 이 값이 대문자인지 여부를 출력.
		System.out.println(ch>='A' && ch<='Z');
		
//		2) 이 값이 숫자인지 여부를 출력.
		System.out.println(ch>='0' && ch<='9');
		
//		3) 이 값이 영문자인지 여부를 출력.
		System.out.println((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'));
		
//		4) (만약 대문자라면) 소문자로 만들어서 출력.
		System.out.println((ch>='A' && ch<='Z') ? (char)(ch+('a'-'A')) : ch);
	}				
}








