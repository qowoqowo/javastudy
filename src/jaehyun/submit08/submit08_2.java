package jaehyun.submit08;

import java.util.HashMap;
import java.util.Scanner;

public class submit08_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<String, String> infoMap = new HashMap<>();
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");

		System.out.println("아이디를 입력해주세요");
		System.out.print(">>> ");

		String id = scan.nextLine();

		System.out.println("비밀번호를 입력해주세요");
		System.out.print(">>> ");

		String passWord = scan.nextLine();

		// id = "a001"
		// passWord = "1234a"
		if(infoMap.get(id) == null) {
			System.out.println("존재하지 않는 아이디");
		}else {
			// 아이디가 유효함
			if (infoMap.get(id).equals(passWord)) {
				System.out.println("로그인 성공");
			}else {
				// 아이디는 유효하지만 비밀번호가 틀림
				System.out.println("비밀번호가 틀립니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
