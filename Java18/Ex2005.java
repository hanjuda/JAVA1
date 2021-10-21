package day20;

abstract class Parent {
	abstract void message();
}
class Child1 extends Parent {
	@Override
	void message() { System.out.println("첫 번째 클래스"); }
}
class Child2 extends Parent {
	@Override
	void message() { System.out.println("두 번째 클래스"); }
}

//(추가:고급연습)	추상클래스 타입의 배열(사이즈 : 5)를 선언,
//		난수발생해서 이 배열에 두 가지 객체(의 참조값)들을 채워주세요.
//		그런 후에 반복문을 사용해서 모든 요소들의 message()를 호출해보세요.
//(실행결과)	첫 번째 클래스
//		두 번째 클래스
//		두 번째 클래스
//		첫 번째 클래스
//		두 번째 클래스

public class Ex2005 {
	public static void main(String[] args) {
		Parent[] arr = new Parent[2];
		arr[0] = new Child1();
		arr[1] = new Child2();
		arr[0].message();
		arr[1].message();
		
//		Child1 obj1 = new Child1();
//		Child2 obj2 = new Child2();
//		obj1.message();
//		obj2.message();

	}
}













