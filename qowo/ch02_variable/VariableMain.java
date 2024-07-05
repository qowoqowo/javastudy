package ch02_variable;

public class VariableMain {
	
	// main 메소드 자동완성
	// main 입력 후 Ctrl + Space
	public static void main(String[] args) {
		// 변수(Variable)란?
		// 값을 담을 수 있는 저장소, 담고 있는 값을 변경할 수 있다.
		
		// 변수의 선언
		// 변수타입 변수명 의 형태
		// int <- 숫자타입
		// money <- 변수명
		int money;
		
		// 변수에 값을 넣지 않으면 (= 할당하지 않으면) 사용 불가
		// 기본적으로 코드는 위에서 아래 방향으로 한줄씩 실행된다.
		// 주석처리 단축키 Ctrl + /
//		System.out.println(money);  // 에러 발생시 프로그램이 종료됨
		
		// 변수에 값 할당 (= Initialize, 초기화, Init)
		// 등호(=)는 오른쪽의 값을 왼쪽에 담는 명령어
		money = 100000;
		
		System.out.println(money);
		
		// 변수의 값 변경
		money = 200000;
		
		System.out.println(money);
		
		
		// 상수(Constant)
		// 값을 담는 저장소, 담긴 값이 변경할 수 없음
		// 상수의 선언은 타입 앞에 final을 적어준다.
		// (값이 바뀔 일이 없는 값을 담을 때 사용)
		// (실수로라도 값이 바뀌는 일이 발생하지 않게됨)
		final int AGE = 20;
		
		System.out.println(AGE);
		
		// 값을 바꾸려고 하면 빨간줄 그어짐
//		age = 30;
		
		
		// 변수의 선언과 함께 값을 할당
		int number = 5;
		
		
		// 변수의 타입
		// 정수(Integer) 타입
		// 소수점이 없는 숫자를 의미. 200, 53, -20
		
		// byte는 -128 ~ 127
		byte byteNumber = 100;
		
		short shortNumber = 100;
		
		// byte, short, int는 각각 담을 수 있는 숫자의 크기가 다름
		// -21억 ~ 21억
		int intNumber = 1000000000;
		
		// int를 주로 이용하다가 숫자가 21억이 넘어가면 long 타입 사용
		// long 타입 값을 표현하기위해서는 숫자 뒤에 L 을 붙여주어야 함
		long longNumber = 78785437864L;
		
		
		// 소수(Float) 타입
		// float 타입 값을 표현하기위해서는 숫자 뒤에 f 를 붙여주어야 함
		float floatNumber = 13.45f;
		
		double doubleNumber = 13.45; 
		
		
		// 불리언(boolean) 타입
		// 2개의 값 true/false (참/거짓)
		boolean isRun = false;
		
		
		// 변수 명명 규칙 (개발자들 사이의 기본룰)
		
		// 패키지명(폴더)은 전부 소문자로 쓴다.
		// 하나 이상의 단어가 포함되면 단어 사이에 언더바(_)를 넣어준다.
		
		// 클래스명은 앞에 대문자를 사용
		// 하나 이상의 단어가 포함되면 다음 단어의 앞글자를 대문자로 쓴다.
		
		// 변수명은 소문자를 사용하나
		// 하나 이상의 단어가 포함되면 다음 단어의 앞글자를 대문자로 쓴다
		// = 카멜식 (Camel)
		
		// 함수, 메소드명은 카멜식으로 지음 (변수명과 동일)
		
		// 상수명은 전부 대문자를 사용
		// 하나 이상의 단어가 포함되면 단어 사이에 언더바(_)를 넣어준다.
		
		
		// 변수명 주의사항
		// 이미 선언된 변수명은 또 선언 불가 (중복된 변수명 선언 불가)
//		long money = 34L;

		// 변수명은 대소문자를 구분한다.
		int Money = 40;  // money와 Money는 다르게 인식
		
		// 변수명에 숫자를 앞에 쓸 수 없지만 뒤에는 쓸 수 있음
		int age3 = 30;
		int 사십대 = 40;  // 한글을 변수명에 쓸 순 있지만 실제 개발에서는 영어만 사용
		System.out.println(사십대);
		
		// 변수명의 길이 제한은 없다.
		// 변수명을 지을 때는 변수명만 보고도 어떤값이 담겨있는지 
		// 파악이 가능하게끔 짓기
		int a = 1;  // 비추천
		
		// 변수명에 예약어를 사용불가
		// 예약어는 자바에서 기본적으로 만들어져있는 단어들
//		int float = 5;
		
		
		
		
	}
	
}
