package ch15_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ReadCSV {

	public static void main(String[] args) {

		// .csv 파일을 읽을 떄 개행문자를 기준으로
		// 한줄씩 읽어오면 편하다.

		// BufferedReader 의 readLine 을 이용
		String path = System.getProperty("user.dir");

		String csvPath = path + "\\src\\ch15_stream\\kr_korean.csv";
		
		ArrayList<String> wordList = new ArrayList<>();
		HashSet<String> wordSet = new HashSet<>();
		
		try (BufferedReader buffReader = new BufferedReader(new FileReader(csvPath))) {

			while (true) {
				// 개행 문자를 기준으로 한줄씩 읽어온 데이터를 String으로 리턴
				String line = buffReader.readLine();

				// 더이상 개행문자가 없으면 null 값 리턴
				if (line == null) {
					break;
				}

				// line = "힝이,명사" 인 형태
				// 명사만 다루겠다.
				// data[0] = "힝이", data[1] = "명사"
				String[] data = line.split(",");

				if (data.length < 2) {
					continue;
				}

				if (data[1].equals("명사")) {
					// data[0] 에 - 제거
					String word = data[0].replace("-", "");
					
					// word가 한글 2~3자리인 경우만 wordSet에 담기
					// 정규표현식 사용
					if(word.matches("^[가-힣|ㄱ-ㅎ|ㅏ-ㅣ]{2,3}$")) {
						wordSet.add(word);
					}
					
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(wordSet);
		
		// 데이터를 정제한 후 새로운 .csv 파일로 저장
		String myCsvPath = path + "\\src\\ch15_stream\\my_korean.csv";
		
		// write 를 할때마다 개행문자를 자동으로 넣어주면 편하다.
		// BufferedWriter 사용
		
		try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(myCsvPath));){
			for( String word : wordSet) {
				buffWriter.write(word);
				buffWriter.newLine();
				buffWriter.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터 처리 및 저장이 완료");
		
		
		
		
		
		
		
		
		
	}

}
