package tst.t20231206;

import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료");
		System.out.print("입사일자>>");
		scn.next();
		System.out.println("사번   이름  입사일자");
		System.out.println("23-19  김신입  2023-12-01");
		System.out.println("23-20  박신입  2023-12-02");
		System.out.println("23-21  최신입  2023-12-03");
	}
}
