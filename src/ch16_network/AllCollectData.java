package ch16_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AllCollectData {

	public static void main(String[] args) throws IOException, ParseException {
		
		// 모든 데이터 불러다 로컬에 저장하기
		int pageNo = 1;
		while(true) {
			String responseText = requestData(pageNo);
			pageNo++;
			
			// pageNo가 49일때 body 안에 items 가 없을때 이때 false 리턴
			boolean isGood = writeItem(responseText);
			if(!isGood) {
				break;
			}
			
			System.out.println(pageNo);
		}

	}
	
	// 페이지 번호에 대한 데이터 요청 메소드
	public static String requestData(int pageNo) throws IOException {
		 StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/DrbEasyDrugInfoService/getDrbEasyDrugList"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=G%2FyYIwXjeGYwjnyD4ILzXE22ekmc%2BZYlA6bwEHASJLqMNjb2Hq99RqFYuDqConJVuf7xxGm4Fcgu2FyvvYfMCw%3D%3D"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode(pageNo + "", "UTF-8")); /*페이지번호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
	        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) Default:xml*/

	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        BufferedReader rd;
	        
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        
	        StringBuilder sb = new StringBuilder();

	        while (true) {
	        	String line = rd.readLine();
	            
	        	if(line == null) {
	        		break;
	        	}
	        	sb.append(line);
	        }
	        
	        rd.close();
	        conn.disconnect();
	        
	        // 확보한 데이터(String) 리턴
	        return sb.toString();
	}
	
	
	
	
	
	

	// 응답 데이터에서 items만 꺼내서 medicine.txt에 추가 메소드
	// while문을 중단 시킬수 있도록 boolean 값을 리턴
	public static boolean writeItem(String responseText) throws ParseException, IOException {
		JSONParser jsonParser = new JSONParser();

		JSONObject json = (JSONObject) jsonParser.parse(responseText);
        
		JSONObject body = (JSONObject)json.get("body");
        
		// items가 존재하지 않을 때 false 리턴
		if(body.get("items") == null) {
			return false;
		}
		
        JSONArray items = (JSONArray)body.get("items");
        
        String path = System.getProperty("user.dir");
		String csvPath = path + "\\src\\files\\medicine.txt";
		
		
		// 인코딩 설정 후 데이터 쓰기
		BufferedWriter buffWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvPath, true), "UTF-8"));
		
		for(int i = 0; i < items.size(); i++) {
			JSONObject item = (JSONObject)items.get(i);
			
	        String itemSeq = (String)item.get("itemSeq");
	        String entpName = (String)item.get("entpName");
	        String itemName = (String)item.get("itemName");
	        String efcyQesitm = (String)item.get("efcyQesitm");
	        
	        if(efcyQesitm == null || efcyQesitm.isEmpty()) {
	        	continue;
	        }
	        
	        // 증상 값에 있는 개행문자 제거
	        efcyQesitm = efcyQesitm.replace("\n", "").trim();
	        itemName = itemName.replace("\n","");
	        
	        String writeLine = itemSeq + "|" + entpName + "|"
	        		+ itemName + "|" + efcyQesitm;
			
	        System.out.println(writeLine);
			
	        buffWriter.write("\uFEFF" + writeLine);
	        buffWriter.newLine();
	        buffWriter.flush();
	        
		}
		
		// 정상적으로 쓰기 완료시 true 리턴
        return true;
        
        
        
	}

}
