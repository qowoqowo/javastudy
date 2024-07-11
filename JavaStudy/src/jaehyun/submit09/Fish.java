package jaehyun.submit09;

public class Fish {
	String name;
	int price;
	
	
	public Fish() {
	}



	public Fish(String name, int price) {
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "[" + name + ", 가치: " + price + "]";
	}



}
