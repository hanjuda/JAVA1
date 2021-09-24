package day4;

public class Q402 {
	public static void main(String[] args) {
		for(int i=2; i<=8; i+=3) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + " * " + j + " = " + (i*j));
				System.out.print("\t");
				System.out.print((i+1) + " * " + j + " = " + ((i+1)*j));
				System.out.print("\t");
				if(i+2<10) {
					System.out.print((i+2) + " * " + j + " = " + ((i+2)*j));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}




