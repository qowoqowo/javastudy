package jaehyun.submit02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {
		// Q.01
		// 빨간줄 그이는 부분 마우스 커서 올리면 도움말 뜸
		// 빨간줄 그이는 부분 키보드 커서 옮긴 후 Ctrl + 1 눌러도 뜸
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print(">>> ");
		String name = scan.nextLine();
		
		
		System.out.println("국어 점수를 입력해주세요");
		System.out.print(">>> ");
		// Integer.parseInt() 파라미터에 숫자형 문자열이 아닌
		// 다른 문자가 들어가면 에러가 발생
		int kor = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력해주세요");
		System.out.print(">>> ");
		int eng = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력해주세요");
		System.out.print(">>> ");
		int math = Integer.parseInt(scan.nextLine());

		// 평균 = 국어 + 영어 + 수학 / 3
		
		System.out.println("이름: " + name);
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + math);
		
		double avg = (double)(kor + eng + math) / 3;
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f", avg);
		
		
		System.out.println("\n=========================\n");
		
		// Q.02
		
		// int 타입 숫자를 String 타입 숫자로 변환
		int example = 278;
		String strExample = example + "";  // 278 -> "278"
		
		String one = strExample.substring(0, 1);  // "2"
		String two = strExample.substring(1, 2);  // "7"
		String three = strExample.substring(2, 3);  // "8"
		
		int first = Integer.parseInt(one);   // "2" -> 2
		int second = Integer.parseInt(two);  // "7" -> 7
		int third = Integer.parseInt(three); // "8" -> 8
		
		// 코드라인을 줄이는 방식 (코드라인이 줄고, 변수 선언을 덜 할 수 있다)
		// 하지만 코드가 복잡해짐. 가독성이 떨어짐
		System.out.println(Integer.parseInt(strExample.substring(0, 1)) 
				+ Integer.parseInt(strExample.substring(1, 2)) 
				+ Integer.parseInt(strExample.substring(2, 3)));
		
	}

}
