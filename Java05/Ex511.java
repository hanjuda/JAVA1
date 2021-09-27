package day5;

//Ex511.	(실행결과)
//1 1
//2 3
//3 6
//4 10
//----
//1 -1
//2 -3
//3 -6
//4 -10

public class Ex511 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=4) {
			sum += i;
			System.out.println(i + " " + sum);
			i++;
		}
		System.out.println("----");
		i = 1;
		sum = 0;
		while(i<=4) {
			sum -= i;
			System.out.println(i + " " + sum); 
			i++;
		}
	}
}










