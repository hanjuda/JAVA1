package day15;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
	private String name;  // 아이템이름
	private int qty;      // 수량
	
	Item(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {			// "아이템이름 : __개"
		return name + " : " + qty + "개";		
	}
}
public class Ex1501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Item> list1 = new ArrayList<Item>();

		boolean repeat = true;
		while(repeat) {
			System.out.println("----------------");
			System.out.println("1. 아이템 등록");
			System.out.println("2. 아이템 조회");
			System.out.println("3. 아이템 삭제");
			System.out.println("4. 전체 아이템 출력");
			System.out.println("5. 종료");
			System.out.println("----------------");
			System.out.print("입력> ");
			
			int menu = sc.nextInt();
			switch(menu) {
			case 1:			// 아이템 등록
				System.out.print("등록할 아이템의 이름 : ");
				String name = sc.next();
				System.out.print("수량 : ");
				int qty = sc.nextInt();   // qty : quantity
				list1.add( new Item(name, qty) );
				System.out.println("등록되었습니다");
				break;
			case 2:			// 아이템 조회
				System.out.print("조회할 아이템 이름 : ");
				String name2 = sc.next();
				boolean result = false;   // result : 찾았으면 true.
				for(Item item : list1) {
					if(item.getName().equals(name2)) {
						System.out.println(item);
						result = true;
					}
				}
				if(!result) {
					System.out.println("그런 아이템은 없습니다.");
				}
				break;
			case 3:			// 아이템 삭제
				System.out.print("삭제할 아이템 이름 : "); 
				String name3 = sc.next();
				for(int i=0; i<=list1.size()-1; i++) {  // i : 0 ~ 마지막인덱스
					if(list1.get(i).getName().equals(name3)) {
						list1.remove(i);
						break;
					}
				}
				System.out.println("삭제되었습니다");
				break;
			case 4:			// 전체 아이템 출력
				System.out.println("<전체 아이템 목록>");
				for(Item item : list1)
					System.out.println(item);
				break;
			case 5:
				repeat = false;
				break;		// (optional)
			}
			
		}
		
		sc.close();    // (optional)
	}
}












