package ch05_control;

public class LoppForMain2 {

	public static void main(String[] args) {
		// 반복문(loop) - for문
		// 콘솔창에 20부터 40까지 출력
		for(int i = 0; i <= 20; i++) {
			System.out.println(i + 20);
			
		}
		
		// 트리
		//     *		
		//    ***
		//   *****
		//  *******
		// *********
		
		for(int i = 0; i < 5; i++) {
			
			String blank = "";
			
			for(int j = 0; j < 4 - i; j++) {
			
				blank = blank + " ";
			}
			String star = "";
			for(int j = 0; j < (2*i)+1 ; j++) {
				star = star + "*";
				
			}
			System.out.println(blank + star);
		}
		
	}

}
