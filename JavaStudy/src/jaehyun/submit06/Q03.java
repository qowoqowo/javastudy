package jaehyun.submit06;

import java.util.Arrays;

public class Q03 {
	
	public static void main(String[] args) {
		
		int[] myLotto = makeLotto();
		for(int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		
		// 로또 시뮬레이션 만들기
		// 당첨번호 4, 5, 9, 11, 37, 40
		int[] winLotto = {4, 5, 9, 11, 37, 40};
		
		int num = 0;
		while(true) {
			int[] lotto = makeLotto(); // [4, 5, 9, 11, 37, 40]
			num++;
			System.out.println(num + "개 구매");
			
			// 방금 뽑은 lotto가 당첨되었는지 확인?
			// 같은 자리의 숫자를 하나하나 꺼내서 비교
			// 같다면 카운트를 세어서 6이 된다면 당첨!!
			int count = 0;
			for(int i = 0; i < lotto.length; i++) {
				// i = 0, 1, 2, 3, 4, 5
				if(winLotto[i] == lotto[i]) {
					count++;
				}
			}
			
			if(count == 6) {
				System.out.println("당첨!!!!!!!!!!!!!");
				System.out.println("총 비용: " + (num * 1000L));
				break;
			}
		}
		
		
	}
	
	public static int[] makeLotto() {
		// 로또번호 6개를 담은 배열을 리턴
		int[] result = new int[6];  // 30,20,43,12,22,45
		
		int idx = 0;
		
		// 몇번 반복? -> 몰?루
		while(idx < 6) {
			int random = (int)(Math.random() * 45) + 1;
			
			// 방금 생성된 random 번호가 result 배열 내에
			// 존재하는지 체크 -> 존재하지 않으면 넣기
			
			// 스위치 역할을 할 boolean 변수 선언
			boolean isDuple = false;  // 스위치 OFF
			
			for(int i = 0; i < result.length; i++) {
				// i = 0, 1, 2, 3, 4, 5
				if(result[i] == random) {
					isDuple = true;  // 스위치 ON
				}
			}
			
			// for문이 끝난 후 isDuple가 false라면
			// 방금 생성한 random이 result 배열 내에 없음
			// -> 배열에 담기
			if(isDuple == false) {
				result[idx] = random;
				idx++;
			}
		}
		
		// result 를 오름차순으로 정렬
		Arrays.sort(result);
		
		return result;
	}
	
	
	
}
