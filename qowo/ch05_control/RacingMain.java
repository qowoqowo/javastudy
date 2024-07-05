package ch05_control;

public class RacingMain {
	public static void main(String[] args) throws InterruptedException {
		// 레이싱 게임
		String lane1 = "1. ";
		String lane2 = "2. ";
		String lane3 = "3. ";
		String lane4 = "4. ";
		
		String car1 = "🚙";
		String car2 = "🚌";
		String car3 = "🚓";
		String car4 = "🚑";
		
		// 반복실행하면서 4개의 lane중 하나에 공백문자를 추가
		// lane 중 하나의 글자수가 40이 되면 우승!!
		while(true) {
			// 랜덤 숫자 생성
			// 0~3 사이의 랜덤 숫자 생성
			// Math.random() -> 0 ~ 1 사이의 랜덤 소수 리턴 (1 안나옴)
			// Math.random() * 4 -> 0 ~ 4 사이의 랜덤 소수 (4 안나옴)
			// 해당 소수(double)를 (int)형변환 시키면 0,1,2,3 중 하나 나옴
			int random = (int)(Math.random() * 4);
			
			// 4분의 1확률로 한칸 전진
			if(random == 0) {
				lane1 += " ";
			}else if(random == 1) {
				lane2 += " ";
			}else if(random == 2) {
				lane3 += " ";
			}else if(random == 3) {
				lane4 += " ";
			}
			
			
			// 콘솔창을 깨끗하게 만들기
			// (콘솔창에 줄바꿈을 20번 넣음)
			for(int i = 0; i < 20; i++) {
				System.out.println();
			}
			
			// 각 자동차들의 진행상황을 화면에 출력
			System.out.println(lane1 + car1);
			System.out.println(lane2 + car2);
			System.out.println(lane3 + car3);
			System.out.println(lane4 + car4);
			
			// 각 lane 중 어느 하나라도 length가 40이 되면 게임종료
			if(lane1.length() == 40) {
				System.out.println("1번 차 승리!!");
				break;
			}else if(lane2.length() == 40) {
				System.out.println("2번 차 승리!!");
				break;
			}else if(lane3.length() == 40) {
				System.out.println("3번 차 승리!!");
				break;
			}else if(lane4.length() == 40) {
				System.out.println("4번 차 승리!!");
				break;
			}
			
			// 실행시 컴퓨터가 잠깐 멈추도록 함
			Thread.sleep(100);  // 0.1 초간 쉼
			
			
		}
		
	}
}
