package ch09_class.homepage;

public class Board {
	
	private int boardNo;
	private String boardtitle;
	private String boardContent; 
	private String memName;
	
	public Board() {
		
	}

	public Board(int boardNo, String boardtitle, String boardContent, String memName) {
		super();
		this.boardNo = boardNo;
		this.boardtitle = boardtitle;
		this.boardContent = boardContent;
		this.memName = memName;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardtitle=" + boardtitle + ", boardContent=" + boardContent
				+ ", memName=" + memName + "]";
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardtitle() {
		return boardtitle;
	}

	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}


	
	
	
	
	
	
}
