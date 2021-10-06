package day11;

/*
	★★★★★ this키워드 : "객체 자기 자신(의 참조값)" (나중에)
	--------> 생성자의 작성은 기계적으로(취업하실 때까지)
*/
class ClassA {
	int a;
	int b;
	double c;
	
	ClassA(int a, int b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	ClassA(int a, int b) {
		this.a = a;
		this.b = b;
		c = 0.0;
	}
	
	void show() {
		System.out.println(a + " / " + b + " / " + c);
	}
}
public class Ex1107 {
	public static void main(String[] args) {
		ClassA obj = new ClassA(1, 2, 3.0);
		obj.show();
		ClassA obj2 = new ClassA(10, 20);
		obj2.show();
	}
}







