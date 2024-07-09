package jaehyun.submit07;

import java.util.ArrayList;

public class submit07_2 {

	public static void main(String[] args) {
		ArrayList<String> wipeList = new ArrayList<>();
		
		wipeList.add("냉장고");
		wipeList.add("로봇청소기");
		wipeList.add("세탁기");
		wipeList.add("에어컨");
		
		ArrayList<String> husList = new ArrayList<>();
		
		husList.add("노트북");
		husList.add("TV");
		husList.add("에어컨");
		husList.add("플레이스테이션");
		husList.add("로봇청소기");
		
		System.out.println(wipeList);
		System.out.println(husList);
		
		ArrayList<String> bothWant = new ArrayList<>();
		
		for(int i = 0; i < wipeList.size(); i++) {
			if(husList.contains(wipeList.get(i))) {
				bothWant.add(wipeList.get(i));
			}
		}
		
		System.out.println(bothWant);
		
		
		ArrayList<String> allList = new ArrayList<>();
		allList.addAll(wipeList);
		
		for(int i = 0; i < husList.size(); i++) {
			if(!wipeList.contains(husList.get(i))) {
				allList.add(husList.get(i));
			}
		}
		
		System.out.println(allList);
		
		
		
		
	}
}