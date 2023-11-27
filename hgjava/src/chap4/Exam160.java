package chap4;

import java.util.Scanner;

public class Exam160 {

	public static void main(String[] args) {
		// 문제2 : 3의 배수 합
		// 1.합을 저장할 변수
			int sum = 0;
		// 1에서 100까지 수 발생 반복문
			for(int i=1; i<=100; i++) {
				if(i % 3 == 0){		//3의 배수인지 조건문
					sum += i;
				}
			}
		
		 System.out.println("3의 배수합 : " + sum);// 구해진 합 출력
		 
		 //문제3
		 while(true) {
			 int dice1 = (int)(Math.random()*6) +1;
			 int dice2 = (int)(Math.random()*6) +1;
			 System.out.printf("(%d,%d)\n", dice1, dice2);
			 if(dice1 + dice2 == 5) {
				 break;
			 }
		 }
		 System.out.println("종료");
		 
		 //문제4
		 
		 //x : 1~ 10까지 반복
		 	// y 1~10까지 반복
		 		// 4*x + 5*y = 60인 값 찾기
		 
		 //문제5
		 
		 //문제6
		 
		 //문제7
		 boolean run = true;
		 int balance = 0;
		 Scanner sc = new Scanner(System.in);
		 int money = 0;
		 
		 while(run) {
			 System.out.println("--------------------------------");
			 System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4. 종료");
			 System.out.println("--------------------------------");
			 System.out.print("선택 > ");
			 int sNum = sc.nextInt();
			 
			 switch(sNum) {
			 case 1 :
				 System.out.print("예금액 > ");
				 money = sc.nextInt();
				 balance += money;
				 break;
			 case 2 :
				 System.out.print("출금액 > ");
				 money = sc.nextInt();
				 if(money > balance) {
					 System.out.println("잔고부족");
				 }else {
					 balance -= money;
				 }
				 break;
			 case 3 :
				 System.out.println("잔고 > " + balance);
				 break;
			 case 4 :
				 System.out.println("프로그램 종료");
				 run = false;
			 }
			 
		 }
		 
		 

	}// end main

}// end class
