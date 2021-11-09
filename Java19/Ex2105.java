package day21;

interface Message {
	String greet();    // (이해) public abstract  
}
//class MessageImpl implements Message {
//	@Override
//	public String greet() {
//		return "안녕";
//	}
//}

public class Ex2105 {
	static void showMessage(Message m) {
		System.out.println(m.greet());
	}
	public static void main(String[] args) {
//		MessageImpl obj = new MessageImpl();
//		showMessage(obj);
		// 익명클래스 : Message 인터페이스의 '구현체 클래스'를 정의함과 동시에 객체 생성! 
//		Message obj = new Message() {
//			@Override
//			public String greet() { return "안녕"; }
//		};
		showMessage(new Message() {
			@Override
			public String greet() { return "안녕"; }
		});
	}
}








