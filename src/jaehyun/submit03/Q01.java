package jaehyun.submit03;

public class Q01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		long mul = 1;
		for(int i = 1; i <= 10; i++) {
			mul *= i;
		}
		System.out.println(mul);
		
		
		mul = 1;
		for(int i = 1; i <= 15; i++) {
			mul *= i;
			System.out.println("i = " + i);
			System.out.println(mul);
			System.out.println("-------------");
		}
		System.out.println(mul);
		
	}

}
