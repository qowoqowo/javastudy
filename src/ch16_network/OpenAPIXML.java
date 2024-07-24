package ch16_network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.json.simple.parser.ParseException;

public class OpenAPIXML {

	 private static final String FileOutputStream = null;

	public static void main(String[] args) throws IOException, ParseException {
	 	// 요청 URL (서버 주소) 생성
	 	// 요청 파라미터 추가
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/DrbEasyDrugInfoService/getDrbEasyDrugList"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=G%2FyYIwXjeGYwjnyD4ILzXE22ekmc%2BZYlA6bwEHASJLqMNjb2Hq99RqFYuDqConJVuf7xxGm4Fcgu2FyvvYfMCw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/

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
        System.out.println(sb.toString()); // XML String
        
        // XML String -> JSONObject 로 변경
        // Maven Repository -> org.json 라이브러리 가져오기
        JSONObject json = XML.toJSONObject(sb.toString());
        
        System.out.println(json);
        
        // item의 index 0번 의약품에서 활명수만 출력
        JSONObject response = (JSONObject)json.get("response");
        
        JSONObject body = (JSONObject)response.get("body");
        
        JSONObject items = (JSONObject)body.get("items");
        
        JSONArray item = (JSONArray)items.get("item");
        
        JSONObject potion = (JSONObject)item.get(0);
        
        System.out.println(potion.get("itemName"));
        
        
        
        
        
        
        
        
        
	}

}
