package day19;

class A6 {
	int num;
	int num2;
	A6() {
		num = 0;        // (굳이 안 써도 되지만)
	}
	A6(int num) {
		this.num = num;
	}
	A6(int num, int num2) {
		this(num);		// 이해: 23번행(55)->num -> this(55); 이 실행됨.
		// 또는 this.num = num;
		this.num2 = num2;
	}	
}

public class Ex1905 {
	public static void main(String[] args) {
//		A6 a6 = new A6(30);       // a6.num ---> 30 
//		A6 a6b = new A6();		  // a6b.num --> 0 (개발자의 의도)
		A6 a6c = new A6(55,30);	  // (의도) a6c.num-->55 , a6c.num2-->30
		System.out.println(a6c.num);
		System.out.println(a6c.num2);
		
	}
}









