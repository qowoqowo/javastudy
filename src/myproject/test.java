package myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	// 사용자 지정하기전 3명만 가능할때
	public static void main(String[] args) throws InterruptedException {
		// 1. 설계
		// 무엇을 만들지 정해놔야

		// 어떤걸 만들지 작성

		// 만들때 필요한 객체 생각
		// 객체에 대한 클래스 생성

		// 실행 화면(콘솔창)에 대한 생각

		// 나 (Player), 상대방 (Player), 상대방 (Player)
		// 혈중알코올농도 -> 20%, 100% 이 되면 패배

		// 랜덤 술게임
		// 1. 1 ~ 31 랜덤 숫자 생성
		// 2. 유저가 번갈아가며 숫자를 부름 1~3까지만 가능
		// 3. 숫자를 더하다가 랜덤숫자 보다 높은 수가 되면 벌주

		// 업다운 게임
		// 랜덤 숫자 맞추기


		Scanner scan = new Scanner(System.in);
		
		ArrayList<User> userList = new ArrayList<>();

		userList.add(new User("사용자 1", 100));
		userList.add(new User("사용자 2", 100));
		userList.add(new User("사용자 3", 100));
		
		System.out.print("\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣒⢡⡫⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠮⠭⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣺⠠⢱⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣓⢈⠪⣚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡖⢐⠨⢢⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⡷⡲⠳⡳⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢪⠃⠂⠂⠡⢈⠢⡓⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⢇⠅⠈⠌⠐⠠⠡⡃⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡔⣒⠆⡔⢰⢐⠔⡔⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⠺⠘⠔⠱⠑⠌⠊⠆⡂⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡑⡕⡕⢅⠣⡣⡣⡹⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⡎⠊⠌⡊⠡⠃⡃⡇⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠡⠁⠅⠌⠌⡂⢌⢞⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡱⠡⠁⠌⠐⢈⢐⢕⢅⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡸⠨⠐⡀⢁⠐⡠⢣⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢧⣧⡵⣴⢴⣴⣴⡵⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "");

		Thread.sleep(1000);

		System.out.println("\r\n" + "⠀⠀⠀⠀⠠⠐⢀⠀⢀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠠⠈⠀⠀⠀⠠⠀⠄⠀⠀⠀⠀⠐⠀⠠⠀⠀⠀⠀⠠⠀⠀⡀⠀⢀⠀⠄⠠⠀⠀⠀⠀\r\n"
				+ "⠀⠐⠀⠀⠀⠀⠀⠀⣔⢤⣢⠴⡤⣔⢴⡰⠀⣢⢤⢤⢆⡦⡥⣔⡄⠀⡤⡥⠈⠀⠀⠠⡤⣂⠀⡦⣢⢤⣢⢔⡤⣢⡂⠀⠀⠀⠀⠈⠀⠈\r\n"
				+ "⠀⠀⠈⠀⡀⠄⠀⠀⣺⡽⠚⠛⠓⠛⠚⠚⠀⣺⡽⠛⠓⠓⠛⣞⡎⠀⢯⣟⢼⠂⡸⠼⣞⡇⠀⣟⡞⡓⢓⠛⠚⢓⠃⠀⠄⠀⠀⠈⠀⠁\r\n"
				+ "⠀⠀⠀⠀⡀⠀⡀⠀⢼⢯⠀⡮⣻⢝⡯⡧⠀⣺⡽⡽⣝⢯⣻⢽⡇⠠⣹⡧⠁⡯⡣⢉⣽⡆⠀⣞⣯⣫⣳⣫⡻⣝⠆⠀⡀⠂⠁⠀⠀⠀\r\n"
				+ "⠠⠐⠀⠀⠀⠀⠀⠀⡽⣯⢆⡶⣰⣢⢿⣝⠀⣺⡽⠀⠀⠀⢀⢟⣇⠀⣟⡮⠀⠀⠀⢀⢷⡇⠀⣯⡷⡴⡴⣔⢦⣲⠢⠀⠀⠀⠀⠀⠄⠀\r\n"
				+ "⠀⠀⠐⠀⠀⠀⠀⠀⠙⠙⠙⠙⠙⠚⠙⠑⠀⠑⠛⠀⠀⠈⠀⠋⠃⠀⠙⠙⠀⠐⠀⠀⠋⠃⠀⠋⠋⠋⠋⠙⠙⠚⠃⠀⠀⠀⠀⠂⠀⠈\r\n"
				+ "⠀⠀⠀⠀⡈⠀⠈⠀⣄⡠⣠⢠⡠⡠⠀⣀⢄⢄⡄⣄⢄⠀⣀⡠⣀⣐⣀⣀⡀⠀⣀⢄⣂⣀⣀⣀⡀⠀⡄⣀⢀⡀⡀⣀⠐⠀⡀⠀⠀⠀\r\n"
				+ "⠠⠀⠠⠀⠀⠀⠁⠨⣾⠸⡨⠣⡩⡩⠀⠣⠋⢵⣫⠘⠍⠄⢸⢮⠱⠅⠇⣗⡅⠀⢜⡮⠲⠱⠱⡵⡅⠈⠞⠕⡯⡎⠗⡓⠀⠀⠀⢀⠠⠀\r\n"
				+ "⠠⠀⠂⠀⠀⠀⠀⠰⠯⠿⠽⠽⢝⡮⠀⠠⠀⢺⠧⠀⠀⠀⢺⡯⢯⠿⣽⡻⠆⠀⢝⣯⢿⢽⣻⣻⠆⠀⠀⠀⣽⡣⠀⠀⠀⠀⠀⡀⠀⠠\r\n"
				+ "⠀⠀⠀⠀⠐⠀⡀⠰⣝⣽⣺⣝⣽⣫⠀⠀⠀⣺⢯⠀⠀⠀⣪⣷⠀⢀⣿⣺⡂⠀⢽⡇⠀⠀⠀⣾⡅⠀⢀⠀⣾⡅⠀⠀⠐⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠈⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠂⠈⠀⠀⠀⠀\r\n"
				+ "⠀⠂⠈⠀⠀⠀⠀⠂⠀⠄⠀⠀⠀⠀⡀⠂⠀⠀⠀⠀⠁⠀⠂⠀⠀⠀⠀⠄⠂⠀⠀⠀⠀⠀⠐⠈⠀⠀⠀⠀⠐⠀⠐⠀⠀⠀⠀⠈⢀⠈\r\n" + "");

		Thread.sleep(1000);

		games: while (true) {

			// 시작
			System.out.println("===================================");

			for (int i = 0; i < userList.size(); i++) {
				System.out.println(userList.get(i).getName() + " | 현재 체력: " + userList.get(i).getHp());
				System.out.println("===================================");
			}
			Thread.sleep(1000);
			// 체력 0인사람 체크 후 삭제
			for (int i = 0; i < userList.size(); i++) {
				if (userList.get(i).getHp() <= 0) {
					System.out.println(userList.get(i).getName() + "님 남은 체력: 0 퇴장 입니다.");

					userList.remove(i);

					System.out.println("===================================");
				}
			}
			for (int i = 0; i < userList.size(); i++) {
				if (userList.size() == 1) {
					System.out.println(userList.get(i) + "님 승리 하였습니다.");
					break games;
				}
			}



			System.out.println("게임을 선택해 주세요.");
			System.out.println("1. 랜덤31게임 | 2. 업다운게임 | 3. 랜덤주사위 | 4. 종료");
			System.out.print(">>> ");
			int command = Integer.parseInt(scan.nextLine());

			if (command == 1) {
				// 랜덤 31게임
				int count = 0;

				game1: while (true) {
					System.out.println("======== 랜덤31게임 ========");
					System.out.println("랜덤숫자 이상 인 숫자가 나오면 벌주");
					System.out.println("===================================");
					// 랜덤 숫자 생성
					int maxCount = (int) (Math.random() * 32);
					while (true) {
						for (int i = 0; i < userList.size(); i++) {
							System.out.println(userList.get(i).getName() + "님 1~3 숫자를 입력해주세요.");
							System.out.print(">>> ");
							command = Integer.parseInt(scan.nextLine());
							if(command > 3) {
								command = 3;
							}else if (command < 1) {
								command = 1;
							}
							count += command;
							System.out.println("현재 숫자: " + count);
							System.out.println("===================================");

							if (count >= maxCount) {
								System.out.println("랜덤 숫자는 " + maxCount + " 입니다.");
								System.out.println("===================================");
								System.out.println(userList.get(i).getName() + "님 벌주 당첨!");
								System.out.println("===================================");
								System.out.println(userList.get(i).getName() + "님 체력이 감소합니다.");
								System.out.println("===================================");
								userList.get(i).setHp(userList.get(i).getHp() - 20);
								break game1;
							}
						}
					}
				} // 랜덤 31게임 끝

			} else if (command == 2) {
				// 2. 업다운 게임
				System.out.println("======== 업다운 게임 ========");
				System.out.println("랜덤 숫자 맞추면 벌주제외 최후 1인 벌주");
				System.out.println("===================================");
				game2: while (true) {
					int random = (int) (Math.random() * 51) + 1;

					ArrayList<User> copyList = new ArrayList<>();
					copyList.addAll(userList); // A, B, C

					while (true) {
						for (int i = 0; i < copyList.size(); i++) {
							System.out.println(copyList.get(i).getName() + "님 1~50 숫자를 입력해주세요.");
							System.out.print(">>> ");
							int num = Integer.parseInt(scan.nextLine());

							if (random == num) {
								// copyList에서 맞춘 사람 제외
								System.out.println(copyList.get(i).getName() + "님 정답!");
								System.out.println("랜덤 숫자는 " + random + " 입니다.");
								System.out.println("===================================");

								copyList.remove(i);

								random = (int) (Math.random() * 51) + 1;

								if (copyList.size() == 1) {
									System.out.println(copyList.get(0).getName() + "님 벌주 당첨!");
									System.out.println("===================================");
									System.out.println(copyList.get(0).getName() + "님 체력이 감소합니다.");
									copyList.get(0).setHp(copyList.get(0).getHp() - 20);

									break game2;
								} else if (copyList.size() > 1) {
									System.out.println(copyList.size() + "명 남았습니다.");
								}

							} else if (random > num) {
								System.out.println("===================================");
								System.out.println(copyList.get(i).getName() + " 님 입력한 숫자: " + num);
								System.out.println("===================================");
								System.out.println("업!!");
								System.out.println("===================================");

							} else if (random < num) {
								System.out.println("===================================");
								System.out.println(copyList.get(i).getName() + " 님 입력한 숫자: " + num);
								System.out.println("===================================");
								System.out.println("다운!!");
								System.out.println("===================================");
							}
						}
					}
				}

			} else if (command == 3) {
				// 3. 랜덤주사위
				System.out.println("======== 랜덤주사위 ========");
				System.out.println("주사위를 3번씩 던져 총 합이 낮은사람이 벌주");

				int user1Count = 0;
				int user2Count = 0;
				int user3Count = 0;

				ArrayList<User> copyList = new ArrayList<>();
				copyList.addAll(userList);

				ArrayList<Integer> count = new ArrayList<Integer>();
				count.add(user1Count);
				count.add(user2Count);
				count.add(user3Count);

				game3: while (true) {
					// user 1
					while (true) {

						for (int i = 0; i < userList.size(); i++) {

							// 주사위 3번 던지는 for문

							for (int j = 0; j < userList.size(); j++) {
								int random = (int) (Math.random() * 6) + 1;
								System.out.println("===================================");
								System.out.println(copyList.get(i).getName() + "님 주사위를 던져 주세요.");
								System.out.println("===================================");
								count.set(i, count.get(i) + random);
								Thread.sleep(750);
								System.out.println("주사위 숫자 : " + random);
							}
							Thread.sleep(1000);
							System.out.println("===================================");
							System.out.println(copyList.get(i).getName() + "님 주사위 총합: " + count.get(i));
							Thread.sleep(1500);
						}

						System.out.println("===================================");
						System.out.println("결과는!!!");

						Thread.sleep(1200);

						// 결과 보여주고, 셋 다 같으면 다시,
						// 최소값 찾아서 최솟값에 해당하는 사람 마시기
						// count = [12, 12, 15]
						int min = count.get(0);
						for (int j = 0; j < userList.size(); j++) {
							if (min > count.get(j)) {
								min = count.get(j);
							}
						}
						// 최솟값이 같을때 다 벌주
						for (int i = 0; i < userList.size(); i++) {
							if (count.get(i) == min) {
								System.out.println("===================================");
								System.out.println(copyList.get(i).getName() + "님 벌주 당첨!");
								System.out.println("===================================");
								copyList.get(i).setHp(copyList.get(i).getHp() - 20);
								System.out.println(copyList.get(i).getName() + "님 체력이 감소합니다.");
								Thread.sleep(500);
							}
						}

						break game3;
					}
				}
			} else {
				// 4.종료
				return;
			}

		}

	}

}
