package day8;

import java.util.Arrays;

// Ex807. 고급연습4. "로또번호생성기" - boolean 타입의 배열(사이즈:45) 사용.
// arr : false false false false false false false false false false ....

public class Ex807 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[45];

		for(int i=1; i<=6; i++) { 
			// 난수발생 0 ~ 44
			int r = (int)(Math.random()*45);
//			System.out.println("r : " + r);
			if(arr[r]) {
				i--;
				//continue;
			} else {
				arr[r] = true;
			}
		}
		
		for(int i=0; i<=44; i++) {
			if(arr[i])
				System.out.print(i+1 + " ");
		}
	}
}









