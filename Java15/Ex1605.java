package day16;

// StringBuilder 클래스 : 초고속으로 문자열 연산(+ 등)을! BUT "thread-safe하지 않음(나중에)"
// <-> StringBuffer 클래스 : 속도는 좀 느림. BUT "thread-safe함(나중에)"
// (이해) 이 두 클래스의 사용법은 완전히 동일함!!!					
public class Ex1605 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();   // ""
		StringBuffer sb = new StringBuffer();     // ""
		sb.append("곧 ");
		sb.append(2);
		sb.append("번째 쉬는시간");
		sb.append("입니다");
		sb.append('!');
		System.out.println(sb.toString());
	}
}







