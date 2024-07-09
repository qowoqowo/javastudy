package jaehyun.submit06;

public class Q02 {
	public static void main(String[] args) {
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		int max = intArr[0];
		int maxIdx = 0;
		for(int i = 1; i < intArr.length; i++) {
			if(max < intArr[i]) {
				max = intArr[i];
				maxIdx = i;
			}
		}
		
		System.out.println("최댓값: " + max);
		System.out.println("최댓값 인덱스: " + maxIdx);
		
		int min = intArr[0];
		int minIdx = 0;
		for(int i = 1; i < intArr.length; i++) {
			if(min > intArr[i]) {
				min = intArr[i];
				minIdx = i;
			}
		}
		System.out.println("최솟값: " + min);
		System.out.println("최솟값 인덱스: " + minIdx);
		
		
		
		
		
	}
}
