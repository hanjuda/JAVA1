package day16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Circle implements Serializable {
	int r;
	Circle(int r) { this.r = r; }
	public String toString() {
		return "원 객체 [반지름:" + r + "]";
	}
}
// [객체 단위로 저장]하기 위해서는:
// 1) ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(파일이름));
// 2) 위 1) 처럼 쓰면 빨간줄 ----> "add throws declaration" 선택.
// 3) 저장하려는 객체의 클래스 ---> "implements Serializable" 

public class Ex1607 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Circle c1 = new Circle(5);   // 반지름이 5인 원 객체
		Circle c2 = new Circle(10);  // 반지름이 10인 원 객체

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("circle.dat"));
		oos.writeObject(c1);
		oos.writeObject(c2);
		oos.writeObject(new String("저장하고 싶은 문자열"));
		oos.close();
	}
}












