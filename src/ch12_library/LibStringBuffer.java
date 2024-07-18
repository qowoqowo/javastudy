package ch12_library;

public class LibStringBuffer {
	public static void main(String[] args) {
		// 문자열? -> String 타입!
		// String의 문자열 값을 수정하게 되면
		// 힙 메모리 영역에 새로운 String 객체가 만들어지고
		// garbage collector 가 기존 String 객체를 지우는 등
		// 메모리적으로 비효율적이다, 시간도 오래걸림(= 성능 떨어짐)

		// 문자열을 수정해야하는 경우
		// StringBuffer 나 StringBuilder 를 이용하는 것이 권장됨
		// StringBuffer 와 StringBuilder의 사용법은 같다.
		StringBuffer strBuff = new StringBuffer();
		System.out.println(strBuff); // 빈 문자열과("")같음
		StringBuilder strBuild = new StringBuilder();

		// 문자열 추가
		strBuff.append("안녕하세요");
		System.out.println(strBuff);

		strBuff.append("굿모닝");
		System.out.println(strBuff);

		// 문자열 비우기
		strBuff = new StringBuffer();

		// 객체 생성시 문자열 넣기
		strBuff = new StringBuffer("안녕하세요");
		System.out.println(strBuff);

		// StringBuffer -> String 값 꺼내기
		String hi = strBuff.toString();

		// 랜덤 숫자 1000만 자리 생성
		// String은 10초 걸림
		// StringBuffer는 50만 0.04초, 1000만 0.15초, 1억 2.49초
		// StringBuilder는 1000만 0.299초, 1억 2.521초
		String number = "";
		StringBuffer numberBuff = new StringBuffer();
		StringBuilder numberBuild = new StringBuilder();

		// 프로그램 실행시간 체크
		// for문 진입 전 시간 기록
		long before = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
//			number += (int)(Math.random() * 10);
			numberBuild.append((int) (Math.random() * 10));

			// 경과 중인 상태 확인
			// 10만 단위마다 출력
			if (i % 100000 == 0) {
				System.out.println(i + ". . .");
			}
		}
		// for문 끝난 후 시간 기록
		long after = System.currentTimeMillis();

		// 시간 차이 계산
		long diffMillSec = after - before;

		// 초 단위 환산
		double diffSec = diffMillSec / 1000.0;

		System.out.println(diffSec + "초 소요됨");

		// 둘의 차이점은?
		// StringBuffer는 동기화를 지원
		// StringBuilder는 동기화를 미지원

		// 동기화 지원?
		// 멀티 쓰레드 환경에서 해당 객체가
		// 모든 쓰레드에 대해 안정적으로 사용된다.

		// 동기화 지원 StringBuffer
		// 쓰레드 A, B, C 에서 각각의 쓰레드들이
		// 하나의 StringBuffer 객체를 사용하는 경우
		// 쓰레드 A가 StringBuffer 객체를 사용하면
		// 다른 쓰레드 B, C 에서 이를 안다 (= 안정적)
		// 단일 쓰레드에서 조금 낮은 성능

		// 동기화 미지원 StringBuilder
		// 쓰레드 A, B, C 에서 각각의 쓰레드들이
		// 하나의 StringBuilder 객체를 사용하는 경우
		// 쓰레드 A가 StringBuilder 객체를 사용하면
		// 다른 쓰레드 B, C 에서 이를 모를 수 있음 (문제가 발생할 수 있음)
		// 단일 쓰레드에서 좀 더 좋은 성능
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
