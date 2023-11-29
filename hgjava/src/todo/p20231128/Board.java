package todo.p20231128;

public class Board {
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	private String writeDate;

	// 나도 변경햇습니다..

	
	public Board(int boardNo, String title, String writer, String content, String writeDate) {

		this.boardNo = boardNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = writeDate;
	}

	String showInfo() {
		return "";
	}

	int getBoardNo() {
		return boardNo;
	}

	void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getWriter() {
		return writer;
	}

	void setWriter(String writer) {
		this.writer = writer;
	}

	String getContent() {
		return content;
	}

	void setContent(String content) {
		this.content = content;
	}

	String getWriteDate() {
		return writeDate;
	}

	void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

}
