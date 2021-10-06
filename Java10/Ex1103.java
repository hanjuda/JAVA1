package day11;

class Dog {
	String name;     // 이해 : 지역변수가 아님. (나중에)
	void bark() {
		System.out.print(name + ": ");  // 한 '울타리'(클래스) 안에 있는 변수를 마음껏 사용!
		System.out.println("멍멍!");
	}
}

public class Ex1103 {
	public static void main(String[] args) {
		Dog dog1;			// Dog 객체를 가리킬 수 있는 참조변수 dog1을 선언.
		dog1 = new Dog(); 	// Dog 객체를 생성해서 dog1이 가리키도록.
		Dog dog2;
		dog2 = new Dog();
		
		dog1.name = "맥스";
		dog1.bark();
		dog2.name = "센";
		dog2.bark();
	}
}









