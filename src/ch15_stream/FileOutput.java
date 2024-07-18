package ch15_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		// Output 자바단에서 파일에 데이터 쓰기
		String path = System.getProperty("user.dir");
		
		// \src\files\건우\id.txt 에 내용 추가
		String idPath = path + "\\src\\files\\건우\\id.txt"; 
		
		// OutputStream은 byte 단위로 데이터 전송
		// 만약 기존 파일에 내용을 추가하고자 한다면 
		// FileOutputStream() 두번째 파라미터에 true 넣기
		try(FileOutputStream fos = new FileOutputStream(idPath, true)) {
			
			// 이름: 도건우 <- 를 전송하고자 한다면
			// String -> byte[] 로 변환하여 전송
			String data = "연락처: 010-7597-8230\n";
			byte[] byteData = data.getBytes();
			
			// 파일에 데이터 쓰기
			fos.write(byteData);
			// 전송 
			fos.flush();
			
			
		} catch (IOException e) { // FileNotFoundException은 IOException을 상속받음
			e.printStackTrace();
		}
		
		// try - with - resource 구문 사용시 close를 간편하게 구현할 수 있다.
		
		System.out.println("\n=====================================\n");
		
		// 현재 존재하지 않는 파일을 생성하면서 데이터 넣기
		// 꼭 프로젝트 경로가 아니어도 파일을 제어할 수 있음
		String tempPath = "C:\\temp\\temp.txt";
		
		try (FileOutputStream fos = new FileOutputStream(tempPath);){
			
			String data = "temp는 Temporary의 약자";
			fos.write(data.getBytes());
			fos.flush();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
