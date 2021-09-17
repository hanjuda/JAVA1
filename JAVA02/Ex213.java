package day2;

public class Ex213 {
	public static void main(String[] args) {
//		1) 변수 num과 num2를 선언.
		int num, num2;
		
//		2) num에 10이라는 값을 대입.
		num = 10;
		
//		3) num이 "5보다 크고 15보다 작은지"를 출력. // true
		System.out.println(num>5 && num<15);
		
//		4) num2에 num%3의 값을 대입.
		num2 = num % 3;
		
//		5) num+num2가 "짝수이고 0보다 큰지"를 출력. // false
		System.out.println((num+num2)%2==0 && (num+num2)>0 );
		
	}
}







