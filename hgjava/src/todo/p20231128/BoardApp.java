package todo.p20231128;

import java.util.Scanner;

// M(odel) V(iew) C(ontrol) 
public class BoardApp {
	// static BoardExe exe = new BoardExe();
	// 데이터마다 다른 정보를 담을 필요가 없는 클래스는 static 멤버선언.
	private Scanner scn = new Scanner(System.in);
	private String id = null;

	// 싱글톤 방식의 인스턴스 생성.
	private static BoardApp instance = new BoardApp();

	// 생성자.
	private BoardApp() {
	}

	public static BoardApp getInstance() {
		return instance;
	}

	private void boardAdd() {
		System.out.print("제목입력>> ");
		String title = scn.nextLine();
		System.out.print("내용입력>> ");
		String content = scn.nextLine();
		System.out.print("일시입력>> ");
		String wdate = scn.nextLine();

		Board board = new Board(BoardExe.getSequence(), title, id, content, wdate);

		if (BoardExe.addBoard(board)) {
			System.out.println("입력 성공!");
		} else {
			System.out.println("처리 실패!");
		}
	} // end of boardAdd.

	private void boardList() {
		Board[] boardAry = BoardExe.boardList();
		showList(boardAry, 1);
		while (true) {
			int page = Integer.parseInt(scn.nextLine());
			if (page == 0) {
				break;
			}
			showList(boardAry, page);
		}
	} // end of boardList.

	private void getBoard() {
		System.out.print("글번호 입력>>> ");
		int no = Integer.parseInt(scn.nextLine());
		Board result = BoardExe.getBoard(no);
		if (result != null) {
			System.out.println(result.showDetailInfo());
		} else {
			System.out.println("조회된 내용이 없습니다.");
		}
	} // end of getBoard.

	private void boardEdit() {
		System.out.println("수정한 글번호>>> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.println("수정한 글내용>>> ");
		String content = scn.nextLine();
		// 권한 체크...
		if (!BoardExe.checkResponsibility(id, no)) {
			System.out.println("수정 권한없습니다...");
//			continue;
			return;
		}

		if (BoardExe.modBoard(no, content)) {
			System.out.println("변경 성공!");
		} else {
			System.out.println("처리 실패!");
		}

	} // end of boardEdit.

	private void boardDel() {
		System.out.println("삭제할 글번호>>> ");
		int no = Integer.parseInt(scn.nextLine());
		// 권한 체크...
		if (!BoardExe.checkResponsibility(id, no)) {
			System.out.println("삭제 권한없습니다...");
			// continue;
			return;
		}
		if (BoardExe.remBoard(no)) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("처리 실패!");
		}

	} // end of boardDel.

	public void start() {

		boolean run = true;

		UserExe uexe = new UserExe();
		while (true) {
			System.out.println("id를 입력>>> ");
			id = scn.nextLine();
			System.out.println("pw를 입력>>> ");
			String pw = scn.nextLine();

			User user = uexe.logIn(id, pw);
			if (user != null) {
				System.out.println(user.getUserName() + "님 환영합니다.");
				break;
			} else {
				System.out.println("id, pw 확인하세요!!");
			}
		} // 로그인 처리.

		// 초기값 생성.
		BoardExe.initData();

		while (run) {
			System.out.println("1.글등록 2.목록 3.상세보기 4.수정 5.삭제 6.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 글등록.
				boardAdd();
				break;

			case 2: // 목록보기 -> 페이지보기.
				boardList();
				break;

			case 3: // 단건조회.
				getBoard();
				break;

			case 4: // 수정.
				boardEdit();
				break;

			case 5: // 삭제.
				boardDel();
				break;

			case 6:
				System.out.println("프로그램 종료합니다.");
				run = false;
			}

		} // end of while.
		System.out.println("end of prog.");
	} // end of main.

	private void showList(Board[] boardAry, int page) {
		// 페이징처리.
		Board[] pageAry = BoardExe.pageList(boardAry, page);
		System.out.println("글번호 제목    작성자 작성일시");
		System.out.println("=======================");
		for (Board brd : pageAry) {
			if (brd != null)
				System.out.println(brd.showInfo());
		}
		// 전체페이지 계산하고 출력.
		int cnt = BoardExe.getBoardCount();
		int totalPage = (int) Math.ceil(cnt / 5.0);

		for (int i = 1; i <= totalPage; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n페이지를 선택하세요>> 종료:0 입력. ");
	}
}
