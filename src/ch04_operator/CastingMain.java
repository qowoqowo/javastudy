package ch04_operator;

public class CastingMain {

	public static void main(String[] args) {
		// 형변환 (Casting)
		// 형변환이 가능한 경우에 대해 적절하게 형변환을
		// 이용하여 문제를 해결할 수 있다.
		
		int intNum = 15;
		
		System.out.println(intNum / 2);
		
		// int / int 은 int 타입으로 리턴
		// 15 / 2 = 7.5 -> 7  (반올림 x)
		int div = intNum / 2;
		
		double doubNum = 1.23;
		
		// 정수 곱하기/나누기 소수는 소수 타입으로 리턴
		System.out.println(intNum * doubNum);
		
		// 정수 뒤에 .0 을 붙이면 소수타입으로 인식
		System.out.println(intNum / 2.0);
		
		// int 타입 변수에 long값을 넣으려하면 에러 발생
//		int num = 20L;
		
		// long 타입 변수에 int값을 넣으면 에러 없음
		long longNum = 20;  // 20 이라는 int 값이 long 타입으로 자동 형변환되어 담김
		
		// 강제 형변환
		// long 값 -> int 값으로 형변환
		// 형변환 하고자 하는 대상 앞에 (타입)을 적어준다.
		int num = (int)20L;
		System.out.println(num);
		
		// int가 담을 수 없는 값에 대해 강제 형변환
		num = (int)3000000000L;  // 30억
		System.out.println(num);
		
		// byte -128~127
		byte temp = 127;
		temp++;
		// 담을 수 있는 범위를 초과하면 시작값으로 돌아간다.
		System.out.println(temp);  
		
		
		// 소수타입 -> 정수타입 (강제 형변환)
		int intCast = (int)3.45;
		System.out.println(intCast);
		
		
		// 평균값 계산
		int total = 271;
		System.out.println(total / 3);  // 90.33333 에 대해 정수로 리턴
		
		// total이나 3 둘 중 하나를 double 타입으로 형변환 시킨 후 연산
		double avg = (double)total / 3;
		System.out.println(avg);
		
		// 사칙연산에서 연산순서가 존재
		// 소괄호가 먼저 연산되므로, 소괄호만 잘 쓰면 연산순허 외울 필요 없음
		System.out.println(1 + 2 * 3);
		System.out.println(1 + (2 * 3));
		System.out.println((1 + 2) * 3);
		
		// 숫자형 문자열 -> 정수로 형변환
		String strNum = "235";
		
		// String + int 는 int가 문자열로 자동형변환된 후 문자열 이어붙이기가 됨 
		System.out.println(strNum + 2);  // "2352"
		
		int result = Integer.parseInt("235");  // "235" -> 235
		System.out.println(result + 2);
		
		
		// 정수 -> 숫자형 문자열로 형변환
		String str = Integer.toString(235);  // 235 -> "235"
		
		// empty에 의해 235 -> "235"
		str = 235 + "";
		
		
		// 소수형 문자열 -> 소수로 형변환
		double dNum = Double.parseDouble("34.56");  // "34.56" -> 34.56
		System.out.println(dNum + 1.2);
		
		
	}

}
