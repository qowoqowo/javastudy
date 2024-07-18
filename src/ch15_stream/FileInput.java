package ch15_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		
		String helloPath = path + File.separatorChar + "src" 
						+ File.separatorChar + "ch01_start"
						+ File.separatorChar + "HelloWorld.java";
		
		// 내용을 읽어오고자 하는 File
		File hello = new File(helloPath);
		
		System.out.println(hello.exists());
		
		FileInputStream fis = null;
		
		// FileInputStream 을 이용한 내용 읽기
		try {
			// FileInputStream의 생성자 내에 file 객체 또는 파일의 풀경로를 넣어준다.
			fis = new FileInputStream(helloPath);
			
			// 데이터를 가져올 그릇 생성(byte[])
			// new byte[1]; 1 바이트 단위로 옮기기 -> 한글이 깨질 수 있다. 
			// new byte[3]; 3 바이트 단위로 옮기기 -> 이 또한 한글이 깨질 수 있다.
			// new byte[fis.available()] -> 파일의 전체 바이트 크기로 옮기기(한번에 옮기기)  
			// InputStream, OutputStream 은 byte 단위로 데이터를 읽기/쓰기
			// 텍스트 파일을 읽기/쓰기 할 때 적합한 방법이 아님
			// 이미지, 오디오, 비디오에 대해 읽기/쓰기 할 때 적합함
			byte[] basket = new byte[fis.available()]; 
			
			while(true) {
				// 파일 내용을 basket에 담음
				// read는 담긴 개수를 리턴
				int count = fis.read(basket);
				
				// 담긴 개수가 0이라면 전부 읽어왔다는 의미
				// 그럼 while문 종료
				if(count == -1) {
					break;
				}
				
				// byte[] -> String 변환
				String data = new String(basket);
				System.out.print(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
