package day19;

// Ex1906 : 심심하신 분들만.
class A7 {
	int num;
	A7() {							// 1
		System.out.println("A.");
	}
	A7(int num) {					// 2
		this();
		System.out.println("B.");
		this.num = num;
	}
}

class B7 extends A7 {
	int num2;
	B7(int num) {					// 3
		super(num);
		System.out.println("C.");
		this.num2 = 10; 
	}
	B7(int num, int num2) {			// 4
		this(num);
		System.out.println("D.");
	}
}

public class Ex1906 {
	public static void main(String[] args) {
		B7 obj = new B7(1,2);
		
	}
}






