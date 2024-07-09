package ch07_array;

public class CallByMain {

	public static void main(String[] args) {
		// 가끔 면접에서 묻는 문제
		// Call by Value 와 Call by Reference 을 알고있는지?
		// 기본타입에 대해서는 Call by Value 로 동작
		// 참조타입에서 대해서는 Call by Reference 로 동작
		
		int a = 10;
		int b = a;
		
		System.out.println(b);
		
		a = 20; // 20
		System.out.println(b);  // 10
		
		ArrayMain2.swap(a, b);
		
		System.out.println("a = " + a);  // 20
		System.out.println("b = " + b);  // 10
		
	}
	
	
	

}
