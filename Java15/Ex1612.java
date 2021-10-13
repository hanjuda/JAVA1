package day16;

// contains(문자열2) : 내 안에 문자열2의 포함여부.
// indexOf(문자열2) : 내 안에서 문자열2의 위치(인덱스). 만약에 없다면 -1.
// startsWith(문자열2) / endsWith(문자열2) : 그걸로 시작하는지 / 그걸로 끝나는지
// replace(옛날문자, 새로운문자) : 옛날문자를 모두 새로운문자로 변경
// substring(정수값) : 인덱스번호 정수값부터 끝까지 부분문자열을 리턴.
// substring(정수값1, 정수값2) : 인덱스번호 정수값1부터 정수값2-1까지 부문문자열을 리턴.

public class Ex1612 {
	public static void main(String[] args) {
		String s1 = "ABC BAA";
		String s2 = "BC";

		System.out.println("s1에 s2가 포함되어 있는지 : " + s1.contains(s2));
		System.out.println("s1에 AC가 포함되어 있는지 : " + s1.contains("AC"));

		String s3 = "C BA";
		System.out.println("s1에서 s3의 위치(인덱스) : " + s1.indexOf(s3));
		System.out.println("s1에서 BBB의 위치(인덱스) : " + s1.indexOf("BBB"));

		System.out.println(s1.startsWith("AB"));
		System.out.println(s1.endsWith("AA"));
		
		// s1에서 B ---> b
		s1 = s1.replace('B', 'b');   // 이해 : 리턴타입이 String인 이유?
		System.out.println(s1);    // AbC bAA
		
		String s4 = s1.substring(4);   // 인덱스번호 4부터 잘라낸 부분문자열
		System.out.println(s4);
		
		// s1(AbC bAA)으로부터 bC만 뽑으려면. (인덱스 1 ~ 인덱스 2)
		String s5 = s1.substring(1,3);  // 이해 : 1부터 시작해서 3이 되기 전까지.
		System.out.println(s5);
	}
}










