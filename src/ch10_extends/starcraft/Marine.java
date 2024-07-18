package ch10_extends.starcraft;

// StarUnit을 상속받도록 함
public class Marine extends StarUnit{
	// Marine, Zealot, HighTemplar
	// 중복되는 필드변수와 메소드를 하나로 묶기 -> StarUnit
	
	
	public Marine() {
		// Marine의 풀생성자를 실행
		this("마린",50,6,0);
	}


	public Marine(String name, int hp, int damage, int armor) {
		super(name,hp,damage,armor);
	}
	
	// 질럿 공격
	public void attack(Zealot target) {
		// 마린의 공격력 만큼 질럿의 체력을 깍음
		target.setHp( target.getHp() - super.getDamage());
		System.out.println("투두두두");
	}
	
	// 하이템플러 공격
	public void attack(HighTemplar target) {
		target.setHp( target.getHp() - super.getDamage());
		System.out.println("투두두두");
	}
	
	// 다형성 적용한 공격 메소드
	public void attack(StarUnit target) {
		target.setHp( target.getHp() - super.getDamage());
		System.out.println("투두두두");
	}
	
	
	// 스팀팩 스킬
	public void stimpack() {
		super.setHp(super.getHp() - 10);
		System.out.println("공격속도 증가");
	}
	

	@Override
	public String toString() {
		return "Marine [name=" + super.getName() + ", hp=" + super.getHp() 
		+ ", damage=" + super.getDamage() + ", armor=" + super.getArmor() + "]";
	}

	
	

}
