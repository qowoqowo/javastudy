package ch15_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GameLog {

	public static void main(String[] args) {
		
		
		// 강화 게임
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		
		System.out.println("아이디 입력: ");
		
		String id = scan.nextLine();
		
		int grade = 1;  // 현재 무기 등급
		
		while(true) {
			System.out.println("현재 강화: "+ grade);
			System.out.println("강화 확률 50%");
			System.out.println("1. 강화 | 2. 종료");
			System.out.println(">>> ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				// 강화 시도
				int random = (int)(Math.random() * 2);
				
				if (random == 0) {
					// 강화성공
					grade++;
					
					String date = sdf.format(new Date());
					
					saveLog(date + " | " + id + "님이 강화에 성공하였습니다." 
					+ (grade -1) + " -> " + grade);
					
				}else {
					// 강화 실패
					grade--;
					
					String date = sdf.format(new Date());
					
					saveLog(date + " | " +id + "님이 강화에 실패하였습니다." 
					+ (grade +1) + " -> " + grade);
				}
				
				
				
			}else {
				break;
			}
		}
		
		
		
		
	}
	
	// 로그 파일에 텍스트를 저장하는 메소드
	public static void saveLog(String log) {
		String logPath = "C:\\temp\\log.txt";
		
		try(FileWriter writer = new FileWriter(logPath , true)) {
			writer.write(log + "\n");
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
