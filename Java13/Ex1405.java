package day14;

import java.util.ArrayList;
import java.util.Scanner;

class MemberVO {
	private String name;
	private String id;
	private String pw;
	private String phone;
	
	MemberVO(String name, String id, String pw, String phone) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
												
	public String toString() {
		return name + "/" + id + "/" + pw + "/" + phone;
	}
}
public class Ex1405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberVO> list2 = new ArrayList<MemberVO>(); 
		for(int i=1; i<=2; i++) {
			System.out.println("회원 정보를 입력하세요(" + i + "):");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			System.out.print("폰 번호 : ");
			String phone = sc.next();
			
			MemberVO memberVO = new MemberVO(name, id, pw, phone);
			list2.add(memberVO);
		
//			System.out.print("입력된 회원정보 = ");
//			System.out.println(memberVO);    // (이해) memberVO.toString() 의 리턴값을 출력.
//			System.out.println("입력된 회원정보 = " + memberVO);
											// (이해) 문자열 +연산 ----> memberVO.toString() 의 리턴값을 +연산.
		}
		System.out.println("입력된 회원 수 : " + list2.size() + "명.");
		
		System.out.println("<전체 회원정보>");
		// 첫 번째 방법.
//		for(int i=0; i<=list2.size()-1; i++) {   //  i : 0 ~ 1
//			System.out.println(list2.get(i));   // .toString() 호출됨 (이해)
//		}
		// 두 번째 방법.
//		for(int i=0; i<=list2.size()-1; i++) {
//			String name = list2.get(i).getName();   // list2.get(i) = MemberVO객체를 리턴한다.
//													// 왜냐하면 list2 ---> ArrayList<MemberVO> list2 = ...
//			String id = list2.get(i).getId();
//			String pw = list2.get(i).getPw();
//			String phone = list2.get(i).getPhone();
//			
//			System.out.println(name + "/" + id + "/" + pw + "/" + phone);
//		}
		// 세 번째 방법.
		for(MemberVO mVO : list2) {
			System.out.println(mVO);      // .toString() 호출됨 (이해)
		}
		
		// ★네 번째 방법 (나중에 - 컬렉션프레임워크에서)

		sc.close();   // (optional)
	}
}














