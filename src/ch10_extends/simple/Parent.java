package ch10_extends.simple;

// 상속을 해주는 클래스 = 부모 클래스
public class Parent {
	private String name;
	private int age;
	
	
	public Parent() {
		super();
	}


	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void hello() {
		System.out.println("안녕하세요 어른입니다.");
	}
	
	public void work() {
		System.out.println("열심히 일하는 중");
	}
	
	
	// 모든 클래스는 보이지 않지만 Object 클래스를 상속받고 있다.
	// toString 메소드는 Object 클래스에 존재하는 메소드
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
