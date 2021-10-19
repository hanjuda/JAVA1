package day19;

class A8 {
	void m1() { System.out.println("m1"); }
}

class B8 extends A8 {
	void m2() { System.out.println("m2"); }
}

public class Ex1907 {
	public static void main(String[] args) {
		// [일단은 암기하세요]
		// 1. "부모클래스 타입의 참조변수가 ..."
		A8 obj = new B8();   // (O)    // "다형성"
		// B8 obj = new A8();   // (X)
		
		// 2. "父-子"
		// 부-자 는 되고
		// 자-부 는 안 된다
		
		// 3. (그림) - 애매하니까.
		
		obj.m1();
		//obj.m2();		// ERR. "참조값은 맞는데 [타입]이 다른 상황 ---> 그래서 형 변환이 필요한 상황!" (나중에)
		((B8)obj).m2(); // (고급) 버려도 돼요.
						// (참고) 이때 obj가 참조하는 객체가 실제로 B8로 생성된 객체인지 여부를
						//       확인하기 위해서 instanceof연산자를 사용. (질문/구글링)
	}
}











