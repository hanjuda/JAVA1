package day11;

class Circle2 {
	int r;   // 반지름
	int x;	 // 중심점의 x좌표
	int y;	 // 중심점의 y좌표
	double area() {
		return 3.14 * r * r;
	}
}
public class Ex1105 {
	public static void main(String[] args) {
		Circle2 c2 = new Circle2();
		c2.r = 5;
		c2.x = 1;
		c2.y = 1;
		System.out.println("원2 : 반지름이 "+c2.r+"이고 중심점 좌표가 ("+c2.x+","+c2.y+")인 원(넓이 : "+c2.area()+")입니다.");
	}
}


