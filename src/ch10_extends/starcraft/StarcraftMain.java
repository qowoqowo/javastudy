package ch10_extends.starcraft;

import java.util.ArrayList;

public class StarcraftMain {
	public static void main(String[] args) {
		Marine marine = new Marine("마린", 50, 6, 0);
		System.out.println(marine);
		
		Marine marine2 = new Marine();
		System.out.println(marine2);
		
		marine.move(10, 30);
		marine.stimpack();
		
		Zealot zealot = new Zealot();
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		
		System.out.println(zealot);
		
		HighTemplar highTemplar = new HighTemplar();
		System.out.println(highTemplar);
		highTemplar.storm();
		
		// 마린을 잡으러 가기
		zealot.move(10, 30);
		zealot2.move(10, 30);
		zealot3.move(10, 30);
		zealot4.move(10, 30);
		zealot5.move(10, 30);
		zealot6.move(10, 30);
		
		// 한 번에 이동시키기
		ArrayList<Zealot> zealotList = new ArrayList<>();
		
		zealotList.add(zealot);
		zealotList.add(zealot2);
		zealotList.add(zealot3);
		zealotList.add(zealot4);
		zealotList.add(zealot5);
		zealotList.add(zealot6);
		
		for(int i = 0; i < zealotList.size(); i++) {
			zealotList.get(i).move(30, 60);
		}
		
		// 하이템플러도 같이 이동시키기
		// ArrayList<Zealot> 은 HighTemplar를 담을 수 업음
//		zealotList.add(highTemplar);
		
		
		// 다형성 이용
		// 하나의 객체가 여러 타입을 가질 수 있는 성질
		
		// 기본적으로 자식 객체에서 부모 객체로는 형변환이 가능하다.
		StarUnit starZealot = (StarUnit)zealot;
		// 자동형변환이 됨
		StarUnit starHigh = highTemplar;
		
		// Marine 객체 생성 후 Marine -> StarUnit 으로 자동형변환
		StarUnit starMarine = new Marine();
		
		// 기본적으로 부모 객체에서 자식 객체로 형변환이 불가능하다
		StarUnit starSCV = new StarUnit("SCV", 60, 5, 0);
//		Zealot zealotSCV = starSCV;
//		Zealot zealotSCV2 = (Zealot)starSCV;
//		Zealot zealotStar = new StarUnit("질럿", 100 ,16, 1);
		
 		
		ArrayList<StarUnit> starList = new ArrayList<>();
		
		starList.add(zealot);  // Zealot -> StarUnit 자동 형변환 되어 담김
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(zealot5);
		starList.add(zealot6);
		starList.add(highTemplar); // HighTemplar -> StarUnit 
		
		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(25, 40);
		}
		
		// 마린이 질럿을 공격하도록 attack 메소드 추가
		marine.attack(zealot);
		System.out.println(zealot);
		
		// 마린이 하이템플러도 공격하기
		marine.attack(highTemplar);
		System.out.println(highTemplar);
		
		
		// 하이템플러
		System.out.println(starList.get(6));
		
		// starList.get(6) 은 StarUnit 타입이라 storm()을 쓸 수 없음 
//		starList.get(6).storm();
		
		
		// starList.get(6) 에 대해 StarUnit -> HighTemplar 로
		// 되돌려주어야 storm() 사용 가능
		// 부모 클래스로 형변환이 되었던 자식 객체는
		// 다시 자식 클래스로 형변환이 가능하다.
		((HighTemplar)starList.get(6)).storm();
		
		
		// Zealot -> StarUnit 인 객체를 StarUnit -> HighTemplar 로 변환 불가
//		((HighTemplar)starList.get(0)).storm();
		
		
		// 리스트 안에 있는 객체에 대해 
		// 원래 어떤 객체(타입)였는지 확인하기
		
		for(int i = 0; i < starList.size(); i++) {
			if(starList.get(i).getName().equals("하이템플러")) {
				((HighTemplar)starList.get(i)).storm();
			}
			
			// instanceof 사용
			// 객체 instanceof 클래스
			// 좌측 객체가 우측의 클래스로 형변환이 가능하다면 true 리턴
			// 형변환이 불가능하면 false 리턴
			if(starList.get(i) instanceof HighTemplar) {
				((HighTemplar)starList.get(i)).storm();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
