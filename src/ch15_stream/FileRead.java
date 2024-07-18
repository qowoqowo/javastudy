package ch15_stream;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		// 텍스트 파일을 읽기/쓰기하는 경우
		// FileReader와 FileWriter가 권장됨
		// byte 단위가 아닌 문자(char) 단위로 읽기/쓰기
		
		String path = System.getProperty("user.dir");
		
		String helloPath = path + "\\src\\ch01_start\\HelloWorld.java";
		
		StringBuilder total = new StringBuilder();
		
		try (FileReader reader = new FileReader(helloPath)) {
			
			// 데이터를 옮길 바구니 생성 (char[])
			char[] word = new char[1];
			
			while(true) {
				int count = reader.read(word);
				
				
				if(count == -1) {
					break;
				}
				
				// char[] -> String 변환
				String data = new String(word);
//				System.out.println(data);
				total.append(data);
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(total);
		
	}

}
