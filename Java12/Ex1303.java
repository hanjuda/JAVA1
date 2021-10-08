package day13;

class CCC {
	int num;
	CCC(int num) { this.num = num; }
}
class BBB {
	int iv;
	static int cv;
	
	void im() {
		iv = 1;
		cv = 2;
	}
	
	static void cm() {
		//iv = 3; // ERR. 이해. (이 에러메시지를 잘 봐두세요)
		cv = 4;
	}
	
	static void cm2() {
		CCC ccc = new CCC(10);
		ccc.num = 5;			// 당연히 오케이.
	}
}
public class Ex1303 {
	public static void main(String[] args) {

	}
}











