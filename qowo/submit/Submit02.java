package submit;

public class Submit02 {

	public static void main(String[] args) {
		
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
	}
	
	public static String reverseStr(String word) {
		String result = "";
		
		for(int i = 0; i < word.length(); i++) {
			String one = word.substring(i,i+1);
			result = one + result;
			
		}
		
		
		
		return result;
	} 
	
	
}
