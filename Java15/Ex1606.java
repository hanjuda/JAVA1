package day16;

class Adder {
	private int num;
	Adder() { num = 0; }
	Adder(int num) { this.num = num; }
	Adder add(int num) {
		this.num += num;
		return this;  // this : "객체 자기자신"(의 참조값)
					  // Adder클래스 내에서 this : Adder객체 자기자신(의 참조값)
					  // 이 메서드의 리턴타입은 Adder -> Adder객체의 참조값을 리턴 !
	}
	void showResult() {
		System.out.println("result: " + num);
	}
}

public class Ex1606 {
	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.add(1).add(3).add(5).showResult();
	}
}













