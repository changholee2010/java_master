package chap3;

import java.util.*;

public class Exam128 {

	public static void main(String[] args) {
		// ����4
		 int penNum = 534;
		 int stuNum = 30;
		 
		 int ppsNum = penNum / stuNum;
		 int rempNum = penNum % stuNum;
		 
		 System.out.printf("�л��� ���� �� : %d, ���� ���� �� : %d \n", ppsNum, rempNum);
		 
		 //����5-> ���� Ÿ�Ժ�ȯ
		 
		 //����6 
		 int value = 356;
		 System.out.println(value/100*100);
		 
		 //����7 => �ε��Ҽ��� ǥ�� ��� 0.1�� 0.1 ���� ū��
		 // ����Ÿ�� ��ȯ (float)0.1
		 
		 //����8
		 //��ٸ����� �ʺ� = (���� + �Ʒ���) * ���� /2
		 System.out.println((10+5)*7/2.0);
		 
		 //����9
		 Scanner sc = new Scanner(System.in);
		 System.out.print("ù��° �� : ");
		 double num1 = sc.nextDouble();
		 
		 System.out.print("�ι�° �� : ");
		 double num2 = sc.nextDouble();
		 
		 if(num2 == 0.0) {
			 System.out.println("��� : ���Ѵ�");
		 }else {
			 System.out.println("��� : " + (num1 / num2));
		 }
		 
		 //10��
		 
		 int v1 = 10;
		 int v2 = 3;
		 int v3 = 14;
		 double v4 = v1 * v1 * Double.parseDouble(v2 + "."+ v3);
		 System.out.println("���� �ʺ� = " + v4);

		 //11��  : �⺻Ÿ�� ������ �� (==), ����Ÿ�� �� (equals()) 
		 
	}// end main

}//end class
