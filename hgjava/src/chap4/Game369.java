package chap4;

public class Game369 {

	public static void main(String[] args) {
		// 1~ 50 : 369게임
		
		// 3,6,9 갯수 체크 변수
		int cnt = 0;
		// 숫자 1~50 반복문
		for(int i=1; i<=50; i++) {
			cnt = 0;// 다음 수를 위한 초기화
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) cnt++;// 일의 자리에 3,6,9 갯수 체크
			if(i/10 == 3 || i/10 == 6 || i/10 == 9) cnt++;// 십의 자리에 3,6,9 갯수 체크
			// 갯수가 0 -> 숫자,  갯수가 1 -> ♥,  갯수가 2 -> ♥♥
			switch(cnt) {
			case 0 : System.out.print(i + "\t");break;
			case 1 : System.out.print("♥\t");break;
			case 2 : System.out.print("♥♥\t");
			}
			
			if(i%10 == 0) System.out.println(); // 한 줄에 10개씩 출력 
		}
		
		//동전 교환 
		
		
		
		// 숫자 맞추기 1~100 사이수
		
		// com 숫자 발생  Math.random()
		
		//반복문 실행
			//숫자 입력 받음
			// 입력숫자 == com  -> 축하합니다  반복문 탈출
			// 입력숫자 > com -> down 하세요
			// 입력숫자 < com -> up 하세요
		
		
		

	}// end main

}//end class
