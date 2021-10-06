package day10;

public class Ex1004 {
	static int ret10() {    // "리턴타입" : "리턴값"의 데이터타입.
		return 10;    // 10을 "리턴"함.
	}
	static String retHello(String name) {
		return name + "님, 안녕하세요";
	}
	public static void main(String[] args) {
		int num = ret10() + ret10();
		System.out.println(num);   // ___
		int num2 = ret10() + ret10() * ret10();
		System.out.println(num2);  // ___
		
		System.out.println( ret10() ); // 10 출력
		System.out.println( retHello("YG") );  // "YG님, 안녕하세요"
	}
}







