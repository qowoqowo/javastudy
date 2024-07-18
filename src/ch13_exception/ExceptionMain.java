package ch13_exception;

import java.text.ParseException;
import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		// 이론적으로는 에러와 예외가 조금 차이가 있으나
		// 대부분 에러라고 칭함 (= 뻑났다)
		
		// 에러는 예측이 가능한 에러와 예측하지 못한 에러로 나눌 수 있다.
		// 두 경우 모두 예외처리가 가능하다.
		
		int[] intArray = {1,2,3};
		
		// 예외처리를 하지 않은 상태에서 에러가 발생하면 프로그램이 멈춘다.
		// 예외처리를 했다면 에러가 발생해도 프로그램이 멈추지 않는다.
		// try - catch 구문
		try {
			// try 중괄호 블록 내부에는
			// 에러가 발생할 가능성이 있는 코드를 넣는다.
			System.out.println("인덱싱 이전");
			System.out.println(intArray[4]); // 에러 발생 코드 (에러 객체가 생성됨)
			System.out.println("인덱싱 이후"); // 위에서 에러 발생시 아래는 실행 안됨
		}catch(ArrayIndexOutOfBoundsException aioobe) { // 생성된 객체가 담김
			// 에러 객체 살펴보기
			System.out.println(aioobe);
			// 빨간줄 생기는 코드
			aioobe.printStackTrace();
		}
		
		System.out.println("인덱싱 예외처리 끝남");
		
		
		// 일반적으로 catch에 Exception 객체를 적음
		// (= 모든 에러 객체들이 Exception 객체에 포함됨)
		try {
			System.out.println(intArray[5]); // ArrayIndexOutOfBoundsException 객체 생성
		}catch(Exception e) {  // ArrayIndexOutOfBoundsException 가 Exceotion의  e로 들어감
			// Exception 으로 두면 어떤 에러가 발생하든 catch 된다.
			e.printStackTrace();
			
			// 스프링 프레임워크라면 이 때 에러페이지를 사용자에게 전달
		}
		
		// 콘솔창에 빨간 문구 입력
		System.out.println("위");
		System.err.println("빨간맛");
		System.out.println("아래");
		
		
		// 예외처리는 충분한 테스트 이후에 적용하는 편
		// 개발 후반부에 전체적으로 예외처리를 해주는 경우가 많음
		
		System.out.println("\n=========================================\n");
		
		Scanner scan = new Scanner(System.in);
		
		/*
		while(true) {
			System.out.println("행동 선택");
			System.out.println("1. 밥먹기 | 2. 잠자기 | 3. 종료");
			System.out.print(">>> ");
			
			int command = 0;
			
			// 예외처리 하고자 하는 코드구문 선택
			// 마우스 우클릭 - surround with - try catch block
			
			try {
				command = Integer.parseInt(scan.nextLine());
			}catch(Exception e) {
				System.out.println("숫자만 입력해주세요!");
				continue;
			}
			
			if(command == 1) {
				System.out.println("냠냠");
			}else if(command == 2) {
				System.out.println("꿀꿀");
			}else if(command == 3) {
				System.out.println("빠빠");
				break;
			}else {
				System.out.println("숫자는 1~3 중에 하나를 입력");
			}
			
		}
		*/
		System.out.println("\n==================================\n");
		
		// try 블록에 대해 catch 문은 여러개 쓸 수 있음
		try {
			
			int command = Integer.parseInt("asdf");
			
		} catch (NumberFormatException e) {
			// 예측이 되는 에러 처리 부분
			e.printStackTrace();
		} catch(Exception e) {
			// 예측 못한 에러 상황에서도 처리하도록 함 (최후의 보루)
			e.printStackTrace();
		}
		
		
		// 일반적으로 예측 가능한 예외 상황을 처리하기 위해
		// 별도로 Exception을 상속받는 예외 클래스를 만들어서 사용
		// = BizException (비즈니스 익셉션)
		
		try {
			// 메소드 옆에 throws ParseException 이 적혀있다면
			// 해당 메소드는 특정 상황에서 ParseException 이 발생할 수 있는 메소드다
			// 메소드를 실행할 때 예외처리를 해줘야 한다.
			long time = ExMethod.dateToLong("2024.07.16");
			System.out.println(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			String result = ExMethod.game(3);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		try {
			ExMethod.printName("");
		} catch (BizException e) { // 우리의 의도에 맞는 에러
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		} catch (Exception e) { // 보험
			e.printStackTrace();
		}
		
		System.out.println("프로그램 끝단");
		
		System.out.println("\n==========================================\n");
		
		// try - catch - finally
		
		try {
			ExMethod.printName(null);
		} catch (BizException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("에러가 나든 말든 실행");
		}
		
		System.out.println("나도 에러가 나든 말든 실행");
		
		// finally 는 주로 자원을 닫기 위한 목적으로 사용된다.
		// JDBC 챕처에서 좀 더 자세히 볼 예정
		
		// 스트림, 파일입출력, 데이터통신 등에 사용되는 객체를
		// 자원이라고 표현함. 자원은 사용후 close 하는것이 권장됨
		Scanner sca = new Scanner(System.in);
		
		try {
			// try에서 자원을 사용한 후
			System.out.println(sca.nextLine());
		}catch(Exception e) {
			
		}finally {
			// 최종적으로 자원 닫기
			sca.close();
		}
		
		// 자원 정리 용도 finally를 쓰거나
		// try-with-resource 구문을 이용한다.
		
		// 자원 객체를 try() 소괄호 안에 선언 후
		// try(){} 중괄호 안에서 객체를 사용하면
		// 이후 자동으로 해당 객체를 close 해준다.
		try(Scanner sc = new Scanner(System.in)){
			System.out.println(sc.nextLine());
		} catch(Exception e) {
			System.out.println("catch가 없어도 된다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
