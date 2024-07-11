package jaehyun.submit05;

public class Q03 {
	public static void main(String[] args) {
		
		// a부터 b사이의 랜덤 정수
//		(int)(Math.random() * ?) + ?
		
		// 0~3 사이의 랜덤 정수 (a=0, b=3)
//		(int)(Math.random() * 4) + 0;
		
		// 1~50 사이의 랜덤 정수 (a=1, b=50)
//		(int)(Math.random() * 51) + 1;
		
		// 10~20 사이의 랜덤 정수 (a=10, b=20)
//		(int)(Math.random() * 11) + 10;
		
		// 16~32 사이의 랜덤 정수 (a=16, b=32)
//		(int)(Math.random() * 17) + 16;
		
		int result = makeRandom(1, 3);
		System.out.println(result);
		
	}
	
	public static int makeRandom(int a, int b) {
		return (int)(Math.random() * (b - a + 1)) + a;
	}
	
	
	
	
	
}
