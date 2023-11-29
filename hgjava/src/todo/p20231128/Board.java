package todo.p20231128;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	private String writeDate;

	// 이 부분이 변경되었습니다.
	// 나도 변경햇습니다..

	public Board(int boardNo, String title, String writer, String content) {
		Date today = new Date(); // 시스템시간을 기준으로 생성.

		// Date -> String -> Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		this.boardNo = boardNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = sdf.format(today);
	}

	public Board(int boardNo, String title, String writer, String content, String writeDate) {
		this.boardNo = boardNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = writeDate;
	}

	String showInfo() {
		return boardNo + "     " + title + " " + writer + " " + writeDate;
	}

	String showDetailInfo() {
//		번호: 1/ 제목:자바게시판입니다
//		작성자: user01 
//		내용: 오늘은 숙제로 자바게시판을 만들어봅시다.
//		일시: 2023-11-28
		String result = "번호: " + boardNo + "/ 제목: " + title;
		result += "\n작성자: " + writer;
		result += "\n내용: " + content;
		result += "\n일시: " + writeDate;
		return result;
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
