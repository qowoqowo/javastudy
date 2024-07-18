package jaehyun.submit11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import ch11_interface.mysort.MyCollections;
import ch11_interface.mysort.MyComparator;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		// dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 100; i++) {
			int randDay = (int) (Math.random() * 365) + 1; // 1~365
			Calendar cal = Calendar.getInstance(); // 오늘날짜
			cal.add(Calendar.DATE, randDay * -1); // 오늘날짜에서 1~365 중 랜덤한 일수를 뺀다.

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i + 1) + "번째 생성된 글", strDate));
		}

		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}

		// 코드작성 시작 ~!!

		System.out.println("\n===============================================\n");

		// 최신순 정렬
		for (int k = 0; k < dbList.size() - 1; k++) {
			for (int i = 0; i < dbList.size() - 1 -k; i++) {
//				dbList.get(i).getDate()      -> "2024.07.10 09:21:00"
//				dbList.get(i+1).getDate()    -> "2024.07.13 09:21:00"
				
				// 날짜형 문자열을 Date 객체로 변환
				Date leftDate = sdf.parse(dbList.get(i).getDate());
				Date rightDate = sdf.parse(dbList.get(i+1).getDate());
				
				// leftDate ->  2024.07.10 09:21:00 -> 8000
				// rightDate ->  2024.07.13 09:21:00 -> 9000
				
				// leftDate.getTime() -> 8000
				// rightDate.getTime() -> 9000
				if (leftDate.getTime() < rightDate.getTime()) {
					DateBoard temp = dbList.get(i);
					dbList.set(i, dbList.get(i + 1));
					dbList.set(i + 1, temp);
				}
			}
		}
		
		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n==========================================\n");
		
		// MyCollections.mySort() 사용
		MyCollections.mySort(dbList, new MyComparator<DateBoard>() {

			@Override
			public boolean myCompare(DateBoard left, DateBoard right) {
				try {
					Date leftDate = sdf.parse(left.getDate());
					Date rightDate = sdf.parse(right.getDate());
					
					return leftDate.getTime() > rightDate.getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				return false;
			}
			
		});
		
		MyCollections.printList(dbList);
		
		
		System.out.println("\n==========================================\n");
		
		// 최근 한달 내
		// 7/16 에서 30일 전 06/16
		// 3/20 에서 30일 전 02/18
		// 3/20 에서 한달 전 02/20
		
		// 1. 직접 30일치 시간을 계산해서 기준으로 삼기
		System.out.println( System.currentTimeMillis());
		System.out.println((30 * 24 * 60 * 60 * 1000)); // -17억
		System.out.println((30L * 24 * 60 * 60 * 1000)); // 25억
		long before30 = System.currentTimeMillis() - (30L * 24 * 60 * 60 * 1000);
		System.out.println(before30);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date tempDate= sdf.parse(dbList.get(i).getDate());
			// 각 인덱스별 DateBoard 객체의 작성일자(long)
			
			if(tempDate.getTime() > before30) {
				System.out.println(dbList.get(i));
			}
			
		}
		
		System.out.println("\n=======================\n");
		
		// 2. Calendar 객체 이용
		Calendar cal = Calendar.getInstance();
		
		// 30일 전
//		cal.add(Calendar.DATE, -30);
		
		// 한달 전
		cal.add(Calendar.MONTH, -1);
		
		before30 = cal.getTime().getTime();
		
		for(int i = 0; i < dbList.size(); i++) {
			Date tempDate = sdf.parse(dbList.get(i).getDate());
			
			if(tempDate.getTime() >= before30) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n=======================\n");

		// 3. 이번달
		// 2024, 07, 16, ...
		Calendar calMonth = Calendar.getInstance();
		
		for(int i = 0; i <dbList.size(); i++) {
			Date tempDate = sdf.parse(dbList.get(i).getDate());
			
			// Date -> Calendar 변경
			Calendar tempCal = Calendar.getInstance();
			tempCal.setTime(tempDate);
			
//			calMonth.get(Calendar.YEAR)
//			calMonth.get(Calendar.MONTH)
//			
			
		}
		
		System.out.println("\n=======================\n");
		
		// 4. 2024.06 월 게시글만 꺼내기
		
		
		
		
		System.out.println("\n=======================\n");
		
		// 5. 2023.07.14 ~ 2023.08.21
		String before = "2023.07.15";
		String after = "2023.08.21";
		
		SimpleDateFormat sdfYMD = new SimpleDateFormat("yyyy.MM.dd");
		
		Date beforeDate = sdfYMD.parse(before);
		Date afterDate = sdfYMD.parse(after);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date tempDate = sdf.parse(dbList.get(i).getDate());
			
			if(tempDate.getTime() >= beforeDate.getTime()
					&& tempDate.getTime() <= afterDate.getTime()) {
				System.out.println(dbList.get(i));
			}
			
			
		}
		
		
		
		
		
	}

}
