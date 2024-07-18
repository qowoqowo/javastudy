package ch11_interface.lol;

// 인터페이스 내에는 추상메소드만 선언 가능
public interface Skill {
	
	
	public abstract void skillQ();
	// 인터페이스에는 abstract 생략 가능
	public void skillW();
	// 추상메소드는 public 이 기본이기 때문에 생략가능
	void skillE();
	void skillR();
	
	
	
	
	
	
	
	
}
