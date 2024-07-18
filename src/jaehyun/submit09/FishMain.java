package jaehyun.submit09;

import java.util.ArrayList;
import java.util.Scanner;

public class FishMain {

	public static void main(String[] args) {
		// 바다속 물고기 목록
		ArrayList<Fish> fishList = new ArrayList<>();

		fishList.add(new Fish("고등어", 5000));
		fishList.add(new Fish("광어", 25000));
		fishList.add(new Fish("우럭", 27000));
		fishList.add(new Fish("참돔", 30000));
		fishList.add(new Fish("돌돔", 35000));
		fishList.add(new Fish("능성어", 70000));
		fishList.add(new Fish("다금바리", 120000));

		Scanner scan = new Scanner(System.in);

		// 잡은 물고기를 담을 가방
		ArrayList<Fish> fishBag = new ArrayList<>();
		
		// 미끼의 개수가 10개 있으며
		// 낚시를 할때마다 미끼가 하나씩 소모되면서 미끼의 개수가 출력됨
		// 미끼의 개수가 0개라면 더이상 낚시하기를 할 수 없도록 만들기
		int count = 10;
		

		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
			System.out.print(">>> ");

			int select = Integer.parseInt(scan.nextLine());
			

			
			if (select == 1) {
				
				if(count == 0) {
					System.out.println("미끼가 부족합니다.");
					continue;
				}
				
				
				// TODO 낚시하기
				// fishList 중 랜덤한 물고기를 꺼내서 fishBag 에 담기
				// fishList의 인덱스 0~6, 랜덤숫자 0~6 생성
				int random = (int)(Math.random() * fishList.size());
				
				// 물고기 잡을 확률
				// 다금바리 5%
				// 능성어 10%
				// 돌돔 15%
				// 참돔 15%
				// 우럭 15%
				// 광어 15%
				// 고등어 25%
				
				// 1~100 사이의 랜덤 숫자 생성
				// 1~5 일때 5% -> 다금바리
				// 6~15 일때 10% -> 능성어
				random = (int)(Math.random() * 100)+1;
				int idx = 0;
				if(random <= 5) {
					// 다금바리
					idx = 6;
				}else if(random <= 15) {
					// 능성어
					idx = 5;
				}else if(random <= 30) {
					// 돌돔 
					idx = 4;
				}else if(random <= 45) {
					// 참돔
					idx = 3;
				}else if(random <= 60) {
					// 우럭
					idx = 2;
				}else if(random <= 75) {
					// 광어
					idx = 1;
				}else {
					// 고등어
					idx = 0;
				}
				
				
				Fish catchFish =  fishList.get(idx);
				
				System.out.println(catchFish.name + "을 잡았다!");
				fishBag.add(catchFish);
				
				count--;
				System.out.println("미끼 개수: " + count);
				
			} else if (select == 2) {
				// TODO 잡은 물고기 목록 보기
				int totalPrice = 0;
				System.out.println("내 가방 ====================");
				for(int i = 0; i < fishBag.size(); i++) {
					totalPrice += fishBag.get(i).price;
					System.out.println(fishBag.get(i));
				}
				System.out.println(totalPrice + "원 ==========");
				
				
			} else if (select == 3) {
				// TODO 종료
				break;
			} 

			System.out.println();
		}

	}
	
	
	
	
}
