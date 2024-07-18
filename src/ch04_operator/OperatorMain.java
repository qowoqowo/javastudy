package ch04_operator;

public class OperatorMain {

	public static void main(String[] args) {
		// 연산자 (Operator)
		
		// 산술 연산자
		int numA = 10;
		int numB = 3;
		
		System.out.println(numA);
		System.out.println(numA + 1);
		
		System.out.println(numA);
		
		// 산술연산 형태
		numA = numA + 1;
		
		System.out.println(numA);  // 11
		
		numA = 20 + numA;
		
		System.out.println(numA);  // 31
		
		numA = numA - 21;
		
		System.out.println(numA);  // 10
		
		// 사칙연산
		System.out.println(numA + numB);
		System.out.println(numA - numB);
		System.out.println(numA * numB);  // 곱하기
		System.out.println(numA / numB);  // 나누기 (10 / 3 = 3)
		System.out.println(numA % numB);  // A를 B로 나눈 나머지
		
		System.out.println("\n=============================\n");
		
		// 대입 연산자
		numA = 10;
		
		// 산술 연산
		numA = numA + 5;
		
		// 대입 연산
		numA += 5;  // numA = numA + 5; 와 같음
		System.out.println(numA);  // 20
		
		numA -= 10;
		System.out.println(numA);  // 10
		
		numA *= 3;
		System.out.println(numA);  // 30
		
		numA /= 7;
		System.out.println(numA);  // 4
		
		numA %= 3;
		System.out.println(numA);  // 1
		
		String station = "탄방역";
		// 산술연산 형태
		station = station + " 용문역";
		System.out.println(station);
		
		// 대입연산 형태 (문자열 뒤에 붙음)
		station += " 오룡역";
		System.out.println(station);
		
		// 앞에 문자열을 붙이려면 산술연산 형태만 사용가능
		station = "시청역 " + station;
		System.out.println(station);
		
		// 문자열에 대한 연산은 +만 유효
//		station -= "오룡역";
		
		System.out.println("\n============== 증감연산자 ==================\n");
		
		// 증감연산자
		// 변수에 1을 더하거나, 1을 뺄때 사용
		numA = 10;
		
		numA = numA + 1;
		numA += 1;
		
		// 증감연산 형태
		numA++;  // numA가 1 증가함
		System.out.println(numA);  // 13
		
		numA--;  // numA가 1 감소함
		System.out.println(numA);  // 12 
		
		// ++, --를 왼쪽에 붙여도 연산됨
		++numA;
		System.out.println(numA);  // 13
		
		// 왼쪽과 오른쪽에 따라 실행순서에 영향이 있다.
		System.out.println(++numA);  // 14 -> println() 실행 전 numA에 증감연산 적용
		System.out.println(numA++);  // 14 -> println() 실행 후 numA에 증감연산 적용
		
		System.out.println(numA);  // 15
		
		System.out.println("\n========= 나머지 연산자 ===========\n");
		
		// 홀수, 짝수 판별
		numA = 11;
		
		// 짝수는 어떤 숫자에 대해 2로 나누었을때 나머지가 0인 숫자
		// 홀수는 어떤 숫자에 대해 2로 나누었을때 나머지가 1인 숫자
		System.out.println(numA % 2);  // 0 이면 짝수, 1 이면 홀수
		
		
		// 게시판 페이징 구현
		// 전체 게시글의 개수
		int total = 38324234;
		// 한 페이지당 보여줄 글의 개수
		int show = 15;
		
		// 1 페이지 = 10개
		// 2 페이지 = 10개
		// 3 페이지 = 10개
		// 4 페이지 = 3개
		
		// 마지막 페이지에 나타나는 글의 수
		System.out.println(total % show);
		
		System.out.println("\n============ 비교 연산자 ==============\n");
		
		numA = 10;
		numB = 3;
		double pi = 3.14;
		
		// numA 가 numB 보다 큽니까?
		System.out.println(numA > numB);  // 맞다면 true 리턴 (boolean 타입)
		
		// numA 가 numB 보다 작습니까?
		System.out.println(numA < numB);  // 틀리다면 false 리턴
		
		// 비교연산자의 결과는 boolean 값을 리턴
		boolean isBig = numA > numB;
		System.out.println(isBig);
		
		// 타입이 다른 숫자에 대해서도 비교연산 가능
		System.out.println(numB > pi);
		
		// A가 B보다 작거나 같냐?  A <= B
		// A가 B보다 크거나 같냐?  A >= B
		
		// A가 B와 같습니까? 	   A == B
		System.out.println(numA == numB);
		
		// A가 B와 다릅니까?	   A != B
		System.out.println(numA != numB);
		
		
		// 문자열이 서로 같은지 비교
		String ship = "배";
		String pear = "배";
		
		System.out.println(ship == pear);  // true
		
		String wordA = "기대";
		String wordB = "대나무";
			
		System.out.println( wordA.substring(1) );
		System.out.println( wordB.substring(0, 1) );
		System.out.println( wordA.substring(1) == wordB.substring(0, 1) );  // false
		
		String stomach = new String("배");
		System.out.println(stomach);
		System.out.println(ship == stomach);  // false
		System.out.println(pear == stomach);  // false
		
		
		// 문자열 값이 같은지 비교
		// .equals(문자열)
		// 해당 문자열이 괄호 안 문자열과 같다면 true, 다르면 false 리턴
		System.out.println(ship.equals(stomach));
		
		// 빈 문자열(empty) 체크
		String input = "";
		System.out.println(input.equals(""));
		System.out.println(input.length() == 0);
		
		System.out.println("\n============ 삼항 연산자 ===============\n");
		
		// 사용자가 입력한 아이디가 7글자 이상이면 통과, 7글자 미만이면 불통
		String id = "a0011232";

		// 첫번째 항에는 조건이 들어간다 (결과가 true/false인 조건)
		// 두번째 항에는 조건이 true일때 해당 값이 리턴
		// 세번째 항에는 조건이 false일때 해당 값이 리턴
		String check = (id.length() >= 7) ? ("통과") : ("불통");  
		
		System.out.println(check);
		
		// score가 90점 이상이면 A, 80점 이상이면 B를 grade에 담기
		int score = 75;
		
		// 괄호가 없어도 삼항연산자는 정상 동작
		String grade = (score >= 90) ? "A" : "B";
		
		System.out.println(grade);
		
		// score가 90점 이상이면 A, 80점 이상이면 B, 그 외에는 C를 담기
		grade = (score >= 90) ? ("A") : ( (score >= 80) ? ("B") : ("C") );
		
		System.out.println(grade);
		
		
		System.out.println("\n============= 논리 연산자 ===============\n");
		
		// 논리연산자
		// 조건체크를 여러번 하지 않고 한번에 끝낼 수 있음
		
		// 회원가입시
		// 이름은 한글자 이상
		// 나이는 14세 이상
		// 휴대폰번호는 10자리 또는 11자리
		String inputName = "정찬웅";
		int inputAge = 10;
		String inputPhone = "01073987332";
		
		// 각각 조건 체크
		System.out.println( inputName.length() >= 1 );
		System.out.println( inputName.length() > 0 );
		
		System.out.println(inputAge >= 14);
		
		// 휴대폰 번호가 10자리 여도 true, 11자리 여도 true
		System.out.println(inputPhone.length() == 10);
		System.out.println(inputPhone.length() == 11);
		
		
		// 논리 연산자 OR
		// ||  파이프라인 두개
		// || 의 왼쪽 조건과 오른쪽 조건 중 하나라도 true면 true 리턴
		System.out.println(inputPhone.length() == 10 
				|| inputPhone.length() == 11);
		
		
		// inputPhone.length()가 10이상 11이하 도 마찬가지다
		// 10 <= inputPhone.length() <= 11
		System.out.println(10 <= inputPhone.length());
		System.out.println(inputPhone.length() <= 11);
		
		// 유효한 휴대폰번호라면 위의 두 조건이 모두 true여야 한다.
		
		// 논리연산자 AND
		// &&
		// && 의 왼쪽 조건과 오른쪽 조건이 모두 true일때만 true 리턴
		System.out.println(10 <= inputPhone.length() 
				&& inputPhone.length() <= 11);
		
		
		// !
		// !를 boolean 값 앞에 붙여주면 해당 true/false 값을 뒤집는다.
		// 이름은 1글자 이상 = 이름은 empty가 아니어야 한다.
		// .isEmpty() 는 해당 문자열이 empty일때 true 리턴
		// .isEmpty() 를 통해 문자열이 empty가 아닐때 true 리턴받고자 한다면
		// 앞에 ! 붙여준다.
		System.out.println(inputName.isEmpty());
		System.out.println(!inputName.isEmpty());
		
		
		// 각 조건들이 모두 참일때(true) 회원가입 진행
		boolean nameCheck = !inputName.isEmpty();  // true
		boolean ageCheck = inputAge >= 14;  // false
		boolean phoneCheck = inputPhone.length() == 10 
				|| inputPhone.length() == 11;  // true
		
		// 셋다 true일 때, true가 나오고 회원가입 ㄱㄱ
		System.out.println(nameCheck && ageCheck && phoneCheck);
		
		// 조건 또한 괄호를 잘 사용하기
		System.out.println(!inputName.isEmpty() 
				&& inputAge >= 14 
				&& inputPhone.length() == 10 
				|| inputPhone.length() == 11);
		
		System.out.println(!inputName.isEmpty() 
				&& inputAge >= 14 
				&& (inputPhone.length() == 10 || inputPhone.length() == 11));
		
		
		System.out.println("\n============ 비트 연산자 =================\n");
		
		// 비트 연산자
		int ten = 10;  // 1010
		int nine = 9;  // 1001
					   // 1000 -> 2진수 1000 -> 10진수 8
					   // 1011 -> 10진수 11
					   // 0011 -> 10진수 3
		
		// 비트연산자 AND
		// &
		// 2진수의 각 자리를 비교해서 같은 자리의 숫자가 
		// 둘 다 1이면 그 자리에 1을 남기고,
		// 둘 중 하나라도 1이 아니면 그 자리에 0을 남긴다.
		System.out.println(ten & nine);  // 8
		System.out.println(47 & 23);  // 7
		
		
		// 비트연산자 OR
		// |
		// 2진수의 각 자리를 비교해서 같은 자리의 숫자가
		// 둘 중 하나라도 1이면 그 자리에 1을 남긴다.
		System.out.println(ten | nine);
		
		
		// 비트연산자 XOR
		// ^
		// 2진수의 각 자리를 비교해서 서로 다른경우 그 자리에 1을 남긴다.
		System.out.println(ten ^ nine);
		
		
		
		// 2진수 예시
		// 4가지 취미를 나타내기 위해 숫자로 저장
		// 0001 : 축구를 좋아함
		// 0010 : 야구를 좋아함
		// 0100 : 농구를 좋아함
		// 1000 : 배구를 좋아함
		
		// 기주 : 0101
		int giju = 5;
		
		// 원빈 : 0100
		int wonbin = 4;
		
		// 둘 다 좋아하는 스포츠는?
		System.out.println(giju & wonbin);  // 4 -> 0100
		
		// 두 분 중 한분이라도 좋아하는 스포츠는?
		System.out.println(giju | wonbin);  // 5 -> 0101
		
		
		
	}

}
