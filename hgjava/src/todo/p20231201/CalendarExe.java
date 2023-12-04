package todo.p20231201;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		int year = 2020;
		int month = 2;

		System.out.println(year + "년 " + month + "월 달력.");

		Calendar today = Calendar.getInstance();

		// 10월 달력 작성.
		today.set(Calendar.YEAR, year);
		today.set(Calendar.MONTH, (month - 1));
		today.set(Calendar.DATE, 1);

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();

		// 빈공백 생성.
		int spaces = today.get(Calendar.DAY_OF_WEEK);
		for (int i = 0; i < spaces - 1; i++) {
			System.out.printf("%4s", "");
		}

		int lastDate = today.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + spaces - 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n== the end ==");
	}
}
