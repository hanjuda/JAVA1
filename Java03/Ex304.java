package day3;

// Ex304(참고) : S.C.E. "Short-Circuit Evaluation"
public class Ex304 {
	public static void main(String[] args) {
		int num = 5;
		if(num>3 || ++num==6) {
			System.out.println("num : " + num);
		}
		if(num<3 && ++num==6) {
			System.out.println("2) num : " + num);
		}
		System.out.println("3) num : " + num);
	}
}








