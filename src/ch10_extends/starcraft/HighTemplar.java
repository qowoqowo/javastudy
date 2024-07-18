package ch10_extends.starcraft;

public class HighTemplar extends StarUnit{
	
	private int shield;
	private int mp;
	
	
	public HighTemplar() {
		this("하이템플러", 40,0,0,40,200);
	}

	public HighTemplar(String name, int hp, int damage, int armor, int shield, int mp) {
		super(name,hp,damage,armor);
		this.shield = shield;
		this.mp = mp;
	}
	
	// 사이오닉 스톰
	public void storm() {
		mp -= 75;
		System.out.println("사이오닉 스톰!!");
	}


	@Override
	public String toString() {
		return "HighTemplar [name=" + super.getName() + ", hp=" + super.getHp() 
		+ ", damage=" + super.getDamage() + ", armor=" + super.getArmor() + ", shield="
				+ shield + ", mp=" + mp + "]";
	}

	public int getShield() {
		return shield;
	}


	public void setShield(int shield) {
		this.shield = shield;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}



	
}
