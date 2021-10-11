package day14;

import java.util.ArrayList;
															// 3:04~
public class Ex1403 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);     // .add(요소) : 새로운 요소를 맨 뒤에 추가
		list1.add(20);
		list1.add(30);
		System.out.println(list1);     // .toString()이 호출되고 있음! (이해)
		list1.add(40);
		System.out.println(list1);
		
		// 새로운 요소(15)를 인덱스번호 1번 자리(=두 번째 자리)에 끼워넣기:
		list1.add(1, 15);	// .add(인덱스, 요소) : 새로운 요소를 특정 위치에 끼워넣기.
		System.out.println(list1);	// [10, 15, 20, 30, 40]
		
		// 인덱스번호 3번 위치의 요소를 삭제:
		list1.remove(3);	// .remove(인덱스) : 특정 위치의 요소를 삭제
		System.out.println(list1);  // [10, 15, 20, 40]
		
		// 특정 요소를 포함하고 있는지:  // .contains(요소)
		System.out.println("15라는 값이 이 리스트에 있는지: " + list1.contains(15));
		
		// 특정 요소(15)의 위치를 출력: // .indexOf(요소)        
								// "해당 요소가 없는 경우에는 -1 을 리턴함"
		System.out.println("15라는 값의 위치(인덱스): " + list1.indexOf(15));
		
		// 모든 요소의 총합을 출력.
		// 인덱스번호 i번 위치의 요소를 읽어오기:  // .get(인덱스)
		int sum = 0;
		for(int i=0; i<=list1.size()-1; i++) {   // .size() : 길이를 리턴 
												//  <-----> 배열.length
			sum += list1.get(i);
		}
		System.out.println("총합 : " + sum);
	}
}












