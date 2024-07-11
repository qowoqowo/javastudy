package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
	private ArrayList<Board> boardList = new ArrayList<>();

	private BoardDB() {
		boardList.add(new Board(1, "첫 번째 게시글 제목", "첫 번째 내용", "호빵맨"));
		boardList.add(new Board(2, "두 번째 게시글 제목", "두 번째 내용", "찐빵맨"));
		boardList.add(new Board(3, "세 번째 게시글 제목", "두 번째 내용", "식빵맨"));
	}

	private static BoardDB instance = new BoardDB(); // 402호

	public static BoardDB getInstance() {
		return instance;
	}

	// 글 목록 보기
	public void showBoardList() {

		for (int i = 0; i < boardList.size(); i++) {
			Board bo = boardList.get(i);
			System.out.println("[ " + bo.getBoardNo() + " | " + bo.getBoardtitle() + " | " + bo.getMemName());
		}
	}

	public void insertBoard(Board bo) {
		// 파라미터 bo 는 글번호가 0인 상태
		// bo에 다음 글번호 4 넣기
		// 자동으로 글번호가 1씩 증가되기 위해
		// boardList.size() + 1 값 넣기
		bo.setBoardNo(boardList.size() + 1); // board 의 필드변수가 모두 채워짐
		boardList.add(bo);
	}
	
	// 글보기 메소드
	public void readBoard(int no) {
		boolean isCatch = false;
		
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getBoardNo() == no) {
				System.out.println("====================");
				System.out.println(boardList.get(i).getBoardtitle());
				System.out.println("작성자: "+ boardList.get(i).getMemName());
				System.out.println("---------------------");
				System.out.println(boardList.get(i).getBoardContent());
				System.out.println("=====================");
				isCatch = true;
			}
		}
		
		if(!isCatch) {
			System.out.println("요청하신 페이지를 찾을 수 없습니다.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
