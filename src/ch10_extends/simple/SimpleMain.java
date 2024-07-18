package ch10_extends.simple;

import ch09_class.school.Student;

public class SimpleMain {

	public static void main(String[] args) {
		Parent father = new Parent("신형만",30);
		
		System.out.println(father);
		System.out.println(father.toString()); // 위와 같음
		
		father.hello();
		father.work();
		
		Child jjanggu = new Child();
		
		// Parent의 toString 실행결과가 보임
		System.out.println(jjanggu);
		
		// Child 객체는 Parent의 메소드를 가지고 있다.
		jjanggu.hello();
		jjanggu.work();
		
		jjanggu.setName("짱구");
		jjanggu.setAge(5);
		System.out.println(jjanggu);
		
		
		// Child에 Parent의 필드변수값을 입력받는 풀생성자를 만들기
		Child jjangah = new Child("짱아",2);
		System.out.println(jjangah);
		
		
		// Parent의 hello를 Child에서 변경 -> Override
		jjanggu.hello(); // Parent의 메소드를 Child 에서 재정의한 메소드 실행
		jjanggu.work(); // Parent의 메소드 실행
		
		// Object 클래스로부터 객체 생성
		Object god = new Object();
		
		System.out.println(god);
		System.out.println(god.toString());
		
		
		// 다형성 (Polymorphism)
		// 특정 객체가 다양한 타입을 가질 수 있는 성질을 의미함
		Student hobbang = new Student();
		
		// 기본적으로 객체간 형변환 불가
//		Child child = (Child)hobbang;
		
		// 부모, 자식 간에는 형변환이 가능
		// Child -> Parent 형변환
		Parent adultJjanggu = (Parent)jjanggu;
		
		// Parent 에서 있고 Child 에도 있는 메소드면 Child 의 메소드 실행
		System.out.println(adultJjanggu);
		adultJjanggu.hello();
		adultJjanggu.work();
		
		// 기본적으로 Parent -> Child 형변환 불가능
//		Child child = (Child)father;
		
		// Child -> Parent -> Child 는 가능
		Child again = (Child)adultJjanggu;
		
		
		
		
		
		
		
		
		
		
	}

}
