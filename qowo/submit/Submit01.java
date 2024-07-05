package submit;

public class Submit01 {

	
	
	public static void main(String[] args) {
		makeTree(5);
		makeTree(7);
	}

	public static void makeTree(int n) {

		for (int i = 0; i < n; i++) {
			String blank = "";
			String stars = "";
			
			for (int j = 0; j < n - i; j++) {
				blank += " ";
				
			}
			
			for (int k = 0; k < 2 * i +1 ; k++) {

				stars += "*";

			}
			System.out.println(blank + stars);
		}

	}

}
