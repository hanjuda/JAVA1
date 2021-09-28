package day6;
										
public class Ex602 {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			// i가 만약에 5라면, 여기서 중단하겠다!
			if(i==5) {
				break;   // 나를 감싸고 있는 "반복문"을 "하나" 빠져나감!
			}
			System.out.println(i);
		}
		System.out.println();  // 줄바꿈
		
		for(int i=1; i<=7; i++) {
			if(i==5) {
				continue;   // 나를 감싸고 있는 "반복문"을 찾아서, '다음 반복 회차부터' 계속함.
			}
			System.out.println(i);
		}
		// ★ 포인트(break, continue) : 다음에 실행될 문장을 찾을 수 있으면 오케이. 
	}
}








