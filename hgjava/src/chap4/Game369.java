package chap4;

public class Game369 {

	public static void main(String[] args) {
		// 1~ 50 : 369����
		
		// 3,6,9 ���� üũ ����
		int cnt = 0;
		// ���� 1~50 �ݺ���
		for(int i=1; i<=50; i++) {
			cnt = 0;// ���� ���� ���� �ʱ�ȭ
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) cnt++;// ���� �ڸ��� 3,6,9 ���� üũ
			if(i/10 == 3 || i/10 == 6 || i/10 == 9) cnt++;// ���� �ڸ��� 3,6,9 ���� üũ
			// ������ 0 -> ����,  ������ 1 -> ��,  ������ 2 -> ����
			switch(cnt) {
			case 0 : System.out.print(i + "\t");break;
			case 1 : System.out.print("��\t");break;
			case 2 : System.out.print("����\t");
			}
			
			if(i%10 == 0) System.out.println(); // �� �ٿ� 10���� ��� 
		}
		
		//���� ��ȯ 
		
		
		
		// ���� ���߱� 1~100 ���̼�
		
		// com ���� �߻�  Math.random()
		
		//�ݺ��� ����
			//���� �Է� ����
			// �Է¼��� == com  -> �����մϴ�  �ݺ��� Ż��
			// �Է¼��� > com -> down �ϼ���
			// �Է¼��� < com -> up �ϼ���
		
		
		// for... �߰��Ǿ���.....
		for(int i=0;i<10;i++) {
			System.out.println("hhhhhh");
		}

	}// end main

}//end class