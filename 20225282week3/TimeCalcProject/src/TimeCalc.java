/*
 * �ʴ��� �ð��� �Է¹ް� �̸� ��.�ð�.��.�ʷ� ��ȯ�ϴ� ���α׷�
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
	      System.out.print("�ʴ��� �ð��� �Է��ϼ���:");
	      value = input.nextInt();
	      second = value % 60 ;
	      value = value / 60;
	      minute = value % 60;
//	      hour = value / 60;
	      value = value / 60;
	      hour = value % 60;
	      day = value / 24;
	      
	      System.out.printf( "%d �� %d �ð� %d �� %d���Դϴ�." , day , hour , minute , second );
	      //	System.out.print( hour + "�ð�" + minute + "��" + second +"���Դϴ�.");
	      input.close();
	}

}
