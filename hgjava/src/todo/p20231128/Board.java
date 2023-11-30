package todo.p20231128;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int boardNo; // boardNo, board_no
	private String title;
	private String writer;
	private String content;
	private String writeDate;

	// 이 부분이 변경되었습니다.
	// 나도 변경햇습니다..
	public Board() {
	}

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
		// this();// 기본생성자.
		this(boardNo, title, writer, content);
		this.writeDate = writeDate;
	}

	public String showInfo() {
		return boardNo + "     " + title + " " + writer + " " + writeDate;
	}

	public String showDetailInfo() {
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

}
