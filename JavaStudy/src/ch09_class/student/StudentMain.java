package ch09_class.student;

import java.util.ArrayList;

// main 메소드 보유하고 있는 클래스
public class StudentMain {

	public static void main(String[] args) {
		// 학생 캐릭터들이 존재
		// 처음에 레벨 1로 시작
		// 하루가 지날때마다 경험치가 오름
		
		// 여러 날이 지나면서 경험치가 오르고, 이에 대해 레벨이 오른다.
		
		String dhName = "동희";
		int dhLevel = 1;
		int dhExp = 0;
		
		String jmName = "재민";
		int jmLevel = 3;
		int jmExp = 10;

		// 각 학생들을 객체로 바라보기
		// 객체에 대한 클래스 생성
		// 클래스명 -> Student
		// 이름 -> String name
		// 레벨 -> int Level
		// 경험치 -> int Exp
		
		// 기본생성자로 객체 생성
		Student donghui = new Student();
		
		donghui.name = "동희";
		donghui.level = 1;
		donghui.exp = 0;
		
		
		System.out.println(donghui);
		
		// 풀생성자로 객체 생성
		Student jaemin = new Student("재민", 3, 10);
		System.out.println(jaemin);
		
		
		// 하루가 지나서 경험치가 오른다.
		donghui.exp += 30;
		jaemin.exp = jaemin.exp + 30;
		
		// 경험치가 오를때마다 경험치가 100 이상이 되었는지 체크
		// 100 이상이 되었다면 level 업
		// 하루가 지나서 경험치가 120이 되면 -> level 업 -> 경험치는 20 남게
		if(donghui.exp >= 100) {
			donghui.level += 1; 
			donghui.exp -= 100;
		}
		if(jaemin.exp >= 100) {
			jaemin.level += 1; 
			jaemin.exp -= 100;
		}
		
		
		// 하루가 지날때마다 Student 객체는 아래와 같은 코드 실행됨
		jaemin.exp = jaemin.exp + 30;
		
		if(jaemin.exp >= 100) {
			jaemin.level += 1; 
			jaemin.exp -= 100;
		}
		
		// Student 클래스 내부에 메소드 선언해서 사용
		jaemin.afterOneDay();
		donghui.afterOneDay();
		
		Student hyoshin = new Student("효신", 2, 20);
		
		// 하루가 지남
		donghui.afterOneDay();
		jaemin.afterOneDay();
		hyoshin.afterOneDay();
		
		// 이틀이 지남
		donghui.afterOneDay();
		jaemin.afterOneDay();
		hyoshin.afterOneDay();
		
		
		// 학생 객체 2명 더 생성
		// 보통 처음 객체를 만들면 level = 1, exp = 0 인 경우가 많다.
		// 현재는 매번 level과 exp 값을 일일히 넣어주고 있음
		Student yeongu = new Student("연구", 1, 0);
		Student jaewan = new Student("재완", 1, 0);
		
		// 이름만 입력받는 생성자를 만들고
		// 그때 level은 1, exp는 0 이 자동으로 필드변수에 담기게 만들기
		Student wonbin = new Student("원빈");
		
		
		// 하루가 지남
		donghui.afterOneDay();
		jaemin.afterOneDay();
		hyoshin.afterOneDay();
		yeongu.afterOneDay();
		jaewan.afterOneDay();
		wonbin.afterOneDay();
		
		donghui.afterOneDay();
		jaemin.afterOneDay();
		hyoshin.afterOneDay();
		yeongu.afterOneDay();
		jaewan.afterOneDay();
		wonbin.afterOneDay();
		
		donghui.afterOneDay();
		jaemin.afterOneDay();
		hyoshin.afterOneDay();
		yeongu.afterOneDay();
		jaewan.afterOneDay();
		wonbin.afterOneDay();
		
		// 다수의 객체 처리는 리스트에 담아서 처리
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(donghui); // 인덱스 0
		stuList.add(jaemin);
		stuList.add(hyoshin);
		stuList.add(yeongu);
		stuList.add(jaewan);
		stuList.add(wonbin);
		
		// 하루가 지남
		stuList.get(0).afterOneDay();
		stuList.get(1).afterOneDay();
		stuList.get(2).afterOneDay();
		stuList.get(3).afterOneDay();
		stuList.get(4).afterOneDay();
		stuList.get(5).afterOneDay();
		
		// 하루가 지남
		for(int i = 0; i < stuList.size(); i++) {
			stuList.get(i).afterOneDay();
		}
		
		// 삼일이 지남?
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i < stuList.size(); i++) {
				stuList.get(i).afterOneDay();
			}
		}
		
		
		// 113일 지남
		for(int k = 0; k < 113; k++) {
			for(int i = 0; i < stuList.size(); i++) {
				stuList.get(i).afterOneDay();
			}
		}
		
		
		// stuList 에서 가장 레벨이 높은 학생을 찾아서 출력
		// max 값 찾기와 유사
		Student max = stuList.get(0);
		System.out.println(max);
		System.out.println(max.level);
		
		for(int i = 1; i < stuList.size(); i++) {
			if(max.level < stuList.get(i).level ) {
				max = stuList.get(i);
			}
		}
		System.out.println(max);
		
		
		// 레벨이 43인 학생의 수는?
		int count = 0;
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).level == 43) {
				count++;
			}
		}
		System.out.println(count);
		
		
		// styList 내 이름이 "재완"인 학생 객체를 찾아서 출력
		
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).name.equals("재완")) {
				System.out.println(stuList.get(i));
			}
		}
		
		// 하루가 지남
		for(int i = 0; i < stuList.size(); i++) {
			stuList.get(i).afterOneDay();
		}
		
		// 하루가 지남을 향상된 for 문으로 작성
		
		for( Student stu : stuList) {
			stu.afterOneDay();
		}
		
		// stu 내 Student 객체의 level을 기준으로 정렬하기(내림차순)
		for(int k = 0; k < stuList.size() - 1; k++) {
			for(int i = 0; i < stuList.size() - 1 - k; i++) {
				// i = 0, 1, 2, 3, 4, 5
				// stuList.get(i) -> Student
				// stuList.get(i+1) -> Student
				if(stuList.get(i).level < stuList.get(i+1).level) {
					Student temp = stuList.get(i);  // Integer
					stuList.set(i, stuList.get(i+1));
					stuList.set(i+1, temp);  
				}
			}
		}
		for( Student stu : stuList) {
			System.out.println(stu);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
