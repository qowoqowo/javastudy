package jaehyun.submit01;

public class Submit01 {

	public static void main(String[] args) {
		// Q.01
		String name = "홍길동";
		
		int age = 26;
		
		double height = 187.9;
		
		// 전화번호, 차량번호, 주민등록번호, 우편번호, ...
		// 수치나 수량이 아닌 숫자인 경우 문자열로 다룬다.
		// 숫자 계산을 할 일이 딱히 없는 숫자는 문자열로 다룬다.
		String phone = "01073987332";
		
		String email = "akow283@gmail.com";
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: " + email);
		
		
		// Q.02
		String enigma = "너오구늘리뭐너먹구지리"; 
		
		System.out.println(enigma.replace("너", ""));
		
		System.out.println(enigma);
		
		// "너"가 제거된 상태
		enigma = enigma.replace("너", "");
		
		// "너", "구" 가 제거된 상태
		enigma = enigma.replace("구", "");
		
		// "너", "구", "리" 가 제거된 상태
		enigma = enigma.replace("리", "");
		
		System.out.println(enigma);
		
		// Q.03
		String wordA = "기대"; 

		String wordB = "대나무";

		String wordC = "무인도라지";

		System.out.println(wordA.substring(0, 1));
		System.out.println(wordB.substring(0, 1));
		System.out.println(wordC.substring(0, 1));
		
		System.out.println(wordA.substring(1));
		System.out.println(wordB.substring(2));
		System.out.println(wordC.substring(3));  // 유연하지 못함
		
		// 글자 수가 변하더라도 마지막 글자만 자르기
		System.out.println(wordA.length()); // 길이가 2일때 마지막 인덱스 1
		System.out.println(wordB.length()); // 길이가 3일때 마지막 인덱스 2 
		System.out.println(wordC.length()); // 길이가 4일때 마지막 인덱스 3
		
		System.out.println(wordA.substring(wordA.length() - 1));
		System.out.println(wordB.substring(wordB.length() - 1));
		System.out.println(wordC.substring(wordC.length() - 1));
		
		
	}

}
