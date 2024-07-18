package ch10_extends.ramen;

public class RamenMain {
	public static void main(String[] args) {
		
		SamyangRamen samyang = new SamyangRamen("삼양라면", 1000, "삼양");
		samyang.printRecipe();
		
		Jjappagheti jjappa = new Jjappagheti("짜파게티", 1200, "농심");
		jjappa.printRecipe();
		
		// 완성되지 않은 메소드 (추상 메소드) 를 가지는 클래스를
		// 객체로 생성할 수 없다.
//		Ramen ramen = new Ramen("신라면", 1000, "농심");
		
		// 추상 메소드를 완성(implement)시키면 객체로 생성할 수 있다.
		Ramen ramen = new Ramen("신라면", 1000, "농심") {

			@Override
			public void printRecipe() {
				System.out.println("끊는 물에 면과 스프를 넣고 3분 후 드세요");
			}
		};
		ramen.printRecipe();
		
		
	}

}
