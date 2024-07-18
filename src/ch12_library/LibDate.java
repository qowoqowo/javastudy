package ch12_library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class LibDate {
	public static void main(String[] args) throws InterruptedException, ParseException {

		// 자바에서 날짜 관련 기능을 구현할때
		// 사용하는 라이브러리

		// 현재 시간 구하기
		// 1. Date 클래스 사용
		// new Date() 로 객체가 생성될 때, 그 때의 시간이
		// dateToday 객체에 담김 (담긴 후 시간이 변하지 않음)
		Date dateToday = new Date();

		System.out.println(dateToday);

		// 날짜 포맷 변경
		// Fri Jul 12 15:45:46 KST 2024
		// -> 2024-07-12 15:45:46 로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// sdf.format(Date 객체)
		// Date 객체에 저장된 날짜를 지정한 날짜 포맷으로
		// 변환된 문자열을 리턴
		String strToday = sdf.format(dateToday);

		System.out.println(sdf.format(dateToday));

		System.out.println("\n==================\n");

		// 2. Calendar 클래스사용
		// .getInstance() 실행 시 새로운 객체가 생성된(싱글톤 X)
		// 객체가 생성될 때의 시간이 저장된다
		Calendar calToday = Calendar.getInstance();

		System.out.println(calToday);

		Date calToDate = calToday.getTime();

		System.out.println(calToDate);
		System.out.println(sdf.format(calToDate));

		System.out.println("\n====================================\n");

		// 3. System 클래스
		long longToday = System.currentTimeMillis();

		// 1970년 1월 1일 00시 부터 현재까지 경과된 시간을 밀리초 단위로 리턴
		System.out.println(longToday);

		// 날짜 포맷 적용
		System.out.println(sdf.format(longToday));
		System.out.println(sdf.format(0));

		// Date 객체로부터 long 타입 시간 얻기
		long dateToLong = dateToday.getTime();
		System.out.println(dateToLong);

		System.out.println("\n=======================================\n");

		// 다양한 날짜 타입 만들기
		// 1. 2024/07/12 16:24:30
		// 2. 24-07-12 오후 04:24:30
		// 3. 금요일 16:24
		// @. 2024.07.12 PM 04:24:30

		// 1.
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(new Date()));

		// 2.
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(new Date()));

		// 3.
		sdf = new SimpleDateFormat("E요일 mm:ss");
		System.out.println(sdf.format(new Date()));

		// @.
		sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.ENGLISH);
		System.out.println(sdf.format(new Date()));

		// 현재 미국시간 출력하기
		TimeZone usTimeZone = TimeZone.getTimeZone("America/St_Vincent");
		sdf.setTimeZone(usTimeZone);

		System.out.println(sdf.format(new Date()));

		// 미국 시간찾기
//		Calendar usCalendar = Calendar.getInstance ( usTimeZone );
//		System.out.println(sdf.format(usCalendar.getTime()));
//		System.out.println ("미국 : " + usCalendar.get ( Calendar.YEAR ) + "년 " 
//		+ ( usCalendar.get ( Calendar.MONTH ) + 1 ) + "월 " + usCalendar.get ( Calendar.DATE ) + "일 " + usCalendar.get ( Calendar.HOUR_OF_DAY ) 
//		+ "시 " +usCalendar.get ( Calendar.MINUTE ) + "분 " + usCalendar.get ( Calendar.SECOND ) + "초 " );

		System.out.println("\n=====================================\n");

		// "278" 를 연산하기 위해 String -> int 로 변환
		// "2024-07-12 17:27:10" 를 시간 계산을 할 때
		// String -> Date 로 변환

		// 날짜형 문자열 -> Date 객체로 변환
		String strTomorrow = "2024-07-13 17:30:00";

		// 변환하고자 하는 날짜형 문자열과 똑같은 형태의 날짜포맷 설정
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// sdf.parse(문자열)
		// 괄호안 문자열에 대한 시간을 갖는 Date 객체를 리턴
		Date dateTomorrow = sdf.parse(strTomorrow);
		System.out.println(dateTomorrow);

		// 시간만 있는 문자열을 변환
		String strTime = "10:30:20";

		sdf = new SimpleDateFormat("HH:MM:ss");
		Date dateTime = sdf.parse(strTime);
		System.out.println(dateTime); // Thu Jan 01 10:30:20 KST 1970
		System.out.println(sdf.format(dateTime)); // 10:30:20

		// 날짜만 있는 문자열을 변환
		String strYear = "2024.07.14";
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date dateYear = sdf.parse(strYear);
		System.out.println(dateYear); // Sun Jan 14 00:07:00 KST 2024

		System.out.println("\n=======================================\n");

		// 특정 날짜 세팅하기
		// 다윗 2002년 06월 02일
		Calendar cal = Calendar.getInstance();

		// 2002년 06월 02일
		// month 부분은 1월이 0, 2월이 1, ..., 6월은 5, ... 12월이 11
		cal.set(2002, 5, 2);
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));

		// 다윗 2002년 06월 02일 20시 20분 20초
		cal.set(2002, 5, 2, 20, 20, 20);
		System.out.println(sdf.format(cal.getTime()));

		// Calendar -> Date 객체 얻기
		Date date = cal.getTime();

		// Date -> Calendar 객체 얻기
		// Calendar 객체에 파라미터 Date 객체의 시간이 설정됨
		cal.setTime(dateTomorrow);
		System.out.println(sdf.format(cal.getTime()));

		// 날짜 꺼내기 (Calendar 사용)
		// 2024.07.13 17:30:00

		// 년도
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);

		// 월 (1 작음)
		int month = cal.get(Calendar.MONTH) + 1; // 1 더해주면 그만
		System.out.println(month);

		// 일
		int day = cal.get(Calendar.DATE);
		System.out.println(day);

		// 시간
		int hour = cal.get(Calendar.HOUR); // hh 와 같음
		System.out.println(hour);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // HH 와 같음

		// 분
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);

		// 초

		System.out.println("\n========== 날짜연산 ============\n");

		String oneDay = "2024.07.10 09:30:10";
		String twoDay = "2024.07.12 03:10:20";

		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		Date oneDate = sdf.parse(oneDay);
		Date twoDate = sdf.parse(twoDay);

		System.out.println(oneDate);
		System.out.println(twoDate);

		// Date 객체에 .getDate(), .getHour() 메소드 등에
		// 줄이 그어져 있고 Deprecated 라고 설명에 나타난다.
		// 이는 곧 지원 종료 대상을 의미 (추후 삭제될 수 있음)
		System.out.println(oneDate.getTime());
		System.out.println(twoDate.getTime());

		// 두 Date 객체의 long 시간을 빼기
		long diffMillSec = twoDate.getTime() - oneDate.getTime();
		System.out.println(diffMillSec + "밀리초 차이");

		// 1초 = 1000밀리초
		// diffMillSec / 1000 -> 초단위
		long diffSec = diffMillSec / 1000;
		System.out.println(diffSec + "초 차이");

		// 1분 = 60초
		// diffSec / 60 -> 분단위
		long diffMin = diffSec / 60;
		System.out.println(diffMin + "분 차이");

		// 1시간 = 60분
		// diffMin / 60 -> 시간 단위
		long diffHour = diffMin / 60;
		System.out.println(diffHour + "시간 차이");

		// 1일 = 24시간
		// diffHour / 24 -> 일 단위
		long diffDate = diffHour / 24;
		System.out.println(diffDate + "일 차이");

		// 소수점 올리기 Math.ceil(3.1) -> 4.0
		diffDate = (long) Math.ceil((double) diffHour / 24);
		System.out.println(diffDate + "일 차이");

		System.out.println("\n================= 디데이 계산 ======================\n");

		// 2024.06.27 에 대해 D-18
		// 2024.08.15 에 대해 D+31 로 출력되도록 디데이 계산기 만들기

		String start = "2024.06.27";
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date startDate = sdf.parse(start);

		// 오늘 날짜 가져온 후 날짜 차이 계산
		Date today = new Date(); // 2024.07.15 10:50:10
		String str = sdf.format(today); // "2024.07.15"
		today = sdf.parse(str); // 2024.07.15 00:00:00

		long ddayMillSec = startDate.getTime() - today.getTime();

		long dday = ddayMillSec / 1000 / 60 / 60 / 24;
		System.out.println(dday);

		String holiday = "2024.08.15";
		Date holiDate = sdf.parse(holiday);

		ddayMillSec = holiDate.getTime() - today.getTime();
		dday = ddayMillSec / (1000 * 60 * 60 * 24);
		System.out.println(dday);

		// 메소드로 만들기
		calDday("2024.07.22"); // D+7 출력
		calDday("2024.07.08"); // D-7 출력

		// LibDate 내에 main 메소드가 있더라도
		// main 메소드 내에서 LibDate의 메소드를 사용하려면
		// 해당 LibDate를 객체로 생성해야 함
		LibDate lib = new LibDate();
		lib.calDday(start);

		// LibDate 내에 메소드를 static 로 만들면
		// main 메소드 내에서 메소드 이름만 사용해도 동작
		LibDate.calDday(start);
		calDday("2024.07.22");

		System.out.println("\n===============================\n");

		// 날짜 연산
		// 특정 날짜 기준으로 원하는 날짜만큼 더하거나 뺄 때
		// Calendar 사용
		Calendar toCal = Calendar.getInstance();
		System.out.println(sdf.format(toCal.getTime()));

		// 3일 뒤 날짜는?
		toCal.add(Calendar.DATE, 3);
		System.out.println(sdf.format(toCal.getTime()));

		// 45일 뒤 날짜는?
		toCal.add(Calendar.DATE, 45);
		System.out.println(sdf.format(toCal.getTime()));

		// 7일 이전 날짜는?
		toCal.add(Calendar.DATE, -7);
		System.out.println(sdf.format(toCal.getTime()));

		// 1달 뒤 날짜는?
		toCal.add(Calendar.MONTH, 1);
		System.out.println(sdf.format(toCal.getTime()));

		// 4달 뒤 날짜는?
		toCal.add(Calendar.MONTH, 4);
		System.out.println(sdf.format(toCal.getTime()));

	}

	public static void calDday(String target) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

		Date targetDate = sdf.parse(target);

		Date today = new Date();
		String strToday = sdf.format(today);
		Date dateToday = sdf.parse(strToday);

		long diffMillSec = targetDate.getTime() - dateToday.getTime();

		long diffDay = diffMillSec / (1000 * 60 * 60 * 24);

		if (diffDay >= 0) {
			System.out.println("D+" + diffDay);
		} else {
			System.out.println("D" + diffDay);
		}

	}

}
