package ch07_array;

public class ArrayMain {
	
	public static void main(String[] args) {
		// 배열 (Array)
		// 변수는 하나의 값만 담을 수 있음
		// 배열은 여러개의 값을 담을 수 있음
		String samjang = "삼장";
		String woogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";
		
		
		// 문자열 값들을 담을 수 있는 배열 선언
		// 숫자 4는 첨자라고 하며,
		// 배열의 크기를 의미한다 (값을 4개 담을 수 있는 배열)
		String[] seoyugi = new String[4];
		
		
		// 배열의 크기 확인
		// .length
		System.out.println(seoyugi.length);
		
		// 배열을 콘솔창에 찍어보면 [Ljava.lang.String;@7d6f77cc 출력 
		System.out.println(seoyugi);
		
		
		// 배열 내 값(= 요소, element) 확인
		// 인덱스 사용
		System.out.println(seoyugi[0]);  // null
		
		
		// 크기만 선언된 배열 내에는 해당 타입에 대한 기본값이 들어있다.
		// 기본값 (디폴트, default)
		// 숫자타입: 0
		// boolean타입: false
		// 참조타입: null
		
		int[] numbers = new int[5];
		System.out.println(numbers[0]);
		
		
		// 배열에 값 담기
		seoyugi[0] = "삼장";
		seoyugi[1] = "오공";
		seoyugi[2] = "사오정";
		
		// 다른 타입의 값을 담을 수 없음
//		seoyugi[3] = 4;
		seoyugi[3] = "저팔계";
		
		// 존재하지 않는 인덱스 사용시 에러 발생
		// 자바의 기본배열은 크기가 고정되어 늘어나거나 줄어들지 않음(똥!!)
//		seoyugi[4] = "우마왕";
		
		System.out.println(seoyugi);
		
		System.out.println(seoyugi[0]);
		System.out.println(seoyugi[1]);
		System.out.println(seoyugi[2]);
		System.out.println(seoyugi[3]);
		
		// for문을 이용하면 배열의 모든 요소에 접근이 가능하다.
		// seoyugi.length -> 4
		// seoyugi 인덱스 번호 -> 0, 1, 2, 3
		for(int i = 0; i < seoyugi.length; i++) {
			System.out.println(seoyugi[i]);
		}
		
		// 배열의 각 요소를 조회하는 메소드 만들기
		printArray(seoyugi);  // [삼장, 오공, 사오정, 저팔계]
		
		
		System.out.println("\n=============================\n");
		
		// 배열을 이용하여 배열에 담긴 모든 요소들을 
		// 한번에 처리할 수 있다.
		// 삼장, 오공, ... -> 서유기 삼장, 서유기 오공, ...
		for(int i = 0; i < seoyugi.length; i++) {
			seoyugi[i] = "서유기 " + seoyugi[i];
		}
		
		printArray(seoyugi);
		
		
		// 배열 내 특정 요소에 접근하여 처리할 수 있다.
		// 오공을 찾아서 "서유기 오공" -> "드래곤볼 오공"
		for(int i = 0; i < seoyugi.length; i++) {
			// seoyugi[i] -> i=0 "서유기 삼장"
			// seoyugi[i] -> i=1 "서유기 오공"
			
			// seoyugi[i] 는 String 타입의 값 (String 메소드 사용가능)
			if(seoyugi[i].contains("오공")) {
				// i=1, "서유기 오공" 일때만 true
				seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
			}
		}
		
		printArray(seoyugi);
		
		// 사오정이 포함된 데이터의 인덱스 번호 찾기
		int findIndex = -1;
		for(int i = 0; i < seoyugi.length; i++) {
			// 사오정이 포함된 데이터 찾고, 
			// 그때의 인덱스 번호를 findIndex에 저장
			// seoyugi[i].indexOf("사오정")
			// "서유기 삼장".indexOf("사오정") -> -1
			// "서유기 오공".indexOf("사오정") -> -1
			// "서유기 사오정".indexOf("사오정") -> 4
			// 사오정이 존재하면 -1이 아님
			if(seoyugi[i].indexOf("사오정") != -1) {
				findIndex = i;
			}
		}
		System.out.println(findIndex);  // 사오정에 해당하는 데이터의 인덱스
		System.out.println(seoyugi[findIndex]);  // 서유기 사오정
		
		String fruits = "Apple, Banana";
		System.out.println(fruits.indexOf("z"));
		
		
		System.out.println("\n===========================\n");
		
		// 기존 값 넣는 방식
		int[] intArray = new int[6];
		
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		
		System.out.println(intArray);
		
		printArray(intArray);
		
		// for문 이용. 배열 안에 랜덤 숫자 넣기
		// 각 인덱스에 로또 번호 넣기 (1~45)
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random() * 45) + 1; 
		}
		
		printArray(intArray);
		
		
		// 값을 넣으며 배열 선언
		int[] numArray = {7, 17, 27, 37, 24, 42};
		
		/*
		 위와 같음
		 int[] numArray = new int[6];
		 numArray[0] = 7; 
		 numArray[1] = 17; 
		 numArray[2] = 27; 
		 numArray[3] = 37; 
		 numArray[4] = 24; 
		 numArray[5] = 42; 
		 */
		
		printArray(numArray);
		
		System.out.println(numArray[2]);
		
		
		System.out.println("\n==============================\n");
		
		// 자바의 기본배열은 사용성이 불편한 편 
		// 직접 배열을 만들어서 사용하는 경우가 많지 않음
		
		// 하지만 JDK 에서 제공하는 여러 메소드에서
		// 기본 배열을 리턴하거나, 파라미터 입력받는 경우가 종종 있음
		
		String books = "이것이 자바다,에너지 데이터 경영론 , 파이썬";
		
		// 문자열 나누기
		// .split(문자열)
		// 해당 문자열을 괄호 안 문자열을 기준으로 나눈
		// 문자열 배열(String[])을 리턴한다.
		String[] bookArray = books.split(",");
		printArray(bookArray);
		
		// .trim()
		// 문자열의 좌우 공백문자 제거
		for(int i = 0; i < bookArray.length; i++) {
			bookArray[i] = bookArray[i].trim();
		}
		printArray(bookArray);
		
		
		String calStr = "1\\+4\\+2";
		
		String[] calArray = calStr.split("\\\\\\+");
		// regex란 정규표현식(Regular Expression)의 약자
		// *, ?, + 의 경우 정규표현식에서 특정 의미를 가지는 문자
		// 해당 문자들은 일반 문자로 쓰려면 앞에 \\를 붙인다.
		
		// 정규표현식 사용 예시
		// 연락처를 숫자만 입력했는지 체크
		// 비밀번호에 알파벳 소문자, 대문자, 숫자, 특수기호 최소 1개 이상 체크
		printArray(calArray);
		
		
	}  // main
	
	
	public static void printArray(String[] strArray) {
		System.out.print("[");
		for(int i = 0; i < strArray.length; i++) {
			// i가 for문의 마지막 요소일때의 i는? 
			// i -> strArray.length - 1
			if(i == strArray.length - 1) {
				System.out.print(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");
			}
		}
		System.out.println("]");
	}
	
	
	public static void printArray(int[] intArray) {
		System.out.print("[");
		for(int i = 0; i < intArray.length; i++) {
			// i가 for문의 마지막 요소일때의 i는? 
			// i -> strArray.length - 1
			if(i == intArray.length - 1) {
				System.out.print(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");
			}
		}
		System.out.println("]");
	}
	
	
	
}
