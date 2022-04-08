/*
 * 초단위 시간을 입력받고 이를 일.시간.분.초로 변환하는 프로그램
 */

import java.util.Scanner;

public class TimeCalc {

	public static void main(String[] args) {
		
	      int hour = 0;
	      int minute = 0;
	      int second = 0;
	      int value = 0;
	      int day = 0;
	      
	      Scanner input = new Scanner(System.in);
	      System.out.print("초단위 시간을 입력하세요:");
	      value = input.nextInt();
	      second = value % 60 ;
	      value = value / 60;
	      minute = value % 60;
//	      hour = value / 60;
	      value = value / 60;
	      hour = value % 60;
	      day = value / 24;
	      
	      System.out.printf( "%d 일 %d 시간 %d 분 %d초입니다." , day , hour , minute , second );
	      //	System.out.print( hour + "시간" + minute + "분" + second +"초입니다.");
	      input.close();
	}

}
