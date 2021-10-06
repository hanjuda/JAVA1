package day10;

//★Ex1006.	연습.
//메서드 : [3개의 정수를 파라미터로 받아서, 이들의 평균값을 리턴하는 메서드]
//(실행결과) 입력1 : 15 (엔터)
//	   입력2 : 7 (엔터)
//	   입력3 : 29 (엔터)
//	   평균값 = 17.0
public class Ex1006 {
	static double avg(int a, int b, int c) {
		return (a+b+c)/3.0;
	}
	public static void main(String[] args) {
		int a = 15;
		int b = 7;
		int c = 29;
		System.out.println("평균값 = " + avg(a,b,c));
	}
}








