package day13;

import java.util.Scanner;

class Member {
	private String id;
	private String name;
	private String birthDate;   // 생년월일(yymmdd)
	
	Member(String id, String name, String birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return id + "/" + name + "/" + birthDate;
	}
}

public class Ex1304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("이름 : " );
		String name = sc.next();		
		System.out.print("생년월일(yymmdd) : ");
		String birthDate = sc.next();
		
		Member member = new Member(id,name,birthDate);
		System.out.println(member.getId() + "/" + member.getName() + "/" + member.getBirthDate());    // "__아이디___/__이름__/_생년월일_"
		
		System.out.println(member);  // Member객체의 toString()메서드를 호출하고 있는 것 (이해 -> 나중에)
		System.out.println(member.toString());
		
		sc.close();    // (optional)
	}
}










