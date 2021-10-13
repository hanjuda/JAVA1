package day16;

public class Ex1601 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		for(int i=0; i<=1; i++)
			arr[0][i] = i+1;
		arr[1] = new int[4];
		for(int i=0; i<=3; i++)
			arr[1][i] = i+3;
		arr[2] = new int[3];
		for(int i=0; i<=2; i++)
			arr[2][i] = i+7; 
		
//		int[][] arr = new int[3][];
//		arr[0] = new int[] { 1,2 };
//		arr[1] = new int[] { 3,4,5,6 };
//		arr[2] = new int[] { 7,8,9 };
		
//		int[][] arr = {
//				{1,2},
//				{3,4,5,6},
//				{7,8,9}
//		};
		
//		int[][] arr = new int[3][];
//		for(int i=0; i<=2; i++)
//			arr[i] = new int[3];
		
		for(int i=0; i<=arr.length-1; i++) {       // 이해 : arr.length
			for(int j=0; j<=arr[i].length-1; j++) {   // 이해 : arr[i].length
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


