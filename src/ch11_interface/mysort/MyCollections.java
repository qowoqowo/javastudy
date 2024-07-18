package ch11_interface.mysort;

import java.util.ArrayList;

public class MyCollections  {

	public static <T> void mySort(ArrayList<T> paramList , MyComparator<T> myComp){
		for (int k = 0; k < paramList.size() -1; k++) {
			for (int i = 0; i < paramList.size() - 1 - k; i++) {
				// if 내 기준은 미리 설정해놓을 수가 없음
				// -> 사용할 당시에 완성시켜서 사용하게끔 만듬
				// -> if 조건 안에는 기준에 대한 true / false 값이 리턴되면 됨
				if (myComp.myCompare(paramList.get(i), paramList.get(i+1))) {
					// 파라미터로 넘어온 T의 타입이 T temp 에 적용됨
					T temp = paramList.get(i);
					paramList.set(i, paramList.get(i + 1));
					paramList.set(i + 1, temp);
				}
			}
		}
	}
	
	
	
	// 어떤 ArrayList 든 for문으로 내부 요소 출력 메소드
	// ArrayList<> 제너릭 내부에는 어떠한 객체 타입도 들어올 수 있다.
	// 어떠한 타입을 의미하도록 ArrayList<T> 작성
	// 파라미터에 T를 사용하는 메소드의 경우
	// 리턴타입 앞에 <T> 를 추가해준다.
	public static <T> void printList(ArrayList<T> paramList) {
		for(int i = 0; i < paramList.size(); i++) {
			System.out.println(paramList.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
