package ch09_class.common;

	//내가 만든 유용한 메소드들을 가지고 있는 클래스
	public class MyUtil {
		/**
		 * Java Doc 주석. 메소드에 대한 설명을 적는 용도
		 * 파라미터로 들어온 소수(num)에 대해 소수 n번째 자리로 리턴해주는 메소드
		 * @param num 반올림하고자 하는 소수
		 * @param n   소수 n번째 자리까지 리턴
		 * @return    반올림된 소수 리턴
		 */
		public static double myRound(double num, int n) {
			int ten = 1;
			for(int i = 0; i < n; i++) {  
				ten *= 10;
			}
			
			num *= ten;  
			
			long round = Math.round(num); 
			
			double result = (double)round / ten; 
			
			return result;
		}
		
		
		
	}

