package ch08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionSet {
	
	public static void main(String[] args) {
		// set 집합
		
		// 여러 개의 데이터를 담아서 처리하는데 사용
		// 데이터에 순서가 없음 (인덱스 번호가 없음)
		
		// Set 객체 생성
		// List에 대해 ArrayList를 배웠듯이, Set은 HashSet을 배운다.
		HashSet<String> stuSet = new HashSet<String>();
		HashSet<String> stuSet2 = new HashSet<>();
		
		// 다형성 이용
		List<String> stuList = new ArrayList<>();
		Set<String> stuSet3 = new HashSet<>();
		
		// Set에 값 추가
		// .add(값)
		stuSet.add("연구");
		stuSet.add("재완");
		stuSet.add("영찬");
		stuSet.add("원빈");
		
		// Set에 데이터를 담으면 순서가 없는 상태이다.
		System.out.println(stuSet);
		
		
		// Set의 특징
		// 중복된 값이 들어가지 않는다.
		stuSet.add("연구");
		System.out.println(stuSet);
		
		
		// .contains(값)
		System.out.println(stuSet.contains("연구"));
		
		// .remove(값)
		stuSet.remove("연구");
		System.out.println(stuSet);
		
		// .size()
		System.out.println(stuSet.size());
		
		
		System.out.println("\n=========================\n");
		
		// Set의 각 내부 요소 접근
		
		// 1. Iterator 와 while문 사용
		Iterator<String> stuIter = stuSet.iterator();
		
		while(stuIter.hasNext()) {
			String stu = stuIter.next();
			System.out.println(stu);
		}
		
		
		// 2. 향상된 for문 사용
		for( String stu : stuSet ) {
			System.out.println(stu);
		}
		
		stuSet.forEach(new Consumer<String>() {
			@Override
			public void accept(String stu) {
				System.out.println(stu);
			}
		});
		
		stuSet.forEach(stu -> {
			System.out.println(stu);
		});
		
		System.out.println("\n===========================\n");
		
		// Set의 중복을 허용하지 않는 특성을 이용한 중복제거
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 11) + 10);
		}
		System.out.println(intList);
		
		// ArrayList의 값을 HashSet에 옮기기
		HashSet<Integer> intSet = new HashSet<>();
		
		// for문으로 ArrayList 각 요소를 intSet에 담기
		for(int i = 0; i < intList.size(); i++) {
			intSet.add(intList.get(i));
		}
		
		System.out.println(intSet);
		
		// 내부 요소 비우기
		intSet.clear();
		
		// .addAll() 로 List의 요소들을 Set에 옮길 수 있음
		intSet.addAll(intList);
		
		System.out.println(intSet);
		
		
		// Set의 값을 List에 담기
		intList.clear();
		
		for( int num : intSet ) {
			intList.add(num);
		}
		
		System.out.println(intList);
		
		intList.clear();
		intList.addAll(intSet);
		System.out.println(intList);
		 
		
		
	}
	
}