package ch16_network;

public class Entp {
	private String name;	/* 회사명 */
	private int count;		/* 제품 수 */
	
	public Entp() {
	}

	public Entp(String name, int count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Entp [name=" + name + ", count=" + count + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
