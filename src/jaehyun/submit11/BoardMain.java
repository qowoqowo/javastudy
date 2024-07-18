package jaehyun.submit11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Board> boardList = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		while (true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");

			int command = Integer.parseInt(scan.nextLine());

			if (command == 1) {
				// 글 목록
				for (Board bo : boardList) {
					System.out.println("[ " + bo.getNo() + " | " + bo.getTitle() + " | " + bo.getDate() + " ]");
				}

			} else if (command == 2) {
				// 글 쓰기
				System.out.print("제목 입력: ");
				String title = scan.nextLine();

				System.out.print("내용 입력: ");
				String content = scan.nextLine();

				// 글번호, 제목, 작성일, 내용
				String strDate = sdf.format(new Date());

				Board bo = new Board(boardList.size() + 1, title, strDate, content);
				boardList.add(bo);
			} else {
				System.out.println("종료");
				break;
			}

		}

	}
}
