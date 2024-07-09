package ch06_method;

public class MethodMain {
	
	public static void main(String[] args) {
		// 함수 = function = 메소드 = method
		// 굳이 나누자면 메소드는 클래스에 종속된 함수이며
		// 함수는 클래스에 독립적인 함수를 말함 (신경 ㄴㄴ)
		
		// 1부터 100까지 다 더하면 결과는?
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지 더한 값: " + sum);
		
		// 30부터 60까지 다 더하면 결과는?
		sum = 0;
		for(int i = 30; i <= 60; i++) {
			sum += i;
		}
		System.out.println("30부터 60까지 더한 값: " + sum);
		
		// 25부터 50까지 다 더하면 결과는?
		sum = 0;
		for(int i = 25; i <= 50; i++) {
			sum += i;
		}
		System.out.println("25부터 50까지 더한 값: " + sum);
		
		// 위와 같은 코드들을 중복코드라고 부름
		// 중복코드는 하나로 묶어주어야 한다!!!!
		
		// 위 중복코드를 하나의 메소드로 만들기 (= 메소드 선언)
		// 순서대로 파라미터 int a = 10, int b = 20 값이 담김
		
		printSum(50, 80);
		
		printSum(10, 20);
		
		// 리턴타입이 void = 리턴이 없는 메소드
		printSum(30, 40);
		
		System.out.println();
		
		// 메소드에 마우스를 올리면 리턴타입을 확인할 수 있음
		Math.random();
		
		// 리턴값이 존재하는 메소드 만들기
		// 리턴값을 굳이 담지 않아도 실행가능
		returnSum(1, 10);
		
		int result = returnSum(10, 20);
		System.out.println(result);
		
		System.out.println(returnSum(10, 20));
		// 리턴이 없는 메소드는 파라미터에 넣을 수 없음 
//		System.out.println(printSum(10, 20));
		
		// 메소드 개선
		System.out.println(returnSum(20, 10));
		
		System.out.println("\n=============================\n");
		
		// System.out.println() 을 print() 로 만들어 쓰기 
		System.out.println("파이썬 고트");
		print("파이썬 고트");
		
		System.out.println(10);
		// 메소드 오버로딩(Overloading)
		// 한 클래스 내에 기본적으로 이름이 같은 메소드를 선언할 수 없다.
		// 하지만 파라미터의 개수나 타입이 다르면 
		// 메소드의 이름이 같더라도 선언할 수 있다.
		print(10);
		
		// println은 모든 타입에 대해 메소드 오버로딩이 적용되어있음
		System.out.println(0.5);
//		print(0.5);
		
		System.out.println("\n============================\n");
		
		// 절댓값을 구하는 메소드 만들기
		// -10 의 절댓값 = 10
		// 10 의 절댓값 = 10
		
		// 함수명 myAbs
		// 리턴타입 int
		// 파라미터 타입 int
		// 파라미터에 들어오는 값이 음수면 양수로 변환 후 리턴
		// 양수면 그냥 그대로 리턴
		System.out.println(myAbs(-10));  // 10
		System.out.println(myAbs(20));  // 20
		
		System.out.println(Math.abs(-10));
		
		System.out.println("\n===============================\n");
		
		// 이름, 국어, 영어, 수학 점수를 파라미터에 넣으면
		// =======================
		// 찬웅
		// 국어: 92
		// 영어: 95
		// 수학: 70
		// 평균: 85.67
		// 등급: B 
		// ========================
		// 90점 이상 A, 80점 이상 B, 그 외 C
		// 위와 같이 출력해주는 메소드 만들기
		
		makeCard("찬웅", 92, 95, 70);
		
		System.out.println("\n===========================\n");
		
		// 파라미터에 나이가 들어오면
		// 10~19면 10 리턴
		// 20~29면 20 리턴
		// ...
		int gen = calGen(74);
		System.out.println(gen);  // 30
		
		
	}  // main 메소드 끝 지점
	
	
	// 메소드 선언
	// public : 접근제어자
	// static : 정적 메소드를 나타냄
	// 메소드는 리턴이 있거나 없음
	// 리턴이 없다면 리턴타입에 void 작성
	// 메소드명 작성
	// 메소드는 항상 이름옆에 ()가 있다.
	// () 안에 들어가는 값을 파라미터라고 함.
	public static void printSum(int a, int b) {  // int a = 10, int b = 20
		// a부터 b까지 더한 값?
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		// 중복코드를 하나로 묶었기 때문에 한번만 수정하면 된다.
		System.out.println(a + "부터 " + b + "까지 더한 값은 " + sum + "입니다.");
	}
	
	
	// a부터 b까지 더한 값을 리턴하는 메소드
	// a가 b보다 크더라도 a부터 b까지 더한 값이 리턴되도록 수정
	public static int returnSum(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		if(a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}
		
		// sum값을 리턴시키기
		return sum;
	}
	
	
	// print 메소드
	public static void print(String input) {
		System.out.println("문자열 감지");
		System.out.println(input);
	}
	
	// 메소드 오버로딩
	public static void print(int input) {
		System.out.println("숫자 감지");
		System.out.println(input);
	}
	
	// 절댓값 리턴 메소드
	public static int myAbs(int num) {
		
//		if(num < 0) {
//			num = num * -1;
//			return num;
//		}else {
//			return num;
//		}
		
//		if(num < 0) {
//			// 메소드 내에서 return이 실행되면 메소드는 즉시 종료
//			return num * -1;
//		}
//		
//		return num;
		
		return (num < 0) ? -num : num;
	} 
	  
	
	// makeCard 만들기
	public static void makeCard(String name, int kor, int eng, int math) {
		System.out.println("=====================");
		System.out.println(name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		
		double avg = (kor + eng + math) / 3.0;
		// printf는 소수값에 대해 원하는 형태로 "출력만" 할 뿐
		// 소수값을 원하는 형태로 값을 얻기 위해서는 반올림 메소드를 이용
//		System.out.printf("평균: %.2f\n", avg);
		
		// Math.round() 반올림 메소드
		// 소수 첫째자리에서 반올림한 정수를 리턴
		System.out.println(Math.round(avg));
		
		avg = myRound(avg, 1);
		System.out.println("평균: " + avg);
		
		String grade = "C";
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}
		
		System.out.println("등급: " + grade);
		System.out.println("==================");
		
	}
	
	
	// 우리의 반올림 메소드 만들기
	/**
	 * Java Doc 주석. 메소드에 대한 설명을 적는 용도
	 * 파라미터로 들어온 소수(num)에 대해 소수 n번째 자리로 리턴해주는 메소드
	 * @param num 반올림하고자 하는 소수
	 * @param n   소수 n번째 자리까지 리턴
	 * @return    반올림된 소수 리턴
	 */
	public static double myRound(double num, int n) {
		// Math.round() 는 소수 첫째자리에서 반올림한 정수를 리턴
		// Math.round(3.141592) -> 3 리턴
		
		// 3.141592 에 대해
		// 소수 첫째자리까지 리턴 -> 3.1 (n = 1)
		// 3.141592 에 10을 곱함 -> 31.41592
		// Math.round(31.41592) -> 31
		// 31 에 10을 나눔 -> 3.1
		
		// 소수 둘째자리까지 리턴 -> 3.14 (n = 2)
		// 3.141592 에 100을 곱함 -> 314.1592
		// Math.round(314.1592) -> 314
		// 314 에 100을 나눔 -> 3.14
		
		// 10 ^ n 을 곱하고 나누게 된다.
		// -> 1에 10을 n번 곱하기
		int ten = 1;
		for(int i = 0; i < n; i++) {  // n번 반복하는 for문
			ten *= 10;
		}
		
		num *= ten;  // 314.1592
		
		long round = Math.round(num);  // 314
		
		double result = (double)round / ten; // 3.14
		
		return result;
	}
	
	 
	public static int calGen(int age) {
		// 24
		// age 에 10을 나눔 -> 2
		// 2 에 10을 곱하기 -> 20
		int div = age / 10;
		return div * 10;
	}
	
	
	
	
}


