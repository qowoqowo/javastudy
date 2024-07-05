package ch05_control;

public class ConditionalMain {
	
	public static void main(String[] args) {
		// 조건문
		
		// if문
		int price = 30000;
		int money = 100000;
		
		// 물건 구매
		// money가 price 보다 크거나 같은지 체크
		// if문의 소괄호() 안 조건(boolean)이 true면
		// if문의 중괄호{} 내부 코드가 실행 됨
		// 조건이 false면 내부 코드가 실행되지 않음
		if(money < price) {
			System.out.println("돈이 부족합니다.");
			System.out.println("나는 if문 안에 있음");
		}
		
		
		// if문을 한줄로 써도 되긴 한다.
		if(money < price) {System.out.println("돈이 부족합니다.");}
		
		
		// if문 블록{} 내 코드가 한줄이면 중괄호를 생략할 수 있다. 
		if(money < price) 
			System.out.println("돈이 부족합니다.");
			System.out.println("나는 if문 밖에 있음");
		
		System.out.println("\n============================\n");
		
		// 변수의 사용범위(Scope)
		// 중괄호 블록{} 안에 선언된 변수는
		// 해당 중괄호 블록 바깥에서는 사용할 수 없다.
		
		String review = "맛있어요~ 맛있어요~ 맛있어요~";
		// 리뷰가 10글자 미만이면 재작성 부탁
		if(review.length() < 10) {
			String warning = "리뷰는 10글자 이상 작성해주세요";
		}
		
		// if문 내부에 선언된 변수를 바깥에서 사용할 수 없다.
//		System.out.println(warning);
		
		// 변수의 스코프를 활용
		// 변수를 미리 바깥에 선언하기
		String warning = "통과";
		if(review.length() < 10) {
			// 바깥에 선언한 변수를 내부에서 사용
			warning = "리뷰는 10글자 이상 작성";
		}
		
		System.out.println(warning);
		
		
		// 이를 삼항 연산자로 표현
		// review가 10글자 미만이면 warning에 "10글자 이상" 담고
		// 10글자 이상이면 warning에 "통과" 담기
		// 조건에 따라서 변수에 값을 부여하는 경우 삼항연산자가 더 좋다.
		warning = (review.length() < 10) ? ("10글자 이상") : ("통과");
		System.out.println(warning);
		
		
		System.out.println("\n============== else =================\n");
		
		money = 10000;
		price = 30000;
		
		if(money < price) {
			System.out.println("돈이 부족합니다.");
		}else {  
			// if문의 조건이 false면 else 의 중괄호 블록이 실행됨
			// if문의 조건이 true면 else 의 중괄호 블록이 실행되지 않음
			System.out.println("물품을 구매하였습니다.");
		}
		
		
		review = "맛있어요~";
		warning = "";
		if(review.length() < 10) {
			warning = "리뷰는 10글자 이상";
		}else {
			warning = "통과";
		}
		System.out.println(warning);
		
		
		
		// 사용자로부터 주민번호 뒷자리를 입력받음
		String idBack = "1234567";
		
		// idBack의 첫번째 숫자가 홀수면 남성, 짝수면 여성을 출력하기
		// substring(), Integer.parseInt(), %, if-else문
		
		String one = idBack.substring(0, 1);
		System.out.println(one);  // "1"
		
		int num = Integer.parseInt(one);
		
		if(num % 2 == 1) {
			System.out.println("남성");
		}else {
			System.out.println("여성");
		}
		
		// 모든 가전제품에는 프로그래밍 코드가 들어있다.
		// 리모콘은 전원 버튼 하나로 on/off 가 가능하다.
		
		// 조건 (TV의 전원 상태)
		// TV가 꺼져있으면 TV를 켠다.
		// TV가 켜져있으면 TV를 끈다.
		boolean isPowerOn = false;
		
		// 전원 버튼 누름
		if(isPowerOn == false) {
			System.out.println("TV를 켠다.");
			isPowerOn = true;
		}else {
			System.out.println("TV를 끈다.");
			isPowerOn = false;
		}
		
		// isPowerOn이 false면 TV를 켠다.
		if(isPowerOn) {
			System.out.println("TV를 끈다.");
			isPowerOn = false;
		}else {
			System.out.println("TV를 켠다.");
			isPowerOn = true;
		}
		 
		// ! 를 이용하는 방법
		if(!isPowerOn) {
			System.out.println("TV를 켠다.");
			isPowerOn = !isPowerOn;
		}else {
			System.out.println("TV를 끈다.");
			isPowerOn = !isPowerOn;
		} 
		
		// if문의 모든 조건에서 동일한 코드가 실행되면
		// 해당 코드는 if문 내부에 있을 필요가 없다.
		if(!isPowerOn) {
			System.out.println("TV를 켠다.");
		}else {
			System.out.println("TV를 끈다.");
		} 
		isPowerOn = !isPowerOn;
		
		System.out.println("\n============ else if ==============\n");
		
		// 사용자로부터 입력받은 나이에 대해
		// 10대면 "노란티"
		// 20대면 "흰티"
		// 30대면 "초록티"
		// 40대면 "파란티"
		// 그 외 "빨간티" 를 지급(출력)
		
		int inputAge = 33;
		
		// 10대 = 나이가 10살 이상, 20살 미만
		// 20대 = 나이가 20살 이상, 30살 미만
		// ...
		
		if(inputAge >= 10 && inputAge < 20) {
			System.out.println("노란티");
		}else if(inputAge >= 20 && inputAge < 30) {
			System.out.println("흰티");
		}else if(inputAge >= 30 && inputAge < 40) {
			System.out.println("초록티");
		}else if(inputAge >= 40 && inputAge < 50) {
			System.out.println("파란티");
		}else {
			System.out.println("빨간티");
		}
		
		
		// score 가 90점 이상이면 A, 80점 이상이면 B
		// 70점 이상이면 C, 그 외 나머지는 D 출력
		
		// 90점대 : 점수가 90점 이상
		// 80점대 : 점수가 80점 이상 90점 미만
		// 70점대 : 점수가 70점 이상 80점 미만
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80 && score < 90) {
			System.out.println("B");
		}else if(score >= 70 && score < 80) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		if(score >= 90) {  // false가 났다면 score가 90점 미만 
			System.out.println("A");
		}else if(score >= 80) {  // score가 90점 미만
			System.out.println("B");
		}else if(score >= 70) {  // score가 80점 미만
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		score = 93;
		
		// 나름 순서에 주의를 해야한다.
		if(score >= 70) {  
			System.out.println("C");
		}else if(score >= 80) {  
			System.out.println("B");
		}else if(score >= 90) {  
			System.out.println("A");
		}else {
			System.out.println("D");
		}
		
		
		System.out.println("\n=============================\n");
		
		// 회원가입 조건체크
		// 이름은 한글자 이상
		// 나이는 14세 이상
		// 휴대폰 번호는 10자리 또는 11자리
		String name = "정찬웅";
		int age = 10;
		String phone = "01073987332";
		
		if(name.length() > 0) {
			// 이름 조건 통과
			if(age >= 14) {
				// 나이 조건 통과
				if(phone.length() == 10 || phone.length() == 11) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("불통");
				}
			}else {
				System.out.println("불통");
			}
		}else {
			System.out.println("불통");
		}
		
		
		// 논리연산자 이용 
		if(name.length() > 0 
				&& age >= 14 
				&& (phone.length() == 10 || phone.length() == 11) ) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("불통");
		}
		
		System.out.println("\n=============== switch ====================\n");
		
		// switch 문
		// if문으로도 충분히 구현 가능
		// 특정 변수에 대한 값에 따라 다른 구문을 실행하는 경우 사용
		
		// 학생들의 교육기간 (단위: 월)
		int month = 2;
		
		if(month == 0) {
			System.out.println("자바 수업");
		}else if(month == 1) {
			System.out.println("DB 수업");
		}else if(month == 2) {
			System.out.println("HTML/CSS/JS 수업");
		}else if(month == 3) {
			System.out.println("스프링 수업");
		}else if(month == 4) {
			System.out.println("파이썬 수업");
		}else if(month == 5) {
			System.out.println("미니 팀프로젝트 진행");
		}else {
			System.out.println("팀프로젝트 진행");
		}
		
		// 위의 if문을 switch문으로 변경
		// switch문의 소괄호 안에는 변수를 넣는다.
		switch(month) {
			case 0:
				System.out.println("자바 수업");
				break;  // 실행 후 나머지 case 구문이 실행되지 않도록 함
			case 1:
				System.out.println("DB 수업");
				break;
			case 2:
				System.out.println("HTML/CSS/JS 수업");
				break;
			case 3:
				System.out.println("스프링 수업");
				break;
			case 4:
				System.out.println("파이썬 수업");
				break;
			case 5:
				System.out.println("미니 팀프로젝트");
				break;
			default:  // if문의 else에 해당
				System.out.println("팀 프로젝트");
		}
		
	}
	
}
