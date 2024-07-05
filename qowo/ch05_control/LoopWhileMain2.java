package ch05_control;

import java.util.Scanner;

public class LoopWhileMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 포켓몬스터 게임
		
		// 야생의 포켓몬을 만나서 결투를 하고, 잡기
		int hp = 100;
		// 외부 while문에 outer라는 이름 부여
		outer: while(true) {
			System.out.println("야생의 피카츄를 만났습니다.");
			System.out.println("행동을 선택해세요.");
			System.out.println("1. 공격 2.도망");
			System.out.println(">>> ");
			
			// 사용자의 입력을 받자마자 int 타입으로 형변환
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				while(true) {
					System.out.println("공격 방법 선택");
					System.out.println("1. 백만볼트 2. 전광석화 3. 취소" );
					System.out.println(">>> ");
					
					int attack = Integer.parseInt(scan.nextLine());
					
					if(attack == 1) {
						hp = hp - 40;
						System.out.println(hp);
					}else if(attack == 2) {
						hp = hp - 20;
						System.out.println(hp);
					}else if(attack == 3) {
						break;
					}
					System.out.println("피카츄의 현재 체력" + hp);
					
					if(hp <= 0) {
							System.out.println("야생의 피카츄를 잡았다.");
							break outer;
					}
				}
				
			}else if(command == 2) {
				System.out.println("도망");
				break;
			}
			
		}
		
	}

}
