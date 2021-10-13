package day16;

import java.util.Scanner;

class AA { }
public class Ex1603 {
	public static void main(String[] args) {
		// 문자열 객체는 상수적 성격을 ! --> "문자열 객체는 내용의 수정이 불가능한 객체!"
									  // "Immutable Object(객체)"
		String s1 = "문자열";
		String s2 = "문자열";
		System.out.println("s1:" + s1);    // s1.toString() -> 문자열 객체의 .toString()은
									//                 그 내용을 리턴하도록 정의되어 있음.
		// 문자열 객체의 참조값을 보고 싶으면, .hashCode()를 이용해보세요.
		System.out.println(s1.hashCode());  // 객체의 참조값 --> 기본적으로 .hashCode()
		System.out.println(s2.hashCode());
		
		s2 = "문자열"+"B";
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println(s2.hashCode());
		
//		AA aa = new AA();
//		System.out.println(aa);    // aa.toString() -> 그 외의 클래스는
//									//                 참조값을 보여주는 문장을 리턴한다. 
	}
}








