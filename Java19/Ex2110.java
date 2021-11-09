package day21;

public class Ex2110 {
	static boolean divider(int a, int b) {
		try {
			int result = a / b;
			System.out.println("나눗셈 결과는 : " + result);
			return true;
		} catch(ArithmeticException e) {
			e.printStackTrace();   // 내가 '빨간글' 출력.
			return false;
		} finally {
			System.out.println("내가 바로 가장 마지막으로 무조건!!! 실행되는 문장~");
		}
	}
	
	public static void main(String[] args) {
		if(divider(4,1)) 
			System.out.println("연산 성공!");
		else
			System.out.println("연산 실패.");
		
		System.out.println("프로그램 정상 종료됨.");
	}
}










