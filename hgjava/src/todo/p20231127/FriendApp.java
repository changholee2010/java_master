package todo.p20231127;

import java.util.Scanner;

public class FriendApp {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		Friend[] friends = null;
		int friendNum = 0;

		while (run) {
			System.out.println("1.친구수 2.입력 3.목록 4.수정 5.종료");
			int menu = scn.nextInt();
			scn.nextLine();
			switch (menu) {
			case 1:
				System.out.println("친구수 입력>> ");
				friendNum = scn.nextInt();
				scn.nextLine();
				friends = new Friend[friendNum];

				break;
			case 2:
				System.out.println("친구정보입력>>> ");
				for (int i = 0; i < friends.length; i++) {
					Friend friend = new Friend();
					System.out.print("이름>> ");
					friend.name = scn.nextLine();
					System.out.print("연락처>> ");
					friend.phone = scn.nextLine();
					System.out.print("혈액형>> ");
					friend.bloodType = scn.nextLine();

					friends[i] = friend;
				}
				break;
			case 3:
				System.out.println("친구목록");
				for (int i = 0; i < friends.length; i++) {
					System.out.println(
							"이름: " + friends[i].name + ",연락처: " + friends[i].phone + ", 혈액형: " + friends[i].bloodType);
				}
				break;
			case 4:
				System.out.println("친구이름입력>>> ");
				String name = scn.nextLine();
				boolean exists = false;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i].name.equals(name)) {
						System.out.println("변경할 연락처 입력>>> ");
						friends[i].phone = scn.nextLine();
						exists = true;
					}
				}
				if (!exists) {
					System.out.println("친구정보가 없습니다.");
				}
				break;
			case 5:
				System.out.println("종료합니다.");
				run = false;
			} // end of switch.
		} // end of while.
		System.out.println("end of prog.");
	} // end of main.
} // end of class.
