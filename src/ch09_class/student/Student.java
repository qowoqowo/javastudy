package ch09_class.student;

public class Student {
	
	String name;
	int level = 1; // 기본값 부여 
	int exp;
	
	public Student() {
		
	}
	// 이름만 입력받는 생성자
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int level, int exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	
	// 보통 생성자 아래에 메소드 선언
	// 하루가 지날 때 실행되는 메소드
	public void afterOneDay() {
		// 경험치는 20~50 사이만큼 오른다.
		exp += (int)(Math.random() * 31) + 20;
		
		if(exp >= 100) {
			level++;
			System.out.println( name + " 레벨업!!");
			exp -= 100;
		}
		System.out.println("현재 "+ name +": LV:"+ level +"(" + exp + "%)");
	}
	public int afterOneDay(int day) {
		// 경험치는 20~50 사이만큼 오른다.
		exp += (int)(Math.random() * 31) + 20;
		
		if(exp >= 100) {
			level++;
			System.out.println( name + " 레벨업!!");
			exp -= 100;
		}
		System.out.println("현재 "+ name +": LV:"+ level +"(" + exp + "%)");
		return day;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", level=" + level + ", exp=" + exp + "]";
	}
	
	
	
}
