package day20;

class A {    // 부모클래스
	void m() { System.out.println("m()."); }
}
class B1 extends A {   // 자식클래스#1
	void m1() { System.out.println("m1()."); }
}
class B2 extends A {   // 자식클래스#2
	void m2() { System.out.println("m2()."); }
}
public class Ex2001 {
	public static void main(String[] args) {
		A obj = new B1();   // 부모클래스 타입의 참조변수가 자식클래스의 객체를 가리키고 있다 (다형성)
		A obj2 = new B2();
		
		// 이해1. obj -----> A객체가 예상되는 상황. 따라서, obj.m() 은 호출할 수 있다/없다
		
		// 이해2. obj -----> A객체가 예상되는 상황. 따라서, obj.m1() 은 호출할 수 있다/없다 
		
		// 이해3. obj2 ----> A객체가 예상되는 상황. 그런데, 실제로 만들어진 건 B2객체.
		// 이해3-1. obj2.m() 은 호출할 수 있다/없다
		
		// 이해3-2. obj2.m2() 는 호출할 수 있다/없다
		//obj2.m2();	// ERR --> 왜? 1) 만들어진 실체(=객체)에 m2()라는 메서드가 존재하지 않아서 일까요?
					//            2) 참조변수의 타입이 클래스A였기 때문에 일까요?
		((B2)obj2).m2();   // "참조값을 형변환"
		((B1)obj).m1();   // "참조값을 형변환"
		
		//obj -------> ? / obj2 ---------> ?
		// 상황: obj가 B2객체를 가리키고 있다고 착각.
		// 해결: 보다 안전하게, instanceof연산자를 사용.
//		((B2)obj).m2();   // Dangerous!
		System.out.println("--------------------");
		if(obj instanceof B2) {
			((B2)obj).m2();
		} else if(obj instanceof B1) {
			((B1)obj).m1();
		}
		
		// (고급) a instanceof B ----------> '父-子'의 상황이 고려됨.
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B1);
		System.out.println(obj instanceof B2);
		System.out.println(obj2 instanceof A);
		System.out.println(obj2 instanceof B1);
		System.out.println(obj2 instanceof B2);
		
	}
}













