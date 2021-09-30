package day8;

//Ex803.	난수 발생(1~10) 값을 크기가 6인 배열에 채운 후,
//1) 배열의 내용 출력 (Arrays.toString() 사용 X)
//2) 평균 값을 출력 
//3) 평균보다 큰 요소들을 출력.  "평균보다 큰 요소 : __ __ ..."
public class Ex803 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*10)+1;  // 1 ~ 10
		}

		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();  // 줄바꿈
		
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			sum += arr[i];
		}
		double avg = ((double)sum/arr.length);
		System.out.println("평균 : " + avg);
		
		System.out.print("평균보다 큰 요소 : ");
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] > avg) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}









