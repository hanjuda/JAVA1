package day13;

import java.util.Arrays;

class Point {
	int x;   // 인스턴스변수
	int y;   // 인스턴스변수
	static int cnt = 0;   // 클래스변수
	Point(int x, int y) {
		this.x = x;
		this.y = y;
		cnt++;
	}
	double dist(int x2, int y2) {
		int dx = x - x2;
		int dy = y - y2;
		double d = Math.sqrt( dx*dx + dy*dy );
		return d;
	}
	static void showCnt() {   // 클래스메서드
		System.out.println("cnt : " + cnt);
	}
}

public class Ex1301 {
	public static void main(String[] args) {    // main()도 사실은 클래스메서드였다!
		Point.showCnt();
		System.out.println("처음) Point객체의 수 : " + Point.cnt);  // 0
		Point p1 = new Point(1,1);
		Point p2 = new Point(5,4);
		System.out.println("객체생성 후) Point객체의 수 : " + Point.cnt);  // 2
		System.out.println("객체생성 후) Point객체의 수 : " + p1.cnt);  // 2
		System.out.println("객체생성 후) Point객체의 수 : " + p2.cnt);  // 2
		p1.showCnt();
		p2.showCnt();
		System.out.println("두 점 사이의 거리 : " + p1.dist(p2.x, p2.y));
		System.out.println("두 점 사이의 거리 : " + p2.dist(p1.x, p1.y));
		//System.out.println("두 점 사이의 거리 : " + p2.dist(Point.x, Point.y));  // ERR
		
		Point p3 = new Point(-3,4);
		System.out.println("새로운 점까지의 거리 : " + p1.dist(p3.x, p3.y));
		System.out.println("마지막) Point객체의 수 : " + Point.cnt);	  // 3
		
		Point.showCnt();
	}
}













