package ch14_thread;

public class ThreadMain {
	public static void main(String[] args) {
		// n부터 n+5까지 차례대로 콘솔창에 출력해주는 메소드 만들기
//		printNum(20);
		
//		printNum(100);
		
		// 기본적으로 멀티쓰레드를 구현하지 않으면 
		// 하나의 쓰레드(메인 쓰레드)만 동작함
		// 위에서부터 차례대로 코드가 한줄씩 실행된다. (= 동기 방식)
		
		// 멀티 쓰레드 이용
		// 1. Thread를 상속받은 클래스를 이용하여 멀티쓰레드 구현
		// 	  (약간 기능을 넣고자 하는 경우)
		MyThread hotshan = new MyThread(40);
		
		// 메인 쓰레드가 아닌 다른 쓰레드에게 
		// MyThread 내 run 메소드를 실행시킴
		hotshan.start(); // 외부 쓰레드 B 가 run 실행
		
		// 위에서부터 차례대로 코드가 실행되지 않고
		// 동시에 실행됨 (= 비동기 방식)
//		printNum(30);  // 메인 쓰레드가 실행
		
		MyThread scv = new MyThread(30);
		scv.start(); // 외부 쓰레드 C가 run 실행
		
		// 기본적으로 멀티쓰레드를 구현하였을 때
		// 다른 쓰레드에게 일을 던지면 
		// 그 일의 순서나, 언제 끝날지 모른다.
		
		System.out.println("메인 쓰레드는 이제 쉽니다.");
		
		// 2. Thread의 생성자에 Runnable 인터페이스 넣어줌
		// 	  (간단하게 멀티쓰레드를 구현할 때 쓰기 좋음)
		Thread probe = new Thread(new Runnable() {
			
			@Override
			public void run() { // .start() 시 실행되는 부분
				printNum(80);
			}
		});
		probe.start(); // 외부쓰레드 D가 run 실행
		
		// 람다식 적용
		Thread drone = new Thread( () -> printNum(100) ); 
		drone.start(); // 외부쓰레드 E가 run 실행
		
		
		
	}
	
	
	public static void printNum(int num) {
		for(int i = num; i <= num+5; i++) {
			System.out.println(i);
		
			try {
				// 실행에 텀(term)을 주고 싶을때 사용
				// sleep() 안 숫자는 밀리초 단위
				// 이 코드를 직접 실행한 Thread만 해당 밀리초만큼 쉰다.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	

}
