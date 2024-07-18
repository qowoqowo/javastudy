package ch12_library;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import ch09_class.school.Student;
import jaehyun.MyUtil;

public class LibJson {
	public static void main(String[] args) throws ParseException {
		// JSON 객체
		// JavaScript Object Notation
		// = 자바스크립트에서의 객체
		
		// 자바에서의 객체
		// Student -> name, kor, eng, math, avg
		// Student [name=호빵맨, kor=90, eng=80, math=70, avg=80.0]
		Student hobbang = new Student("호빵맨", 90, 80, 70);
		System.out.println(hobbang);
		
		// JSON 객체라면?
		// let hobbang = { "name":"호빵맨", "kor":90, "eng":80, "math":70, "avg":80.0 }
		
		// name 값(= 호빵맨) 꺼내기
		// 자바 hobbang.getName();
		// 자바스크립트 hobbang.name 또는 hobbang["name"]
		
		// 스프링 프레임워크에서 자바는 서버의 역할
		// 사용자의 브라우저(클라이언트)와 서버간 데이터 통신 시 
		// JSON String을 주고 받는 경우가 존재
		
		// 자바에서 JSON 객체를 다루는 경우가 존재
		
		// 라이브러리를 사용 (JDK 에는 없음)
		// 외부 라이브러리를 가지고 와야 사용할 수 있다.
		
		// 구글에 maven repository 검색 -> 사이트 접속 
		// 검색창에 json simple 검색
		// 1.1.1 버전 선택
		// Files 항목의 View All 선택 후 .jar 파일 다운로드
		
		// 프로젝트 내부 lib 폴더에 해당 .jar 파일 옮기기
		
		// 프로젝트 우클릭 -> Build Path -> Configure Build Path 클릭
		// library 탭 -> Add Jars 버튼 클릭
		// 프로젝트 내 lib 폴더 찾고 해당 .jar 파일 선택하여 추가
		
		JSONObject jsonObject = new JSONObject();
		 
		// 우리가 만든 코드도 라이브러리로 만들어서 배포할 수 있고
		// 가져와서 쓸 수 있음
		System.out.println(MyUtil.myRound(3.1415, 3));
		
		
		// JSON 객체는 내부에 Key 와 Value 쌍으로 구성된 데이터를 가진다.
		// Key값은 String 타입, Value는 아무타입 다 가능
		// Map<String, Object> 와 유사함
		
		// 현재 jsonObject 는 {} 인 상태
		
		// 데이터 추가
		jsonObject.put("name","아이유"); // {"name":"아이유"} 
		System.out.println(jsonObject);
		
		jsonObject.put("age", 32); // {"name":"아이유", "age":32} 
		System.out.println(jsonObject);
		
		// 데이터 수정
		// JSON은 내부에 중복되는 Key값을 가질 수 없다.
		jsonObject.put("age", 31);
		System.out.println(jsonObject);
		
		// JSON 객체에서 사용되는 배열
		// ArrayList 와 사용법이 같음
		JSONArray jsonArray = new JSONArray(); // []
		
		// JSONArray에 값 추가
		jsonArray.add("블루밍");
		jsonArray.add("밤편지");
		jsonArray.add("코인");
		jsonArray.add(100); // JSONArray 또한 타입이 자유롭다.
		System.out.println(jsonArray);
		
		jsonObject.put("songList", jsonArray);
		
		System.out.println(jsonObject);
		System.out.println(jsonObject.toString());
		
		// JSON String
		// JSON 객체에 대해 문자열 타입으로 표현한 것 (= 데이터 통신시 사용)
		String jsonString = jsonObject.toString();
		
		// Value 에 JSON 객체 추가
		JSONObject nahuna = new JSONObject();
		
		nahuna.put("name","나훈아");
		nahuna.put("age", 60);
		
		JSONArray songs = new JSONArray();
		songs.add("테스형");
		songs.add("붉은입술");
		
		nahuna.put("songs", songs);
		System.out.println(nahuna);
		
		jsonObject.put("father", nahuna);
		System.out.println(jsonObject);
		
		// Key에 대한 Value을 꺼내기
		System.out.println(jsonObject.get("name"));
		
		// 값을 꺼내면 Object 타입으로 리턴
		String name = (String)jsonObject.get("name");
		
		int age = (int)jsonObject.get("age");
		System.out.println(age);
		
		JSONArray songList = (JSONArray)jsonObject.get("songList");
		
		// JSONArray for문 돌리기
		for(int i = 0; i < songList.size(); i++) {
			System.out.println(songList.get(i));
		}
		
		JSONObject father = (JSONObject)jsonObject.get("father");
		
		String nahunaName = (String)father.get("name"); 
		System.out.println(nahunaName);
		
		// JSON 객체 father의 songs에서 인덱스 0번 테스형만 출력
		JSONArray song = (JSONArray)father.get("songs");
		System.out.println(song.get(0));
		
		System.out.println("\n====================================\n");
		
		// 서버나 클라이언트로부터 JSON String을 전달받은 경우
		String response = "{\"father\":{\"songs\":[\"테스형\",\"붉은입술\"],\"name\":\"나훈아\",\"age\":60},\"name\":\"아이유\",\"songList\":[\"블루밍\",\"밤편지\",\"코인\",100],\"age\":31}";
		System.out.println(response);
		
		// JSON String은 문자열이기 때문에 특정 Key에 대한 Value를 꺼낼 수 없음
		// JSON String -> JSONObject 변환해야 .get(Key) 사용 가능
		// 변환을 위해 JSONParser 객체 생성
		JSONParser jsonParser = new JSONParser();
		
		JSONObject jsonData = (JSONObject)jsonParser.parse(response);
		System.out.println(jsonData);
		
		name = (String)jsonData.get("name");
		System.out.println(name);
		
		// 파싱된 JSONObject의 경우
		// 숫자의 경우 long 타입으로 가지고 있음
		long ageLong = (long)jsonData.get("age");
		System.out.println(ageLong);
		
		System.out.println("\n==============================\n");
		
		// GSON 라이브러리 사용
		// mavem repository 에서 gson 검색 후 다운로드
		
		// GSON 라이브러리의 JSON 객체
		// JsonObject
		JsonObject gsonObject = new JsonObject();
		
		// 값 추가
		gsonObject.addProperty("name", "아이유");
		gsonObject.addProperty("age", 31);
		System.out.println(gsonObject);
		
		JsonArray gsonArray = new JsonArray();
		gsonArray.add("좋은날");
		gsonArray.add("분홍신");
		System.out.println(gsonArray);
		
		// JsonArray나 JsonObject를 Value에 넣을땐 .add 사용
		gsonObject.add("songs", gsonArray);
		System.out.println(gsonObject);
		
		// 위 행동은 json simple 라이브러리와 같음
		
		// Gson 객체 생성
		// 1. 그냥 생성
		Gson gson = new Gson();
		
		// 2. GsonBuilder 로 Gson 객체 생성
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gsonPretty = gsonBuilder.setPrettyPrinting().create();
		
		// Gson 객체를 이용한 JSON String 얻기
		String gsonString = gson.toJson(gsonObject);
		System.out.println(gsonString);
		
		String gsonStringPretty = gsonPretty.toJson(gsonObject);
		System.out.println(gsonStringPretty);
		
		
		// Gson 객체를 이용하여 자바 객체를 JSON String으로 변환 가능!!
		Student jjinbbang = new Student("찐빵맨", 90, 80, 70);
		// Student [name=찐빵맨, kor=90, eng=80, math=70, avg=80.0]
		System.out.println(jjinbbang);
		
		
		// 자바 객체에 대해 직렬화 ()
		String jjinJson = gson.toJson(jjinbbang);
		// {"name":"찐빵맨", "kor":90, "eng":80, "math":70, "avg":80.0}
		System.out.println(jjinJson);
		
		
		// 자바의 배열을 JSON String 으로 직렬화
		String[] nameArray = {"호빵맨","찐빵맨","꿀빵맨"};
		String strName = gson.toJson(nameArray);
		System.out.println(strName);
		
		
		// 자바의 ArrayList를 JSON String 으로 직렬화
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("짱구");
		nameList.add("철수");
		nameList.add("맹구");
		String strJjang = gson.toJson(nameList);
		System.out.println(strJjang);
		
		
		// 객체를 담고있는 ArrayList 또한 JSON String 으로 직렬화
		ArrayList<Student> stuList = new ArrayList<>();
		stuList.add(new Student("짱구",87,76,56));
		stuList.add(new Student("철수",87,79,65));
		stuList.add(new Student("맹구",77,96,86));
		String strStu = gson.toJson(stuList);
		System.out.println(strStu);
		
		
		// JSON String에 대해 Student 객체로 변환!
		// = 역직렬화 (Deserialization)
		// 스프링 프레임워크에서 GSON 라이브러리 및 jackson 라이브러리를
		// 이용하여 직렬화, 역직렬화를 사용한다.
		
		String str = "{\"name\":\"찐빵맨\",\"kor\":90,\"eng\":80,\"math\":70,\"avg\":80.0}\r\n"
				+ "";
		
		Student comeback = gson.fromJson(str, Student.class);
		
		System.out.println(comeback);
		System.out.println(comeback.getName());
		
		System.out.println("\n=====================================================\n");
		
		// 실습
		String resp = "{\"success\": true, \"timeseries\": true, \"base\": \"USD\", \"start_date\": \"2020-08-01\", \"end_date\": \"2022-08-01\", \"rates\": {\"2020-08-01\": {\"JPY\": 105.65, \"KES\": 107.57, \"KGS\": 76.52, \"KHR\": 4092.64, \"KMF\": 417.5, \"KPW\": 898.38, \"KRW\": 1192.25}, \"2020-08-02\": {\"JPY\": 105.74, \"KES\": 107.69, \"KGS\": 76.62, \"KHR\": 4100, \"KMF\": 418.06, \"KPW\": 899.58, \"KRW\": 1193.46}}}";
		System.out.println(resp);
		
		// 위 JSON String인 resp에서 2020년 8월 2일의 한국 환률(KRW) 값을 꺼내기
		// 1193.46
		
		// Json simple 라이브러리 이용
		JSONObject jsonResp = (JSONObject)jsonParser.parse(resp);
		System.out.println(jsonResp.get("rates"));
		
		JSONObject resps = (JSONObject)jsonResp.get("rates");
		System.out.println(resps.get("2020-08-02"));
		
		JSONObject date = (JSONObject)resps.get("2020-08-02");
		System.out.println(date.get("KRW"));
		
		double krw = (double)date.get("KRW");
		System.out.println(krw);
		
		System.out.println(((JSONObject)((JSONObject) jsonResp.get("rates")).get("2020-08-02")).get("KRW"));
		
		
	}

}
