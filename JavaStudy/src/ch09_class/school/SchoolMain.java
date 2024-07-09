package ch09_class.school;

import java.util.ArrayList;

import ch09_class.common.MyUtil;

public class SchoolMain {

	public static void main(String[] args) {
		// 학교에 다니는 학생들의 성적을
		// 관리하는 프로그램 만들 예정
		
		// 학생은 이름, 국어, 영어, 수학, 평균을 가진다.
		// 학생에 대해 객체로 바라보고 개발
		// 학생 객체에 대해 클래스로 정의내리기
		// 클래스명 Student
		// 이름 String name
		// 국어 int kor
		// 영어 int eng
		// 수학 int math
		// 평균 double avg
		
		Student hobbang = new Student("호빵맨", 90, 84, 77,(90+84+77)/3.0);
		System.out.println(hobbang);
		
		// 객체의 필드변수에 제한없이 접근 가능
//		hobbang.kor = 92;
		System.out.println(hobbang);
		
//		hobbang.avg = (hobbang.kor + hobbang.eng + hobbang.math) /3.0;
		System.out.println(hobbang);
		
		// 필드변수에 제한없이 접근이 가능한 경우 문제 소지가 많다.
		// 클래스에 캡슐화() 적용
//		hobbang.avg = 70.4;
		System.out.println(hobbang);
		
		// 해당 객체의 특정 필드를 확인하려면?
		// 각 필드변수에 getter를 만들어서 사용
		System.out.println(hobbang.getName());
		
		// 이름을 바꾸자고 한다? -> setter를 만들어서 사용
//		hobbang.getName() = "찐빵맨"; // setter 없이 값 못바꿈
		hobbang.setName("찐빵맨");
		
		System.out.println(hobbang);
		
		// 모든 필드변수에 대해 Getter 만들기
		System.out.println(hobbang.getKor());
		
		System.out.println(hobbang.getAvg());
		
		
		// Setter를 이용하여 점수 변경
		// 점수가 변경이될때마다 평균점수가 변화해야 한다.
		hobbang.setKor(81);
		System.out.println(hobbang);
		
		hobbang.setEng(87);
		System.out.println(hobbang);
		
		// 평균이 변화하는 것은 말이 안되는 상황
		// -> setAvg() 를 없애버림
//		hobbang.setAvg(70.4);
		System.out.println(hobbang);
		
		// 생성자에 이름, 국어, 영어, 수학만 넣더라도
		// 평균이 계산되어 필드변수 avg에 담기도록 수정
		Student sikbbang = new Student("식빵맨", 95,74,85);
		
		System.out.println(sikbbang);
		
		// Myutil 을 객체로 생성
		MyUtil util = new MyUtil();
		System.out.println(util.myRound(3.14159, 2));
		
		// Math.random() 는 Math 를 객체로 생성하지 않고 
		// Math 클래스 내부 random 메소드를 실행
		// random 메소드가 static 이기 때문에 
		// 객체 생성 없이 클래스.random 형태로 사용 가능
		System.out.println(Math.random());
		
		
		// MyUtil 클래스 내 myRound 메소드는 static 메소드이기 때문에
		// MyUtil 을 객체로 생성하지 않고 MyUtil.myRound() 형태로 사용 가능
		
		System.out.println(MyUtil.myRound(3.14159, 2));
		
		
		// Student 클래스 외부에서 calAvg() 를 사용할 일이 없음
		// public 으로 열어두고 안쓰면 그만
		// 무결성, 캡슐화 고려한다면 calAvg() 는 private 으로 두기
//		sikbbang.calAge();
		
		
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(hobbang);
		stuList.add(sikbbang);
		stuList.add(new Student ("카레빵맨", 97 ,88 ,91));
		stuList.add(new Student ("세균맨", 77 ,80 ,92));
		stuList.add(new Student ("꿀빵맨", 84 ,84 ,95));
		stuList.add(new Student ("호떡맨", 69 ,88 ,82));
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("\n============================================\n");
		
		// stuList에 담긴 Student 객체에 대해
		// 평균점수를 기준으로 내림차순 정렬 후 출력
		
		for(int i = 0; i < stuList.size(); i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
