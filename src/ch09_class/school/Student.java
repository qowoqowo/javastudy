package ch09_class.school;

import ch09_class.common.MyUtil;

public class Student {
	// 캡슐화
	// 다른 클래스에서 객체의 필드변수에 바로 접근하지 못하게 함
	
	// 필드변수에 전부 접근제어자 private
	// 접근제어자
	// 클래스 내 필드변수, 메소드, 생성자에 대해
	// 다른 클래스에서 접근 가능 여부를 제어하는데 사용
	// public : 모든 패키지 폴더의 클래스에서 사용 가능
	// private : 현재 클래스 내에서만 사용 가능
	// 			(같은 패키지 폴더에 있는 다른 클래스에서도 사용불가)
	// protected : 같은 패키지 폴더의 클래스에서만 사용 가능
	// (default) : 접근제어자를 기입하지 않으면 protected 와 같음
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	
	
	
	
	public Student() {
	}

	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calAge();
	}
	
	public Student(String name, int kor, int eng, int math , double avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
	}
	
	// 평균을 계산하여 반영되는 메소드 
	// Student 클래스 내부에서만 사용되는 메소드이므로 private 처리
	private void calAge() {
		this.avg = (kor + eng + math) / 3.0;
		this.avg = MyUtil.myRound(avg, 2);
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}

	
	// 각 필드변수에 대한 Getter 만들기
	public String getName() {
		return name;
	}
	// 각 필드변수에 대한 Setter 만들기
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
		calAge();
	}
	

	// [Alt +Shift + s] 
	// Generate Getters and Setters 

	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
		calAge();
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
		calAge();
	}


	public double getAvg() {
		return avg;
	}
	
	// avg에 대한 Setter를 지움으로써
	// 평균만 수정하는 행위를 차단 (= 무결성) -> 캡슐화의 목적



	
	
	
}
