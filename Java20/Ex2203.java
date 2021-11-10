package day22;

class Common {
	private int n;
	// "동기화 메서드" 방식으로 해결:
	/* synchronized */ void add(int p) { n += p; }
	int getN() { return n; }
}

class ThreadAdder extends Thread {
	Common obj; 
	int start, end;
	
	ThreadAdder(Common obj, int start, int end) {
		this.obj = obj;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i=start; i<=end; i++)
			obj.add(i);
	}
}

public class Ex2203 {
	public static void main(String[] args) {
		Common common = new Common();
		ThreadAdder th1 = new ThreadAdder(common, 1, 50);
		ThreadAdder th2 = new ThreadAdder(common, 51, 100);
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합 : " + common.getN());
	}
}










