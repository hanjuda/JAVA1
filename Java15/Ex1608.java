package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex1608 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Circle c1;
		Circle c2;
		String s3;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("circle.dat"));
		c1 = (Circle)ois.readObject();
		c2 = (Circle)ois.readObject();
		s3 = (String)ois.readObject();
		ois.close();
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		System.out.println("s3:" + s3);
	}
}











