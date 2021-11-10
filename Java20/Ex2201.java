package day22;

class ThreadA extends Thread {
	@Override
	public void run() {		// run() : 쓰레드클래스의 main() 메서드 역할.
		for(int i=1; i<=5; i++) {
			System.out.print("A");
			try {
				sleep(1000);   // 1000ms = 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print("B");
			try {
				sleep(1000);   // 1000ms = 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

public class Ex2201 {
	public static void main(String[] args) {
		ThreadA th1 = new ThreadA();
		ThreadB th2 = new ThreadB();
		th1.start();
		th2.start();
		
		System.out.println("main() 종료됨.");
	}
}









