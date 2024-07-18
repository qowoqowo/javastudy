package ch10_extends.simple;

// Parent 클래스를 상속받는 클래스 = 자식 클래스
// 클래스 이름 옆에 extends Parent
public class Child extends Parent {

	
	// 부모 클래스(super class)의 생성자를 기반으로
	// 자식 클래스에서 생성자 만들기
	public Child() {
		// 부모 클래스의 기본 생성자
		super();
	}

	public Child(String name, int age) {
		// 부모 클래스의 풀생성자
		super(name, age);
	}
	
	// 클래스, 메소드, 필드변수 등에 @ 에 대해 어노테이션이라고 부른다.
	// Override는 부모 클래스가 가진 메소드를 자식 클래스에서 재정의(수정)
	// 하는 것을 의미한다.
	@Override
	public void hello() {
		// Parent의 hello가 실행됨
//		super.hello();
		
		// 새롭게 바꿈
		System.out.println("안녕하세요 어린이입니다.");
		
	}
	
	@Override
	public String toString() {
		// 부모 클래스에 private 은 사용 불가, public은 super. 이 없어도 사용가능
		return "Child [name=" + super.getName() + ", age=" + getAge() + "]";
	}
	
	
	
	
	
	
	
	
}
