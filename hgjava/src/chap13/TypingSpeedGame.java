package chap13;

import java.util.ArrayList;
import java.util.List;

public class TypingSpeedGame {
	public static void main(String[] args) {
		String word = "Check CDK v2 applications for best practices using a combination on available rule packs.";
		String[] words = word.split(" ");
		List<String> list = new ArrayList<>();
		for (String str : words) {
			list.add(str);
		}

		boolean run = true;

		while (run) {
			// 목록출력하고.....

			// 입력값과 목록값과 비교해서 있으면 제거.

			list.remove(0);
			list.remove(0);
			list.remove(0);

			System.out.println(list.size());
		}

		System.out.println("end of game");
//		for (String str : list) {
//			System.out.println(str);
//		}
		// 목록출력.
		// Scanner 사용해서 입력값을 저장.
		// 사용자 입력값과 컬렉션의 값과 비교해서 같은 단어 있으면 삭제.
		// 시작시점 ~ 종료시점 걸린시간을 초단위로 계산.
		// 완료하는데 35초가 걸림.

	}
}
