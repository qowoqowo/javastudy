package ch13_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExMethod {
	
	// 날짜 문자열을 파라미터로 입력받으면 (yyyy.MM.dd) 
	// 해당 날짜에 대한 long 타입 숫자로 변환하여 리턴
	public static long dateToLong(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		// .parse() 는 포맷이 다른 문자열에 대해 ParseException 발생
		// 선택 1. 이곳에서 try-catch 를 이용하여 예외처리
		// 선택 2. 이곳에서 예외처리를 하지 않고, 다른 곳에서 
		// 		  try-catch로 예외처리를 하도록 넘기기
		Date result = sdf.parse(date);
		
		return result.getTime();
	}
	
	
	// 파라미터로 0이 들어오면 "가위" 리턴
	// 파라미터로 1이 들어오면 "바위" 리턴
	// 파라미터로 2이 들어오면 "보" 리턴
	// (0, 1, 2가 아닌 숫자가 파라미터로 들어오면? 에러 발생)
	public static String game(int num) throws Exception {
		if(num == 0) {
			return "가위";
		}else if(num == 1) {
			return "바위";
		}else if(num == 2) {
			return "보";
		}else {
			// 0, 1, 2 가 아닌 숫자가 파라미터로 들어오면 에러 발생 시킴
			// 생성자에 에러메세지를 넣을 수 있음
			throw new Exception("숫자 0~2만 가능. 근데 "+ num + "들어옴");
		}
	}
	
	
	// 파라미터로 들어온 이름을 콘솔창 출력
	// 파라미터로 들어온 이름은 숫자가 들어있거나 empty면 안됨
	public static void printName(String name) throws BizException {
		if(name.length() == 0) {
			// 문제발생! -> 즉시 메소드 실행 종료
			throw new BizException("빈 문자열이 들어옴", "API_001");
		}else if(name.matches("^.*[0-9].*$")) { // 숫자가 하나라도 들어있으면 true
			throw new BizException("숫자가 들어옴", "API_002");
		}
		
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
