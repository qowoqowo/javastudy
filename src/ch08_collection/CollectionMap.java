package ch08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// Map은 Key와 Value 쌍으로 구성된 데이터들을 담는 용도
		// JavaScript의 JSON 데이터와 유사
		
		// HashMap의 선언
		// Map은 제너릭에 Key값 타입, Value값 타입 둘 다 적어주어야 함
		// Key값 타입은 99% String 타입
		HashMap<String, String> stuMap = new HashMap<>();
		Map<String, String> stuMap2 = new HashMap<>();
		
		
		// 값 추가
		// .put(Key, Value)
		stuMap.put("첫째", "현구");
		stuMap.put("둘째", "다윗");
		stuMap.put("셋째", "기주");
		
		// 데이터의 순서가 없음 (인덱스 번호 없음)
		System.out.println(stuMap);
		
		// Key값만 다르면 Value가 같더라도 데이터를 추가할 수 있다.
		stuMap.put("넷째", "기주");
		System.out.println(stuMap);
		
		// 중복된 Key값을 허용하지 않으며,
		// 이를 이용하여 해당 Key값에 대한 Value를 수정할 수 있다.
		stuMap.put("둘째", "재민");
		System.out.println(stuMap);
		
		
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 75000000);
		coinMap.put("도지코인", 133);
		
		System.out.println(coinMap);
		
		
		// Key값을 이용하여 데이터에 접근
		// .get(Key값)
		// 해당 Key값에 대한 Value값을 리턴
		System.out.println(stuMap.get("둘째"));
		
		System.out.println(coinMap.get("비트코인"));
		
		// 존재하지 않는 Key값을 넣으면? null 값이 리턴
		// 존재하는 Key값을 넣으면? null 값이 아님
		System.out.println(stuMap.get("업소용"));
		
		
		// .size()
		System.out.println(stuMap.size());
		
		
		// .containsKey(값)
		// 해당 Map 내 데이터 중에 괄호 안 Key값과 일치하는 데이터가
		// 존재하면 true, 없으면 false 리턴
		System.out.println(stuMap.containsKey("셋째"));
		System.out.println(stuMap.containsKey("다섯째"));
		
		// 위와 같음
		System.out.println(stuMap.get("셋째") != null);  // true
		System.out.println(stuMap.get("다섯째") != null);  // false
		
		
		// .containsValue(값)
		System.out.println(stuMap.containsValue("기주"));
		System.out.println(stuMap.containsValue("경희"));
		
		
		// .remove(Key값)
		// 해당 Key값에 대한 데이터 삭제
		stuMap.remove("둘째");
		System.out.println(stuMap);
		
		
		System.out.println("\n============================\n");
		
		// Map의 각 요소에 접근
		// 1. keySet 이용
		// Map 내부 요소들에 대해 key값들만 Set에 담은 것
		Set<String> keySet = stuMap.keySet();
		
		for( String key : keySet ) {
			System.out.println(key);  // 첫째, 셋째, 넷째
			System.out.println(stuMap.get(key)); // 각 key에 대한 value값 접근
		}
		
		
		// 2. EntrySet 이용
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		
		for( Entry<String, String> entry : entrySet ) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		
		
		
		
		
		
	}

}
