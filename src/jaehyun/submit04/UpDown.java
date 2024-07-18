package jaehyun.submit04;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		
		// 랜덤 숫자 생성 (1~50)
		// Math.random() -> 0 ~ 0.999 사이의 소수
		// Math.random() * 4 -> 0 ~ 3.999 사이의 소수
		// (int)(Math.random() * 4) -> 0,1,2,3 정수
		// Math.random() * 50 -> 0 ~ 49.999 사이의 소수
		// (int)(Math.random() * 50) -> 0 ~ 49 정수
		// (int)(Math.random() * 50) + 1 -> 1 ~ 50 정수
		int random = (int)(Math.random() * 50) + 1;
		System.out.println(random);
		
		// random 숫자를 맞추는 행동을 반복
		Scanner scan = new Scanner(System.in);
		
		// 기회
		int count = 5;
		
		while(true) {
			System.out.print("숫자 입력: ");
			int number = Integer.parseInt(scan.nextLine());
			
			// 기회 차감
			count--;
			
			if(random == number) {
				System.out.println("정답입니다");
				break;
			}
			
			// 기회 모두 소진
			if(count == 0) {
				System.out.println("실패!! 정답은: " + random);
				break;
			}
			
			if(random > number) {
				System.out.println("업!! 남은횟수: " + count);
			}else if(random < number) {
				System.out.println("다운!! 남은횟수: " + count);
			}
		}
		
		
		
		
		
		
		
		
	}
}
