package day20;

// '추상'(abstract) -> '미완성' 딱지. 
// 메서드 정의시, 중괄호{} 대신에 세미콜론(;)을 / 리턴타입 앞에 abstract 키워드를.
// 추상메서드를 하나라도 포함하고 있는 클래스는 (미완성설계도이므로) abstract 키워드를 반드시.
abstract class AC {   // 추상클래스
	void m1() { 
		System.out.println("m1()");
	}
	abstract void m2();    // 추상메서드 : body가 아직 정해지지 않은 메서드.
}
// "추상클래스의 자식클래스에서는 반드시 추상메서드를 구현해야 한다."(X) 
class BC extends AC {
	@Override    // 권장
	void m2() { System.out.println("m2() !"); }
}

public class Ex2003 {
	public static void main(String[] args) {
		// 이해 : 추상클래스로 객체 생성이 가능할까? =완성된 설계도일까?
		//AC ac = new AC();   // ERR. 미완성설계도니까.
		BC obj = new BC();
		obj.m1();
		obj.m2();
		
		// (고급) 추상클래스는 '父-子'의 상황에서 '父'의 역할을 할 수 있다.
		AC obj2 = new BC();     // 이해(고급) : 할 수 있다.
		obj2.m1();
		obj2.m2();
	}
}











