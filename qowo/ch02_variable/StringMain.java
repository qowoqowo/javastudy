package ch02_variable;

public class StringMain {
	
	public static void main(String[] args) {
		// 문자 타입
		
		// char 타입은 하나의 문자를 담는데 사용된다.
		char ten = 65;
		
		System.out.println(ten);  // 65는 알파벳 A 를 가르킨다
		
		// 작은따옴표('') 안에 문자를 넣어도 숫자로 들어간다.
		char ga = '가';  // '가'에 대한 44032 숫자가 저장됨
		System.out.println(ga);
		
		
		// 문자열 (String)
		// 자바에서는 문자열을 처리하기 위한 String 클래스가 존재
		// 클래스이므로 참조타입에 해당
		// 문자열을 처리할 수 있는 다양한 메소드들이 존재
		// 문자열의 값은 쌍따옴표("") 안에 있는 문자들을 의미
		String fruits = "Apple, Banana, Cherry";
		
		// 많이 사용!!!!!!!!!!!
		// .length()
		// 문자열의 길이를 리턴
		System.out.println(fruits.length());
		
		// 숫자, boolean 타입은 기본타입 (그 외 나머지 전부 참조타입)
		// 기본타입은 클래스가 아니므로 메소드가 없음
		int num = 10;
		
		// 변수명 뒤에 .을 찍어도 메소드가 보이지 않음
//		num.
		
		
		// .charAt(인덱스)
		// 인덱스는 배열에서 각 요소별 순번에 해당
		// 인덱스는 0부터 시작
		// 해당 인덱스 번호에 해당하는 문자를 리턴(char 타입) - 불편
		System.out.println(fruits.charAt(7));
		
		
		// .substring(시작 인덱스, 끝 인덱스)
		// 해당 문자열을 시작 인덱스부터 끝 인덱스 전까지 자른 값을 리턴 (String)
		// Apple은 인덱스 0~4 에 해당
		System.out.println( fruits.substring(0, 4) );  // 0~3 에 대한 Appl
		System.out.println( fruits.substring(0, 5) );  // 0~4 에 대한 Apple
		
		// Banana만 잘라서 출력
		System.out.println( fruits.substring(7, 13) );
		
		// substring() 괄호 안에 숫자를 하나만 넣으면
		// 해당 인덱스부터 문자열 끝까지 자른 값을 리턴
		System.out.println(fruits.substring(7));
		
		// substring을 사용하더라도 해당 문자열이 변하지 않는다.
		System.out.println(fruits);
		
		// 존재하지 않는 인덱스 번호를 넣으면 에러가 발생한다.
		// 코드를 실행하기도 전에 빨간줄이 그어지면 컴파일 에러
		// 코드를 실행했을때 발생하는 에러를 런타임 에러
//		fruits.substring(99);
		
		
		// .replace(바뀔 문자열, 바꾸고자 하는 문자열)
		// 해당 문자열에서 특정 문자열을 바꾸고자 하는 문자열로 교체한 결과를 리턴
		System.out.println(fruits.replace("Apple", "Abocado"));
		
		System.out.println(fruits);
		
		// 원본 문자열을 교체하기
		fruits = fruits.replace("Apple", "Abocado");
		
		System.out.println(fruits);
		
		
		// .trim()
		// 해당 문자열의 양 끝에 존재하는 모든 공백문자를 제거된 문자열 리턴
		String example = "  Hello, Master !!    ";
		
		System.out.println(example.trim());
		
		// replace로 특정 문자열을 제거
		System.out.println(example.replace(" ", ""));
		
		
		// .toUpperCase()
		// .toLowerCase()
		// 해당 문자열에 존재하는 알파벳들을
		// 전부 대문자/소문자로 바꾼값을 리턴
		System.out.println(fruits.toUpperCase());
		System.out.println(fruits.toLowerCase());
		
		
		// .indexOf(문자열)
		// 해당 문자열에서 괄호 안에 있는 문자열의 인덱스 번호 리턴
		System.out.println(fruits.indexOf("Banana"));
		
		// 괄호 안 문자열이 존재하지 않는 문자열이면 -1 리턴
		System.out.println(fruits.indexOf("Orange"));
		
		// 대소문자를 구별하며, 앞에 있는 문자열의 인덱스를 리턴
		System.out.println(fruits.indexOf("a"));
		
		
		// .contains(문자열)
		// 해당 문자열 내부에 괄호안 문자열이 존재하면 true
		// 존재하지 않으면 false 값 리턴
		System.out.println(fruits.contains("Orange"));
		
		
		// 문자열 이어붙이기
		System.out.println(fruits + ", Durian");
		
		System.out.println(fruits);
		
		fruits = fruits + ", Durian";
		
		System.out.println(fruits);  // Abocado, Banana, Cherry, Durian
		
		// fruits 를 출력했을때
		// Mango, Abocado, Banana, Cherry, Durian 가 출력되도록 하기
		
		// 코드 작성
		fruits = "Mango, " + fruits;
		
		System.out.println(fruits);
		
		
		// 기본타입과 참조타입의 메모리 저장 방식 차이
		int age = 30;
		boolean isOn = true;
		
		String today = "금요일";
		
		System.out.println(age);
		System.out.println(today);
		
		// 참조타입의 경우 null 값을 가질 수 있다.
//		int intNull = null;  // 기본 타입은 null값 못담음
		String strNull = null;
		
		System.out.println(strNull);
		System.out.println(strNull == null);
		
		// "" 값을 빈 문자열, empty 라고 부른다.
		String strEmpty = "";
		
		System.out.println(strEmpty);
		
		// 메소드 실행
		System.out.println( strEmpty.length() );
		
		String strBlank;
		
//		System.out.println(strBlank);
		
		
		System.out.println( strNull.length() );
		
		
		
	}
	
}
