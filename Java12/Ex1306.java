package day13;

class Author {
	private String name;
	private String email;
	private char gender;   // 'm' or 'f'
	
	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return name + " (" + gender + ") at " + email;
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
//		return "'"+name+"' by "+author.getName()+" ("+author.getGender()+") at " + author.getEmail();
		// 자바) 문자열 + 무언가 = (무조건) 문자열    // 따라서, 무언가 -----> 문자열 타입으로 자동으로 형 변환을 시도! (.toString())
//		return "'"+name+"' by "+ author;
		return "'"+name+"' by "+ author.toString();
	}
}

public class Ex1306 { 
	public static void main(String[] args) {
		Author author = new Author("YG", "JavaProgramming2020@gmail.com", 'm');
		Book book = new Book("세상에서 자바가 제일 쉬웠어요", author, 7500, 9999);
		System.out.println(author);
		System.out.println(book);   // book.toString()의 리턴값이 출력.
	}
}













