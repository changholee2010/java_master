package todo.p20231127;

import java.util.Scanner;

public class FriendApp {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		Friend[] friends = null;
		int friendNum = 0;

		while (run) {
			System.out.println("1.ģ���� 2.�Է� 3.��� 4.���� 5.����");
			int menu = scn.nextInt();
			scn.nextLine();
			switch (menu) {
			case 1:
				System.out.println("ģ���� �Է�>> ");
				friendNum = scn.nextInt();
				scn.nextLine();
				friends = new Friend[friendNum];

				break;
			case 2:
				System.out.println("ģ�������Է�>>> ");
				for (int i = 0; i < friends.length; i++) {
					Friend friend = new Friend();
					System.out.print("�̸�>> ");
					friend.name = scn.nextLine();
					System.out.print("����ó>> ");
					friend.phone = scn.nextLine();
					System.out.print("������>> ");
					friend.bloodType = scn.nextLine();

					friends[i] = friend;
				}
				break;
			case 3:
				System.out.println("ģ�����");
				for (int i = 0; i < friends.length; i++) {
					System.out.println(
							"�̸�: " + friends[i].name + ",����ó: " + friends[i].phone + ", ������: " + friends[i].bloodType);
				}
				break;
			case 4:
				System.out.println("ģ���̸��Է�>>> ");
				String name = scn.nextLine();
				boolean exists = false;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i].name.equals(name)) {
						System.out.println("������ ����ó �Է�>>> ");
						friends[i].phone = scn.nextLine();
						exists = true;
					}
				}
				if (!exists) {
					System.out.println("ģ�������� �����ϴ�.");
				}
				break;
			case 5:
				System.out.println("�����մϴ�.");
				run = false;
			} // end of switch.
		} // end of while.
		System.out.println("end of prog.");
	} // end of main.
} // end of class.
