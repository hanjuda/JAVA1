package day13;

class AAA {
	int numI;    // 인스턴스변수
	static int numC;	// 클래스변수
	
	AAA(int numI, int numC) {
		this.numI = numI;
		this.numC = numC;
	}
	
	void show() {  // 인스턴스메서드에서, 인스턴스변수와 클래스변수를 사용 (O)
		System.out.println("show() - numI : " + numI);
		System.out.println("show() - numC : " + numC);
	}
	
	static void show2() { // 클래스메서드에서, 인스턴스변수 사용 X / 클래스변수 사용 O
//		System.out.println("show() - numI : " + numI);
		System.out.println("show() - numC : " + numC);
	}
}
public class Ex1302 {
	public static void main(String[] args) {
		AAA aaa = new AAA(5,10);
		aaa.show();
		AAA.show2();
	}
}


















