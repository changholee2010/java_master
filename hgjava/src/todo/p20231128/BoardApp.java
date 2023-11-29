package todo.p20231128;

import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		Board[] boards = new Board[100];

		while (run) {
			System.out.println("1.글등록 2.목록 3.상세보기 4.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				System.out.print("제목입력>> ");
				String title = scn.nextLine();
				System.out.print("작성자입력>> ");
				String writer = scn.nextLine();
				System.out.print("내용입력>> ");
				String content = scn.nextLine();
				System.out.print("일시입력>> ");
				String wdate = scn.nextLine();

				Board board = new Board(1, title, writer, content, wdate);
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board;
						break;
					}
				}
				break;
			case 2:
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null)
						System.out.println(boards[i].showInfo());
				}
				break;
			case 3:
				System.out.print("글번호 입력>>> ");
				int no = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null //
							&& boards[i].getBoardNo() == no)
						System.out.println(boards[i].showInfo());
				}
			case 4:
				System.out.println("프로그램 종료합니다.");
				run = false;
			}
		}
	}
}
