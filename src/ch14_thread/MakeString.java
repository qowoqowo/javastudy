package ch14_thread;

public class MakeString {
	public static void main(String[] args) {
		
		// 동기화 지원
		StringBuffer strBuff = new StringBuffer();
		
		// 동기화 미지원
		StringBuilder strBuil = new StringBuilder();
		
		// 쓰레드 B와 C에서 strBuff에 각각 5천만개의 문자열을 붙인다.
		Thread threadB = new Thread(() -> {
			for(int i = 0; i < 50000000; i++) {
				strBuil.append("0");
			}
			System.out.println(strBuil.length());
		});
		
		Thread threadC = new Thread(() -> {
			for(int i = 0; i < 50000000; i++) {
				strBuil.append("0");
			}
			System.out.println(strBuil.length());
		});
		
		threadB.start();
		threadC.start();
		
		System.out.println(strBuil.length());
		
		
		
		
	}
	
	
	
}
