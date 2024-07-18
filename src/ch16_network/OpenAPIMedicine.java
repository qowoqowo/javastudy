package ch16_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class OpenAPIMedicine {
	 public static void main(String[] args) throws IOException, ParseException {
	 	// 요청 URL (서버 주소) 생성
	 	// 요청 파라미터 추가
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/DrbEasyDrugInfoService/getDrbEasyDrugList"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=G%2FyYIwXjeGYwjnyD4ILzXE22ekmc%2BZYlA6bwEHASJLqMNjb2Hq99RqFYuDqConJVuf7xxGm4Fcgu2FyvvYfMCw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) Default:xml*/

        // 위에서 만든 URL 에 대한 URL 객체 생성
        URL url = new URL(urlBuilder.toString());
        
        // 해당 URL 주소에 대해 연결 객체 생성
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        // 요청 방식을 GET 으로 설정  
        conn.setRequestMethod("GET");
        
        // 요청시 보내는 데이터 타입 json
        conn.setRequestProperty("Content-type", "application/json");
        
        // 연결된 서버의 응답 코드 확인 (200~300 사이면 정상, 400~500번대는 문제있음)
        System.out.println("Response code: " + conn.getResponseCode());
        
        // 개행문자 단위로 읽어오기 좋은 객체
        BufferedReader rd;
        
        // 응답이 정상인 경우
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
        	// 연결 객체로부터 InputStream 가져와서 BufferedReader에 장착
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
        	// 응답이 정상이 아니라면 연결 객체로부터 ErrorStream 가져와서
        	// BufferedReader에 장착
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        // 응답 데이터를 문자열로 확보하기 위한 StringBuilder 객체 생성 
        StringBuilder sb = new StringBuilder();

        // BufferedReader 로 부터 한줄씩 데이터를 불러다 StringBuilder에 추가
        while (true) {
        	String line = rd.readLine();
            
        	if(line == null) {
        		break;
        	}
        	sb.append(line);
        }
        
        // 자원 객체 정리(close)
        rd.close();
        conn.disconnect();
        
        // 확보한 데이터(String) 출력
        System.out.println(sb.toString()); // JSON String
        
        
        // JSON String -> JSONObject 변환
        JSONParser jsonParser = new JSONParser();
        
        JSONObject json = (JSONObject)jsonParser.parse(sb.toString());
        
        JSONObject body = (JSONObject)json.get("body");
        
        JSONArray items = (JSONArray)body.get("items");
        
        // items의 인덱스 0번 객체에서 활명수만 꺼내서 출력
        JSONObject potion = (JSONObject)items.get(0);
        
        System.out.println(potion.get("itemName"));
        
        // 엑셀 파일 예시 형태로
        // 위 데이터에서 itemSeq, entpName, itemName, efcyQesitm 항목만 꺼내어
        // \\src\\files\\medicine.csv 파일로 만들기
		String path = System.getProperty("user.dir");
		String csvPath = path + "\\src\\files\\medicine.txt";
		
		
		// 인코딩 설정 후 데이터 쓰기
		BufferedWriter buffWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvPath), "UTF-8"));
		
		for(int i = 0; i < items.size(); i++) {
			JSONObject item = (JSONObject)items.get(i);
			
	        String itemSeq = (String)item.get("itemSeq");
	        String entpName = (String)item.get("entpName");
	        String itemName = (String)item.get("itemName");
	        String efcyQesitm = (String)item.get("efcyQesitm");
	        
	        if(efcyQesitm == null) {
	        	continue;
	        }
	        
	        // 증상 값에 있는 개행문자 제거
	        efcyQesitm = efcyQesitm.replace("\n", "");
			
	        String writeLine = itemSeq + "|" + entpName + "|"
	        		+ itemName + "|" + efcyQesitm;
			
	        System.out.println(writeLine);
			
	        buffWriter.write("\uFEFF" + writeLine);
	        buffWriter.newLine();
	        buffWriter.flush();
	        
		}
		
		
		
		
		
		
		
		
		
        
        
        
        
        
    }
}
