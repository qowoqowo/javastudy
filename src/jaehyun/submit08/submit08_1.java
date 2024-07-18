package jaehyun.submit08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class submit08_1 {

	public static void main(String[] args) {
		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);
		
		
	}
	
	
	public static ArrayList<Integer> makeLotto(){
		HashSet<Integer> lottoSet = new HashSet<>();
		
		while(lottoSet.size() < 6) {
			int random = (int)(Math.random() * 45) + 1;
			
			// 6, 10, 13, 8, 4, 1
			lottoSet.add(random);
			
//			if(lottoSet.size() == 6) {
//				break;
//			}
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(lottoSet);
		
		Collections.sort(result);
		
		return result;
	}
	
	
}
