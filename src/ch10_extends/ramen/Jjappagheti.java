package ch10_extends.ramen;

public class Jjappagheti extends Ramen{
	
	
	public Jjappagheti() {
		this("짜피게티", 1200, "농심");
	}

	
	
	public Jjappagheti(String name, int price, String company) {
		super(name, price, company);
	}



	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 넣어 4분간 삶고 물은 버린 후 스프를 넣어 비벼드셔요");
	}
	
	
	
}
