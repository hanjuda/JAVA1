package day3;

// 증감연산자(++,--) --> 변수명앞에("전위") / 변수명뒤에("후위")
public class Ex306 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(n++);  // 5
		System.out.println(n++);  // 6
		System.out.println(n);    // 7
		
		System.out.println(--n);  // 6
		System.out.println(--n);  // 5
		System.out.println(n);    // 5
	}
}








