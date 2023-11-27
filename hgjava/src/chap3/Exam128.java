package chap3;

import java.util.*;

public class Exam128 {

	public static void main(String[] args) {
		// 문제4
		 int penNum = 534;
		 int stuNum = 30;
		 
		 int ppsNum = penNum / stuNum;
		 int rempNum = penNum % stuNum;
		 
		 System.out.printf("학생당 연필 수 : %d, 남은 연필 수 : %d \n", ppsNum, rempNum);
		 
		 //문제5-> 강제 타입변환
		 
		 //문제6 
		 int value = 356;
		 System.out.println(value/100*100);
		 
		 //문제7 => 부동소수점 표현 방식 0.1은 0.1 보다 큰값
		 // 강제타입 변환 (float)0.1
		 
		 //문제8
		 //사다리꼴의 너비 = (윗변 + 아랫변) * 높이 /2
		 System.out.println((10+5)*7/2.0);
		 
		 //문제9
		 Scanner sc = new Scanner(System.in);
		 System.out.print("첫번째 수 : ");
		 double num1 = sc.nextDouble();
		 
		 System.out.print("두번째 수 : ");
		 double num2 = sc.nextDouble();
		 
		 if(num2 == 0.0) {
			 System.out.println("결과 : 무한대");
		 }else {
			 System.out.println("결과 : " + (num1 / num2));
		 }
		 
		 //10번
		 
		 int v1 = 10;
		 int v2 = 3;
		 int v3 = 14;
		 double v4 = v1 * v1 * Double.parseDouble(v2 + "."+ v3);
		 System.out.println("원의 너비 = " + v4);

		 //11번  : 기본타입 데이터 비교 (==), 참조타입 비교 (equals()) 
		 
	}// end main

}//end class
