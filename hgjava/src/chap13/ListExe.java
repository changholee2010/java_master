package chap13;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		// 배열인 경우.
		String[] strs = new String[10];
		strs[0] = "Apple";
		strs[1] = "Banana";
		strs[2] = "Cherry";

		strs[2] = null; // 삭제.
		strs[0] = "Banana";

//		for (int i = 0; i < strs.length; i++) {
//			System.out.println(strs[i]);
//		}
		// ArrayList인 경우.
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		if (list.add("Cherry")) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		for (int i = 1; i <= 5; i++)
			list.add(list.size(), "null");

		// list.remove("Apple"); // 삭제.

		// list.set(0, "바나나"); // 변경.
		// list.clear(); // 전체 요소 삭제.

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 컬렉션의 크기 변경.
//		for (int i = 0; i < 100; i++) {
//			list.add("" + i);
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		// 이름저장.
		List<String> names = new ArrayList<String>();
		names.add("홍길동"); // 0: 첫번째.
		names.add("김길동"); // 1: 두번째.
		names.add("박철수"); // 2: 세번째.

		String search = "길동";
		int cnt = 0;

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).indexOf(search) != -1) {
				cnt++;
			}
		}
		System.out.println(search + "은 " + cnt + "명 입니다.");
	}
}