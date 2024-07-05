package ch05_control;

import java.util.Scanner;

public class LoopWhileMain {
	
	public static void main(String[] args) {
		// while문
		
		// while(조건)
		// 조건이 true라면 while 중괄호 블록{} 내부 코드가 반복실행
		
		// while문으로 콘솔창에 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int num = 1;  // 초기화식
		while(num <= 10) {  // 조건식
			System.out.println(num);
			num++;  // 증감식
		}
		
		// 일반적으로 for문은 반복횟수가 정해져있는 경우 사용
		// while문은 반복횟수가 정해져있지 않은 경우에 사용
		
		System.out.println("\n===============================\n");
		
		boolean isRun = true;
		Scanner scan = new Scanner(System.in);
		
		// 장바구니
		// 물품 이름을 입력하면 문자열에 해당 물품명이 추가되도록 구현
		String cart = "";
//		while(isRun) {
//			System.out.print("물품 입력[종료:q]: ");
//			String name = scan.nextLine();
//			
//			if(name.equals("q")) {
//				isRun = false;
//			}else {
//				cart += name;
//				System.out.println("장바구니: " + cart);
//			}
//		}
		
		// break 문 적용
		cart = "";
		while(true) {
			System.out.print("물품 입력[종료:q]: ");
			String name = scan.nextLine();
			
			if(name.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			cart += name;
			System.out.println("장바구니: " + cart);
		}
		
		// while(true) 안에 break 없으면 Unreached Codo에 해당
		System.out.println("닿을 수 없는 너");
		
		System.out.println("\n==============================\n");
		
		// 포켓몬스터 게임
		
		// 야생의 포켓몬을 만나서 결투를 하고, 잡기
		int hp = 100;
		// 외부 while문에 outer라는 이름 부여
		outer: while(true) {
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">>> ");
			
			// 사용자의 입력을 받자마자 int 타입으로 형변환
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				// 공격
				while(true) {
					System.out.println("공격 방법 선택");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">>> ");
					
					int attack = Integer.parseInt(scan.nextLine());
					
					if(attack == 1) {
						System.out.println("피카츄 백만볼트!");
						hp -= 40;
					}else if(attack == 2) {
						System.out.println("전광석화!!");
						hp -= 20;
					}else if(attack == 3) {
						System.out.println("공격 취소");
						// 내부 while문 종료
						// 외부 while문은 계속 실행
						break;
					}
					
					System.out.println("파이리의 현재체력: " + hp);
					
					// 파이리의 체력 체크
					if(hp <= 0) {
						System.out.println("파이리를 잡았다!!");
						// 외부 while문을 종료하길 원함
						// 외부 while문 outer를 break(종료) 시킨다.
						break outer;
					}
				}
				
			}else if(command == 2) {
				// 도망
				System.out.println("도망쳤습니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
}
