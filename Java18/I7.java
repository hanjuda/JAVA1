package day20;

public interface I7 {
	int num2 = 55;
	int num = 5; // "무조건 public static final"  ------> 참고로, 자바에서 상수는 주로 public static final로 함. (Math.PI) 
	void m();   // "무조건 public abstract"
}

abstract class AC7 {
	int num = 5;
	abstract void m();
}




