package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CollectionList {

	public static void main(String[] args) {
		// 컬렉션(Collection)
		// 데이터들을 담아서 처리하기 편하게 만들어진 라이브러리
		
		// List에 대해 ArrayList, LinkedList, Vector, ... 등 많다.
		// 사용방법이 전부 같기 때문에 ArrayList만 사용해도 무방
		
		// 리스트는 배열처럼 데이터들을 "순서"대로 저장
		// 각 데이터에 인덱스 번호가 부여
		
		// 리스트(ArrayList)의 선언
		String[] stuArray = new String[5];
		// ArrayList가 담는 데이터의 타입을 <> 안에 작성한다.
		// <> 를 제너릭(generic) 이라고 부른다.
		// 객체? 참조타입 변수로 생각
		ArrayList<String> stuList = new ArrayList<String>(); 
		
		// 뒤쪽에는 제너릭에 타입을 적지 않아도 된다. (위와 같음)
		ArrayList<String> stuList2 = new ArrayList<>();
		
		// 숫자를 담는 ArrayList 선언?
		int[] intArray = new int[4];
//		ArrayList<int> intList = new ArrayList<>();
		
		// 컬렉션 객체는 참조타입 객체만 담을 수 있다.
		// 기본타입 못담음
		
		// 기본타입을 참조타입 객체로 사용해야하는 경우
		// 해당 기본타입의 Wrapper Class를 이용한다.
		ArrayList<Integer> intList = new ArrayList<>();
		
		
		// 기본타입 int <-> Wrapper Class, Integer
		// 기본타입 int 20이 자동 박싱(boxing) 되어 Integer에 담김
		Integer num = 20;
		
		System.out.println(num);  // 20
		
		// Integer의 값이 기본타입 int로 자동 언박싱 되어 담김
		int a = num;
		System.out.println(a);  // 20
		
		// int에 대해 Integer로 사용하더라도 전혀 이질감이 없다.
		
		System.out.println("\n================================\n");
		
		// ArrayList에 담긴 값의 개수 확인
		// .size()
		System.out.println(intList.size());
		
		System.out.println(intArray);  // 배열은 외계어 출력
		System.out.println(intList);   // 리스트는 내용이 출력
		
		// ArrayList에 값 담기
		// .add()
		// 괄호 안 값을 해당 리스트에 담음
		intList.add(1);  // 1 담김 = index 0
		intList.add(5);  // 5 담김 = index 1
		intList.add(3);  // 3 담김 = index 2
		
		System.out.println(intList.size());
		System.out.println(intList);
		
		intArray[0] = 1;
		intArray[1] = 5;
		intArray[2] = 3;
		
		
		// 제너릭<> 타입과 일치하지 않는 데이터는 추가할 수 없음
//		intList.add("얍");
		
		
		// ArrayList 에 담겨있는 값(요소) 꺼내기
		// .get(인덱스)
		// 해당 인덱스의 값을 리턴
		System.out.println(intList.get(1));
		System.out.println(intArray[1]);  // 5
		
		
		// ArrayList 에 담겨있는 값 변경
		intArray[1] = 2;
//		intList.get(1) = 2;
		
		// .set(인덱스, 값)
		// 해당 리스트에서 괄호 안 인덱스 자리에 값을 덮어씀
		intList.set(1, 2);
		
		System.out.println(intList);
		
		
		// .contains(값)
		// 해당 리스트에 괄호 안 값이 들어있으면 true, 없으면 false
		System.out.println(intList.contains(2));
		System.out.println(intList.contains(4));
		
		
		// .indexOf(값)
		// 해당 리스트에 괄호 안 값이 들어있으면 해당 인덱스 번호 리턴
		// 없다면 -1 리턴
		System.out.println(intList.indexOf(2));
		System.out.println(intList.indexOf(4));
		
		// indexOf의 -1 리턴 여부로도 contains 처럼 사용 가능
		System.out.println(intList.indexOf(2) != -1);  // true
		System.out.println(intList.indexOf(4) != -1);  // false
		
		
		// .isEmpty()
		// 리스트가 비어있다면 true, 1개라도 들어있다면 false
		System.out.println(intList.isEmpty());
		System.out.println(intList.size() == 0);
		
		
		// ArrayList 내 요소 삭제
		// .remove(인덱스)
		// 해당 인덱스의 값을 삭제
		intList.remove(1);
		
		System.out.println(intList);
		
		// 삭제를 하면 사이즈가 줄어든다
		System.out.println(intList.size());
		
		// 삭제된 인덱스 이후 요소들은 인덱스가 하나씩 줄어든다 
		System.out.println(intList.get(1));  // 인덱스 2였던 3이 인덱스 1됨
		
		
		// .clear()
		// 해당 리스트를 비움 (size가 0 됨)
		intList.clear();
		System.out.println(intList);
		
		
		// 리스트를 초기화(Initialize)해도 됨
		intList = new ArrayList<>();
		System.out.println(intList);
		
		
		System.out.println("\n=============================\n");
		
		stuList.add("재민");
		stuList.add("동희");
		stuList.add("현규");
		stuList.add("태권");
		stuList.add("원빈");
		stuList.add("건우");
		
		System.out.println(stuList);
		
		// for문으로 각각의 요소 제어
		// String -> .length()
		// String[] -> .length
		// ArrayList<String> -> .size()
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		// 모든 요소에 넘버링 추가되도록 내부 요소 수정
		// 1. 재민
		// 2. 동희
		// 3. 현규
		// 4. 태권
		// 5. 원빈
		// 6. 건우
		for(int i = 0; i < stuList.size(); i++) {
			// i = 0,1,2,3,4,5
			stuList.set(i, (i+1) + ". " + stuList.get(i));
		}
		
		System.out.println(stuList);
		
		
		System.out.println("\n=======================\n");
		
		// 리스트의 복사
		ArrayList<String> copyList = stuList;  // 잘못된 복사
		System.out.println(copyList);
		
		copyList.set(0, "1. 효신");
		System.out.println(stuList);
		
		// .addAll() 사용
		ArrayList<String> copyList2 = new ArrayList<>();
		copyList2.addAll(stuList);  // stuList의 값들이 copyList2에 담김
		
		System.out.println(copyList2);
		copyList2.set(0, "1. 주형");
		System.out.println(stuList);
		
		
		// 생성자 사용
		// stuList의 값들이 copyList3에 담긴 상태로 리스트가 생성됨
		ArrayList<String> copyList3 = new ArrayList<>(stuList);
		System.out.println(copyList3);
		
		
		// 기본로직 사용
		// 새로운 리스트 객체 copyList4를 만들고
		// stuList에 대해 for문으로 각 요소를 꺼내서 copyList4에 담기
		ArrayList<String> copyList4 = new ArrayList<>();
		for(int i = 0; i < stuList.size(); i++) {
			copyList4.add(stuList.get(i));
		}
		System.out.println(copyList4);
		
		
		System.out.println("\n===========================\n");
		
		// 향상된 for문
		// (= 일반적으로 foreach문)
		// stuList에 대해 for문을 사용한다
		// [1. 효신, 2. 동희, 3. 현규, 4. 태권, 5. 원빈, 6. 건우]
		
		// 인덱스가 존재하는 List에서는 향상된 for문의 사용이
		// 큰 메리트가 있지는 않다. for문의 소괄호 부분이 심플해진다는 장점
		for( String stu : stuList ) {
			System.out.println(stu);
		}
		
		
		// 자바의 forEach문
		stuList.forEach(new Consumer<String>() {
			@Override
			public void accept(String stu) {  // accept의 파라미터 stu에 stuList의 값들이 순차적으로 담긴다.
				System.out.println(stu);
			}
		});
		
		
		// 자바의 forEach문에 람다식 적용
		// 람다식은 조금 복잡한, 불편한 코드에 대해
		// 심플하게 작성할 수 있도록 만든 표현식
		// 자바는 -> 사용, 자바스크립트는 =>
		// 코드라인에 화살표 모양이 보인다면 람다식을 사용한 코드다.
		stuList.forEach(stu -> System.out.println(stu));
		
		// 명령어가 여러줄이라면 중괄호 블록을 만들어주어야 함
		stuList.forEach(stu -> {
			System.out.println(stu);
			System.out.println(stu);
			System.out.println(stu);
		});
		
		
		System.out.println("\n===========================\n");
		
		// 값을 주면서 리스트 선언
		
		// 배열을 이용한 방식
		Integer[] numArray = {30, 23, 1, 66, 34, 143};
		
		// 배열 -> List<Integer> 변환
//		List<Integer> numList = Arrays.asList(numArray);
//		System.out.println(numList);
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(numArray));
		System.out.println(numbers);
		
		
		// 배열 거치지 않고 선언
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(30, 23, 1, 66, 34, 143));
		System.out.println(numList);
		
		
		// 정렬
		// 버블정렬 알고리즘 이용
		// 버블정렬을 어디서 했더라?
		// 현재 프로젝트 내 파일 중 "버블정렬"이 적힌 파일 찾기
		// Ctrl + H - File Search 탭 
		// - Containing text에 찾고자하는 문구,코드 입력
		// - File name patterns 에 *.java 적어놓고 Search 버튼 클릭
		
		// numList 에 대해 정렬이 되도록 수정
		for(int k = 0; k < numList.size() - 1; k++) {
			for(int i = 0; i < numList.size() - 1 - k; i++) {
				// i = 0, 1, 2, 3, 4, 5
				// numArray[i] > numArray[i+1] : 왼쪽이 클때 자리바꿈 (오름차순)
				// numArray[i] < numArray[i+1] : 왼쪽이 작을때 자리바꿈 (내림차순)
				if(numList.get(i) < numList.get(i+1)) {
					int tp = numList.get(i);  // Integer
					numList.set(i, numList.get(i+1));
					numList.set(i+1, tp);  // int인 tp가 Integer 변환되어 담김
				}
			}
		}
		
		System.out.println(numList);
		
		
		// 만들어져 있는 정렬 메소드 이용
		Collections.sort(numList);  // 오름차순
		System.out.println(numList);
		
		// 내림차순
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println(numList);
		
		
		
		
	}

}