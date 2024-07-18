package ch11_interface.lol;

// 인터페이스를 implement 구현한다.
// 클래스 이름 옆에 implements Skill 작성
public class Pizz implements Skill{
	String name;
	int damage;
	int hp;
	
	// 인터페이스를 implement 하는 경우
	// 추상메소드를 모두 완성시켜야 한다.
	@Override
	public void skillQ() {
		System.out.println("돌진");
	}
	
	@Override
	public void skillW() {
		System.out.println("강화");
	}
	
	@Override
	public void skillE() {
		System.out.println("점프");
	}
	
	@Override
	public void skillR() {
		System.out.println("소환");
	}
	
	
	
	
	
	
	
}
