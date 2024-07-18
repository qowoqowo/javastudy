package ch10_extends.ramen;

// 추상 메소드를 하나라도 가지고 있는 클래스는 
// abstract 를 넣어서 추상 클래스로 표기한다.
public abstract class Ramen {
	String name;
	int price;
	String company;
	
	
	public Ramen(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	// Ramen을 상속받는 클래스들은 모두 printRecipe를 가지고 있으나
	// 내용이 조금씩 다름 -> printRecipe를 추상메소드로 만들어 놓음
	// 추상 메소드는 중괄호 블록이 없으며, abstract 를 넣어준다.
	// 추상 메소드를 가지고 있는 클래스는 추상클래스로 만들어 준다.
	public abstract void printRecipe();
	
	
}
