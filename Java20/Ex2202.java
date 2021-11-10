package day22;

class R1 implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print("A");
			try {
				Thread.sleep(1000);   // 1000ms = 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

class R2 implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print("B");
			try {
				Thread.sleep(1000);   // 1000ms = 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

public class Ex2202 {
	public static void main(String[] args) {
		R1 r1 = new R1();   // Runnable객체
		R2 r2 = new R2();	// Runnable객체
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		th1.start();
		th2.start();
		
		// main-thread가 쓰레드 th1과 th2가 끝나기를 기다려!
		try {
			th1.join();   // main-thread가 th1이 끝나기를 기다림. (이해)
			th2.join();   // main-thread가 th2가 끝나기를 기다림. (이해)       
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() 종료됨.");  // after 두 쓰레드 모두 종료!
	}
}











