package chap4;

import java.util.Scanner;

public class Exam160 {

	public static void main(String[] args) {
		// ����2 : 3�� ��� ��
		// 1.���� ������ ����
			int sum = 0;
		// 1���� 100���� �� �߻� �ݺ���
			for(int i=1; i<=100; i++) {
				if(i % 3 == 0){		//3�� ������� ���ǹ�
					sum += i;
				}
			}
		
		 System.out.println("3�� ����� : " + sum);// ������ �� ���
		 
		 //����3
		 while(true) {
			 int dice1 = (int)(Math.random()*6) +1;
			 int dice2 = (int)(Math.random()*6) +1;
			 System.out.printf("(%d,%d)\n", dice1, dice2);
			 if(dice1 + dice2 == 5) {
				 break;
			 }
		 }
		 System.out.println("����");
		 
		 //����4
		 
		 //x : 1~ 10���� �ݺ�
		 	// y 1~10���� �ݺ�
		 		// 4*x + 5*y = 60�� �� ã��
		 
		 //����5
		 
		 //����6
		 
		 //����7
		 boolean run = true;
		 int balance = 0;
		 Scanner sc = new Scanner(System.in);
		 int money = 0;
		 
		 while(run) {
			 System.out.println("--------------------------------");
			 System.out.println("1.���� | 2.��� | 3. �ܰ� | 4. ����");
			 System.out.println("--------------------------------");
			 System.out.print("���� > ");
			 int sNum = sc.nextInt();
			 
			 switch(sNum) {
			 case 1 :
				 System.out.print("���ݾ� > ");
				 money = sc.nextInt();
				 balance += money;
				 break;
			 case 2 :
				 System.out.print("��ݾ� > ");
				 money = sc.nextInt();
				 if(money > balance) {
					 System.out.println("�ܰ����");
				 }else {
					 balance -= money;
				 }
				 break;
			 case 3 :
				 System.out.println("�ܰ� > " + balance);
				 break;
			 case 4 :
				 System.out.println("���α׷� ����");
				 run = false;
			 }
			 
		 }
		 
		 

	}// end main

}// end class
