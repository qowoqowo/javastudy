package jaehyun.submit04;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String word = scan.nextLine();
		
		// word = 로꾸꺼
		String result = "";
		
		// word에서 앞에서부터 한글자씩 잘라서 result에 추가
		for(int i = 0; i < word.length(); i++) {
			String one = word.substring(i, i+1);
			System.out.println(one);
			
			result = one + result;
			System.out.println(result);
		}
		
		// word에서 뒤에서부터 한글자씩 잘라서 result에 추가
		// word = 로꾸꺼
		// word.substring(2, 3) - 꺼
		// word.substring(1, 2) - 꾸
		// word.substring(0, 1) - 로
		
		// word = 사다리꼴
		// word.substring(3, 4) - 꼴
		result = "";
		for(int i = word.length()-1; i >= 0; i--) {
			String one = word.substring(i, i+1);
			System.out.println("one = " + one);
			
			result += one;
			System.out.println("result = " + result);
		}
		
		
		
		
		
	}
}
