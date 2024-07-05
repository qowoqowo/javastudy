package submit;

public class Submit03 {

	public static void main(String[] args) {
		int rand = makeRandom(10, 20);
		System.out.println(rand);
	}
	
	
	public static int makeRandom(int a, int b) {
		
		return (int)(Math.random() * (b - a + 1)) + a ;
		
		
		 
	}
	
	
	
	

}
