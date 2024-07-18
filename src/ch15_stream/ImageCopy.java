package ch15_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {
		String dogPath = "C:\\Users\\302-1\\Downloads\\dog.jpg";
		String copyPath = "C:\\temp\\dog.jpg";
		
		File dogFile = new File(dogPath);

		try (FileInputStream fis = new FileInputStream(dogPath);
				FileOutputStream fos = new FileOutputStream(copyPath)) {
			
			// 데이터를 읽어올 바구나 생성
			byte[] basket = new byte[1];
			
			while(true) {
				int count = fis.read(basket);
				
				if(count == -1) {
					break;
				}
				
				fos.write(basket);
				fos.flush();
				
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// 파일 삭제
		dogFile.delete();
		
		
		
		
		

	}

}
