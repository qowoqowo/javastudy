package jaehyun.submit05;

public class Q01 {
	public static void main(String[] args) {
		// 5층 트리
		makeTree(5);
		
		// 7층 트리
		makeTree(7);
		
	} // main
	
	public static void makeTree(int n) {
		for(int i = 0; i < n; i++) {
			String blank = "";
			for(int k = 0; k < n - 1 - i; k++) {
				blank += " ";
			}
			String stars = "";
			for(int k = 0; k < (2*i) + 1; k++) {
				stars += "*";
			}
			System.out.println(blank + stars);
		}
		
	}
	
	
	
	
	
}
