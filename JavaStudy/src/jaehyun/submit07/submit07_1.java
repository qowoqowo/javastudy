package jaehyun.submit07;

import java.util.ArrayList;

public class submit07_1 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 11) + 10;
			intList.add(random);
		}
		
		System.out.println(intList);
		
		
		// 새로운 리스트 생성
		ArrayList<Integer> newList = new ArrayList<>();
		
		// intList = [16, 13, 20, 18, 19, 20, 20, 10, 15, 15]
		// newList = []
		
		for(int i = 0; i < intList.size(); i++) {
			boolean isContain = false;
			
			for(int k = 0; k < newList.size(); k++) {
				if(intList.get(i) == newList.get(k)) {
					isContain = true;
				}
			}
			
			if(isContain == false) {
				newList.add(intList.get(i));
			}
		}
		
		System.out.println(newList);
		
		
		newList.clear();
		
		for(int i = 0; i < intList.size(); i++) {
			
//			if(newList.contains(intList.get(i)) == false) {
//				newList.add(intList.get(i));
//			}
			
			if(!newList.contains(intList.get(i))) {
				newList.add(intList.get(i));
			}
			
		}
		
		System.out.println(newList);
		
		System.out.println(intList);
		
		// [20, 13, 18, 20, 11, 14, 15, 11, 17, 12]
		for(int i = 0; i < intList.size(); i++) {
			// i=4일때 k=5,6,7,8 (size가 줄면서 놓치는게 생김)
			// k를 뒤에서부터 적용
			// i=4일때 k=8,7,6,5 가 되게끔
			for(int k = intList.size() - 1; k > i; k--) {
				if(intList.get(i) == intList.get(k)) {
					intList.remove(k);
				}
			}
		}
		
		System.out.println(intList);
		
		
	}
}