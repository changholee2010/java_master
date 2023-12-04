package chap13;

import java.util.Scanner;

public class ListExe3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 회원등록(회원번호, 이름, 포인트)
		// 1.등록 2.이름조회 3.포인트변경 4.삭제 5.종료.\
		System.out.println("회원번호 이름 포인트");

		String input = scn.nextLine();
		String[] inAry = input.split(" ");
		System.out.println(inAry[0]);
		System.out.println(inAry[1]);
		System.out.println(inAry[2]);

		System.out.println("end");
	}
}
