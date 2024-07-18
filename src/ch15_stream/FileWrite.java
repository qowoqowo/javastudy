package ch15_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		
		String idPath = path + "\\src\\files\\경희\\id.txt";
		
		// 파일에 내용을 덮어쓰지 않고 추가하고자 한다면
		// FileWriter의 두번째 파라미터에 true값 넣기
		try(FileWriter writer = new FileWriter(idPath,true)) {
			
			String msg = "이름: 이경희\n";
			
			// byte[] 로 변환하지 않아도 된다.
			writer.write(msg);
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
