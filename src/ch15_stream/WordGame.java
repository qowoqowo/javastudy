package ch15_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>();

		// my_korean.csv 을 읽어서 각 단어를 wordList 에 추가하기
		// BufferedReader 이용
		String path = System.getProperty("user.dir");

		String myCsvPath = path + "\\src\\ch15_stream\\my_korean.csv";

		try (BufferedReader buffReader = new BufferedReader(new FileReader(myCsvPath));) {

			while (true) {
				String line = buffReader.readLine();

				if (line == null) {
					break;
				}

				wordList.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

//		for(int i = 0; i < wordList.size(); i++) {
//			System.out.println(wordList.get(i));
//		}
//		System.out.println(wordList.size());

		// wordList에 국어사전의 2~3글자 명사를 확보
		// -> 끝말잇기에서 단어의 유효성 체크

		Scanner scan = new Scanner(System.in);

		// wordList에서 랜덤한 하나의 단어를 제시
		int randIdx = (int) (Math.random() * wordList.size());
		String comWord = wordList.get(randIdx);

		while (true) {
			// comWord = "석탄갱" 일때
			// wordList 내 "석탄갱"이 제거됨
			wordList.remove(comWord);

			System.out.println("제시어: " + comWord);
			System.out.print(">>> ");

			String myWord = scan.nextLine();

			// 1. comWord의 끝자리와 myWord의 첫번째 자리가 같은지
			// 2. myWord가 wordList 에 들어있는지

			// 2글자라면 substring(1), 3글자라면 substring(2)
			boolean firstCheck = comWord.substring(comWord.length() - 1).equals(myWord.substring(0, 1));
			boolean secondCheck = wordList.contains(myWord);

			if (firstCheck && secondCheck) {

				wordList.remove(myWord);

				// 컴퓨터가 나의 myWord에 대해 끝말 잇기 하기
				// wordList에서 myWord의 끝글자로 시작하는 모든 단어 찾기
				ArrayList<String> comAnswerList = new ArrayList<>();
				for (int i = 0; i < wordList.size(); i++) {
					String wordFirst = wordList.get(i).substring(0, 1);

					if (wordFirst.equals(myWord.substring(myWord.length() - 1))) {
						comAnswerList.add(wordList.get(i));
					}
				}

				if (comAnswerList.size() == 0) {
					System.out.println("컴퓨터 패배");
					break;
				} else {
					// 대답 가능한 단어 중 랜덤 한개를 제시
					randIdx = (int) (Math.random() * comAnswerList.size());

					comWord = comAnswerList.get(randIdx);
				}

			} else {
				System.out.println("플레이어 패배");
				break;
			}
		}

	}

}
