package ch09_class.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		// 영화 맞추기

		// 영화 객체들을 담고 있는 리스트

		// 해당 영화의 명대사가 출력

		// 이후 해당 영화의 제목을 맞추기

		// 영화를 객체로 만들어서 사용
		// 영화 -> 제목, 명대사
		// 클래스 정의
		// 클래스명 -> Movie
		// 제목 -> String title
		// 명대사 -> String goat
		// 초성 -> String hint

		ArrayList<Movie> movieList = new ArrayList<>();

		Movie veteran = new Movie("배테랑", "어이가 없네", "ㅂㅌㄹ");
		movieList.add(veteran);

		System.out.println(movieList.get(0));

		veteran.goat = "나 여기 아트박스 사장인데";

		System.out.println(movieList.get(0));

		movieList.add(new Movie("신세계", "죽기 딱 좋은날씨네", " ㅅㅅㄱ"));
		movieList.add(new Movie("명량", "신에게는 아직 12척의 배가 있습니다.", "ㅁㄹ"));
		movieList.add(new Movie("범죄도시", "어 아직 싱글이야", "ㅂㅈㄷㅅ"));
		movieList.add(new Movie("내부자들", "모히또가서 몰디브 한잔하지", "ㄴㅂㅈㄷ"));
		movieList.add(new Movie("타짜", "예림이 그 패 봐봐", "ㅌㅉ"));
		movieList.add(new Movie("범죄와의전쟁", "느그 서장 남천동 살제?", "ㅂㅈㅇㅇㅈㅈ"));
		movieList.add(new Movie("기생충", "넌 다 계획이 있구나", "ㄱㅅㅊ"));
		
		// movieList 무작위로 섞기
		// Collections.shuffle() 이용
		Collections.shuffle(movieList);
		
		Scanner scan = new Scanner(System.in);

		// 정답을 맞출때마다 +1 점씩 주고
		// 영화 맞추기가 끝나면 몇점을 획득했는지 출력

		// 처음 명대사가 주어지고, 제목을 못맞췄다면 (+2점)
		// 해당 영화의 초성힌트가 출력되고 다시 제목을 맞추도록 하기
		// 초성을 보고 맞췄으면 (+1점)
		// 초성까지 줬는데 못맞추면 다음 문제로 넘어감

		int point = 0;
		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i).goat);

			System.out.println(">>> ");
			String title = scan.nextLine();

			if (title.equals(movieList.get(i).title)) {
				System.out.println("정답");
				point += 2;
				// 정답을 맞췄으니 바로 다음 문제로 넘긴다.
				continue;
			}
			
			System.out.println("틀렸습니다.");

			System.out.println("힌트: " + movieList.get(i).hint);

			System.out.println(">>> ");
			title = scan.nextLine();

			if (title.equals(movieList.get(i).title)) {
				System.out.println("정답!! +1점");
				point++;
			}

		}

		System.out.println("점수: " + point);

	}

}
