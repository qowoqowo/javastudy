package jaehyun.submit09;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	public static void main(String[] args) {
		
		Product ref = new Product("냉장고",2000000);
		Product tv = new Product("TV",1000000);
		Product air = new Product("에어컨",800000);
		Product com = new Product("컴퓨터",1300000);
		Product fan = new Product("선풍기",100000);
		
		
		ArrayList<Product> prodList = new ArrayList<>();
		
		prodList.add(ref);
		prodList.add(tv);
		prodList.add(air);
		prodList.add(com);
		prodList.add(fan);
		
		Collections.sort(prodList, (prodA,prodB)-> prodA.price - prodB.price);
		
		for(int i = 0; i < prodList.size(); i++) {
			System.out.println(prodList.get(i));
		}
		System.out.println("\n======================\n");
		
		for(int k = 0; k < prodList.size() -1; k++) {
			for(int i = 0; i < prodList.size() -1 -k; i++) {
				
				if(prodList.get(i).price > prodList.get(i+1).price) {
					Product temp = prodList.get(i);
					prodList.set(i, prodList.get(i+1));
					prodList.set(i+1, temp);
				}
			}
		}
		for(int i = 0; i < prodList.size(); i++) {
			System.out.println(prodList.get(i));
		}
		
		for(int i = 0; i < prodList.size(); i++) {
			if(prodList.get(i).name.equals("TV")) {
				System.out.println(i);
			}
		}
		
		//
		int myMoney = 1000000;
		
		// 내가 지금 구매가능한 제품 목록
		ArrayList<Product> canBuyList = new ArrayList<>();
		
		// prodList 에서 제품 가격이 myMoney 이하인 제품들만 찾아서 
		// canBuyList 에 추가하기
		
		for(int i = 0; i < prodList.size(); i++) {
			if(myMoney >= prodList.get(i).price) {
				canBuyList.add(prodList.get(i));
			}
			
		}
		System.out.println(canBuyList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
