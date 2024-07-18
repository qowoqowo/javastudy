package ch10_extends.ramen;

public class SamyangRamen extends Ramen {
	
	
	public SamyangRamen() {
		this("삼양라면", 1000, "삼양");
	}


	public SamyangRamen(String name, int price, String company) {
		super(name,price,company);
	}


	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 3분");
	}
	
	
}
