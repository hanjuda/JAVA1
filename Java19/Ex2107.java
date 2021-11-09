package day21;

public class Ex2107 {    
	public static void main(String[] args) {
		Object arr = new int[5];  // (이해) '된다' (Object는 모든 클래스들의 최고조상클래스)
		String str = (String)arr; // (이해) "int형배열객체의 참조값을 String타입으로 형변환" --> X (예외발생)
								  // ClassCastException
					// 예외발생 ---> ①'빨간글' ②프로그램실행중지   
		System.out.println("str:" + str);
	}
}
