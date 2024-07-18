package ch15_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageRename {

	public static void main(String[] args) {
		// temp\dog.jpg 를 puppy.jpg 로 이름 변경
		// dog.jpg 를 읽어서 동일한 위치에 puppy.png로 복사한 후
		// dog.jpg 를 삭제
		String dogPath = "C:\\temp\\dog.jpg";
		String copyPath = "C:\\temp\\puppy.jpg";
		
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
