package ch03_system;

// JDK 내부에 있는 Scanner 클래스의 경로를 알려줌 
import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		// 단일 주석(Comment)
		// 코드 앞에 // 가 있으면 컴퓨터가 실행하지 않음
		
		
		/* 
		 * 다중 주석 
		 * 주석 내용이 길거나 많으면 사용
		 */

		// 코드 라인 복사 [Ctrl + Alt + ↓]
//		System.out.println("불금");
//		System.out.println("불금");
//		System.out.println("불금");

		/*
		System.out.println("불금");
		System.out.println("불금");
		System.out.println("불금");
		*/
		
		/**
		 * Java Doc 주석
		 * 메소드 선언부 상단에 메소드에 대한 설명을 적는데 사용
		 */
		
		// TODO 주석 여기에 로그인 처리 로직 넣을거임 
		// Window - Show View - Tasks 에서 TODO 주석 위치 확인 가능
		
		
		// 콘솔창에 값 출력
		// System.out.println()
		// println() 괄호 안 내용을 콘솔창에 출력 후 줄바꿈을 해준다.
		System.out.println(1);
		System.out.println();  // 아무 내용이 없으면 줄바꿈만 이루어짐
		System.out.println(2);
		
		
		// System.out.print()
		// print() 괄호 안 내용만 콘솔창에 출력 (줄바꿈 x)
		System.out.print(1);  // 아무 내용이 없으면 빨간줄 그어짐
		System.out.print(2);
		
		
		// 콘솔창의 용도
		// 프로젝트 내에 개발 중인 소스 코드에 대해
		// 변수나 객체에 저장된 값을 확인하는데 사용
		
		System.out.println("\n============================\n");
		
		// 제어문자
		// 문자열 내에 역슬래시(\)를 이용하여 특정 기능을 넣을 수 있다.
		
		// \n 개행문자 (= 줄바꿈)
		System.out.print("나도 println이 되고 싶어\n");  // println과 같음
		
		// \t 탭
		System.out.println("7\t8\t9\t10");
		System.out.println("11\t12\t13\t14");
		
		// 기능을 가진 문자(\, ", ')를 콘솔창에 출력하고 싶다면?
		System.out.println("쌍따옴표(\")는 내부 텍스트를 문자열로 만든다");
		System.out.println("역슬래시(\\)");
		
		// 특수문자도 출력된다.
		// ㅁ + 한자
		System.out.println("♡");
		
		// win + .
		System.out.println("😘😘😂");
		
		// 아스키아트 넣기
		// https://snskeyboard.com/asciiart/
		System.out.println("║░█░█░║░█░█░█░║░█░█░║\r\n"
				+ "║░█░█░║░█░█░█░║░█░█░║\r\n"
				+ "║░║░║░║░║░║░║░║░║░║░║\r\n"
				+ "╚═╩═╩═╩═╩═╩═╩═╩═╩═╩═╝\r\n"
				+ "");
		
		
		// System.out.printf()
		// printf() 는 포맷 문자열(format string)과 함께 사용
		System.out.printf("포맷 문자열 없이 씀\n");
		
		System.out.printf("총 인원은 %d명 입니다.\n", 24);
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 6, 28);
		
		System.out.printf("8월 15일은 %s입니다.\n", "광복절");
		
		// %02d 는 두자리 숫자를 의미하며, 한자리 숫자인 경우 앞에 0을 붙임
		System.out.printf("ch%02d장\n", 15);
		
		// %03d
		System.out.printf("ch%03d장\n", 11);
		
		// 소수 둘째자리로 표현
		System.out.printf("%.2f\n", 3.141592);
		System.out.printf("%.3f\n", 3.14);
		
		// 돈 표현
		// 1,000,000
		System.out.printf("보유금액: %,d \n" , 100000);
		
		System.out.println("\n===============================\n");
		
		// 표준 입력 (= 프롬프트)
		// 콘솔창에서 사용자의 입력을 받음
		// Scanner 객체 사용
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print(">>> ");
		String inputName = scan.nextLine();
		
		System.out.println(inputName + "님 환영합니다.");
		
		System.out.print("나이를 입력해주세요: ");
		String inputAge = scan.nextLine();  // 숫자를 입력해도 String 타입으로 가져옴
		
		// 나이: 30세
		System.out.println("나이: " + inputAge + "세");
		System.out.printf("나이: %s세", inputAge);
		
		
	}

}
