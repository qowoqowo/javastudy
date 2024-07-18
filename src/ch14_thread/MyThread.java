package ch14_thread;

	// 1. Thread 클래스를 상속 시킨다.
public class MyThread extends Thread {
	
	private int start;
	
	public MyThread() {
		
	}

	public MyThread(int start) {
		this.start = start;
	}


	// 2. Thread 클래스 내 run 메소드를
	// 	  Override 한다 (= 멀티쓰레드로 던질 일에 해당)
	
	@Override
	public void run() {
		for(int i = start; i <= start + 5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
}
