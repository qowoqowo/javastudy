package ch12_library;

public class LibPattern {
	public static void main(String[] args) {
		// 정규표현식 (Regular Expression)
		// 특정 규칙을 가진 문자열의 집합을 표현하기 위해 쓰는 표현식
		
		// 문자열에 숫자만 존재하는지 검증 (유효성 검증, Validation)
		String example = "123123";
		
		// 검증을 위한 정규표현식 생성(String)
		// ^ : 문자열의 시작, $ : 문자열의 끝
		// [] : 하나의 문자, [0-9] : 하나의 숫자
		// + : 1개 이상, * : 0개 이상
		String regex = "^[0-9]+$";
		
		boolean result = example.matches(regex);
		
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		
		// 알파벳만 존재하는지 검증
		example = "Bae JaeHyun";
		
		regex = "^[a-z]+$";
		regex = "^[a-z|A-Z]+$"; // | 는 또는 을 의미함
		regex = "^[a-z|A-Z| ]+$"; // 공백도 조건에 넣어주어야 한다.
		regex = "^[a-zA-Z ]+$"; // 파이프라인은 생략해도 괜찮다. 
		regex = "^[a-zA-Z\\s]+$"; // \\s 는 공백을 의미 " "
		
		result = example.matches(regex);
		
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		// 한글만 존재하는지 검증
		example = "배재현";
		regex = "^[가-힣|ㄱ-ㅎ|ㅏ-ㅣ]+$";
		result = example.matches(regex);
		
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		
		// 영어와 숫자로 구성
		example = "dnlem55";
		regex = "^[a-z|A-Z|0-9]+$";   // 영어또는 숫자가 1글자 이상
		regex = "^[a-z|A-Z|0-9]{7}$"; // 영어또는 숫자가 7글자인 경우  
		regex = "^[a-z|A-Z|0-9]{7,}$"; // 영어또는 숫자가 7글자 이상  
		regex = "^[a-z|A-Z|0-9]{7,12}$"; // 영어또는 숫자가 7글자 이상 12글자 이하  
		regex = "^[a-z|A-Z|0-9]{0,12}$"; // 영어또는 숫자가 12글자 이하  
		regex = "^[\\w]{0,12}$";         //   a-z|A-Z|0-9와 \\w 는 같음
		result = example.matches(regex);
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		// 비밀번호 패턴
		// 영어, 숫자, 특수문자
		example = "1q2w3e4";
		regex = "^[\\w|!@#$%^&*?/`)(><]+$";  // example 에 특수문자 없어도 통과됨
		result = example.matches(regex);
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		
		// 영어소문자, 대문자, 숫자, 특수문자 각각 1개 이상
		// 총 8~14 글자 
		example = "Dnlem55!";
		// . 은 아무 문자를 의미, .* 은 아무 문자 0개 이상
		regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[\\w!@#$%^&*]{8,14}$";
		result = example.matches(regex);
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		
		// 이메일 형식 체크
		example = "dnlem55@gmail.com";
		example = "dnlem55@naver.com";
		regex = "^[\\w]+[@][a-z]+[.][a-z]+$";
		result = example.matches(regex);
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		
		// PIN 비밀번호
		// 동일한 숫자가 연달아 3개 이상 있으면 안됨
		example = "123334";
		regex = "^.*([0-9])\\1\\1.*$";  // .*333.* 일때 true 리턴
		result = example.matches(regex);
		System.out.println(example + "에 대한 검증 " + regex + " 결과 " + result);
		
		
	}

}
