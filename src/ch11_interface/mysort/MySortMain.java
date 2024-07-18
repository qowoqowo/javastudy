package ch11_interface.mysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.school.Student;
import ch10_extends.simple.Parent;

public class MySortMain {
	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<>();

		stuList.add(new Student("짱구", 78, 69, 78));
		stuList.add(new Student("철수", 74, 87, 76));
		stuList.add(new Student("훈이", 88, 84, 86));
		stuList.add(new Student("맹구", 98, 87, 90));
		stuList.add(new Student("유리", 88, 67, 80));

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}

		System.out.println("\n================================\n");

		Collections.sort(stuList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getAvg() - o2.getAvg() < 0) {
					return -1;
				}
				return 1;
			}
		});

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}

		// 인터페이스 Comparator를 객체로 생성
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getAvg() - o2.getAvg() < 0) {
					return -1;
				}
				return 1;
			}
		};

		// sort의 두번째 파라미터는 Comparator 인터페이스 객체를
		// 입력받겠다고 해놓음
		Collections.sort(stuList, comp);

		System.out.println("\n=========================\n");

		// stuList 에 대해 평균을 기준으로 내림차순 버블정렬하기
		// 정렬 로직을 메소드로 만들기 -> myCollections 클래스에 mySort 메소드 만들기
		for (int k = 0; k < stuList.size() -1; k++) {
			for (int i = 0; i < stuList.size() - 1 - k; i++) {
				if (stuList.get(i).getAvg() < stuList.get(i + 1).getAvg()) {
					Student tp = stuList.get(i);
					stuList.set(i, stuList.get(i + 1));
					stuList.set(i + 1, tp);
				}
			}
		}
		
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("\n======================================\n");
		
		MyCollections.mySort(stuList, new MyComparator<Student>() {

			@Override
			public boolean myCompare(Student left, Student right) {
				return left.getAvg() < right.getAvg();
			}
			
		});
		
		
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		ArrayList<Parent> parentList = new ArrayList<>();
		
		parentList.add(new Parent("신형만", 30));
		parentList.add(new Parent("봉미선", 25));
		parentList.add(new Parent("짱구", 5));
		parentList.add(new Parent("짱아", 2));
		parentList.add(new Parent("루피", 18));
		
		for(int i = 0; i < parentList.size(); i++) {
			System.out.println(parentList.get(i));
		}
		
		MyCollections.printList(parentList);
		MyCollections.printList(stuList);
		
		// 인터페이스를 이용한 콜백함수 구현
		MyCollections.mySort(parentList, new MyComparator<Parent>() {
			@Override
			public boolean myCompare(Parent left, Parent right) {
				return left.getAge() < right.getAge();
			}
		});
		
		MyCollections.printList(parentList);
		
		
		MyCollections.mySort(stuList, (left,right) -> left.getKor() > right.getKor());
		MyCollections.printList(stuList);
		
		

	}

}
