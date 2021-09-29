package day7;

import java.util.Random;
						//   3 4 5 6 7 8 <---- 0 1 2 3 4 5 + (+3)
//Ex707. Random클래스를 이용해서, 3 이상 8 이하의 정수 20개를 출력.
//(고급) 위 3가지 모두를 사용.
public class Ex707 {
	public static void main(String[] args) {
		Random rd = new Random();
		for(int i=1; i<=20; i++) 
			System.out.print(" " + (int)(rd.nextFloat()*6+3) );
		System.out.println();
		for(int i=1; i<=20; i++) {
			int n = rd.nextInt();  // -21억쯤 ~ +21억쯤
			n = n<0 ? -n : n;     // 양수로 만들고.   0 ~ +21억쯤
			n = n % 6;		  // 0부터 5까지로 만들고.
			n = n + 3;		  // 3부터 8까지로 만들고.
			System.out.print(" " + n);
		}
		System.out.println();
		for(int i=1; i<=20; i++)
			System.out.print(" " + (rd.nextInt(6)+3));  
		
	}
}








