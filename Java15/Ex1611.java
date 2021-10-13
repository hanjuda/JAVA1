package day16;

// String 클래스 연습3. 두 문자열의 결합 : ① +연산자 ② concat() 메서드.
public class Ex1611 {
	public static void main(String[] args) {
		String s1 = "YGacademy.com";
		String s2 = "55959500";
		
		// +연산자
//		s1 += s2;        // s1 = s1 + s2;
//		System.out.println(s1);     // YGacademy.com55959500
		
		// concat()메서드                      // 문자열 "결합"(Concatenation)
		s1 = s1.concat(s2);  // 이해 : concat()메서드는 리턴타입을 왜 
							 // 	  String으로 할 수밖에 없었을까?
		System.out.println(s1);     // YGacademy.com55959500
	}
}










