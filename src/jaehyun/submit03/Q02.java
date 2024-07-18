package jaehyun.submit03;

public class Q02 {
	public static void main(String[] args) {
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
		System.out.println(findWally.substring(0, 2));  // i = 0
		System.out.println(findWally.substring(1, 3));  // i = 1
		System.out.println(findWally.substring(2, 4));  // i = 2
		System.out.println(findWally.substring(3, 5));  // i = 3
		
		System.out.println(findWally.substring(58, 60)); // 일리 (여기서 for문이 끝나도록)
//		System.out.println(findWally.substring(59, 61));  // 에러
		
		System.out.println(findWally.length());  // 60글자, 마지막인덱스 = 59
		
		System.out.println("\n============================\n");
		
		int count = 0;
		
		for(int i = 0; i < findWally.length() - 1; i++) {
			// i = 0, 1, 2, 3, ..., 58
			// 왜?  java.lang.StringIndexOutOfBoundsException: begin 59, end 61, length 60
			// 어디서? at chanung.submit03.Q02.main(Q02.java:16)
			// 언제? i가 몇일때인지 확인
			// i가 59일때, 에러 발생
			String wally = findWally.substring(i, i+2);

			if(wally.equals("월리")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
