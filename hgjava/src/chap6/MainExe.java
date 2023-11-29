package chap6;

public class MainExe {
	public static void main(String[] args) {
		Member[] members = new Member[5];
		members[0] = new Member(4, "Hong1", "010-1111", "Men");
		members[1] = new Member(2, "Hong2", "010-2222", "Men");
		members[2] = new Member(1, "Hong3", "010-3333", "Men");
		members[3] = new Member(3, "Hong4", "010-4444", "Men");
		members[4] = new Member(5, "Hong5", "010-5555", "Men");

		Member temp = members[0];
		for (int i = 0; i < members.length - 1; i++) {
			for (int j = 0; j < members.length - 1; j++) {
				if (members[j].getMemberNo() > members[j + 1].getMemberNo()) {
					temp = members[j];
					members[j] = members[j + 1];
					members[j + 1] = temp;
				}
			}
		}
		for (Member member : members) {
			System.out.println(member.showAllInfo());
		}
	}
}
