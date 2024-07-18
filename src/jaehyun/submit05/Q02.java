package jaehyun.submit05;

public class Q02 {
	public static void main(String[] args) {
		
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
		
	}
	
	public static String reverseStr(String word) {
		String result = "";
		
		// word에서 앞에서부터 한글자씩 잘라서 result에 추가
		for(int i = 0; i < word.length(); i++) {
			String one = word.substring(i, i+1);
			result = one + result;
		}
		
		return result;
	}
	
}
