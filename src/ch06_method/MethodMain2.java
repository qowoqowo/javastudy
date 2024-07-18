package ch06_method;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {

		// 재귀함수
		// 메소드 내에서 자신 메소드를 실행하는 부분이 있으면 
		// 재귀함수라 부른다.
		// 콘솔창에 10부터 1까지 출력하는 메소드 -> 재귀함수로 만들기
		recursionPrint(10);

		
		// LoopWhileMain 에 했던 포켓몬스터 메소드로 만들기
		playPokemon();
		
	}
	
	public static void recursionPrint(int n) {
		
		System.out.println(n);
		
		// 반복을 끝내는 조건을 주어야 무한반복되지 않음
		if(n == 1) {
			return;  // 메소드 즉시 종료
		}
		
		// 메소드가 반복 실행
		recursionPrint(n - 1);
	}
	 
	
	

	// 복사 - 붙여넣기 하는 경우 tab 라인이 망가지는 경우가 많다.
	// tab 키, Shift + tab 키로 tab 추가/제거 가능
	// 자동 줄맞춤 [Ctrl + Shift + F]

	// 리턴타입이 없는 void 메소드 내에 return 작성 가능
	// (메소드 내에 return 코드가 실행되면 메소드는 즉시 종료)
	public static void playPokemon() {
		// 포켓몬스터 게임
		Scanner scan = new Scanner(System.in);

		// 야생의 포켓몬을 만나서 결투를 하고, 잡기
		int hp = 100;
		while (true) {
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">>> ");

			// 사용자의 입력을 받자마자 int 타입으로 형변환
			int command = Integer.parseInt(scan.nextLine());

			if (command == 1) {
				// 공격
				while (true) {
					System.out.println("공격 방법 선택");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">>> ");

					int attack = Integer.parseInt(scan.nextLine());

					if (attack == 1) {
						System.out.println("피카츄 백만볼트!");
						hp -= 40;
					} else if (attack == 2) {
						System.out.println("전광석화!!");
						hp -= 20;
					} else if (attack == 3) {
						System.out.println("공격 취소");
						// 내부 while문 종료
						// 외부 while문은 계속 실행
						break;
					}

					System.out.println("파이리의 현재체력: " + hp);

					// 파이리의 체력 체크
					if (hp <= 0) {
						System.out.println("파이리를 잡았다!!");
						
						// return 실행시 메소드 즉시 종료
						return;
					}
				}

			} else if (command == 2) {
				// 도망
				System.out.println("도망쳤습니다.");
				break;
			}
		}
	}

}
