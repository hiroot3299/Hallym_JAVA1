/*
 * �� ���� �Է¹ް� �̸� �Է¹��� �޴����� ���� ����� ����ϴ� ���α׷�
 * switch ��� ����
 */

import java.util.Scanner;

public class MenuSelect {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first = 0;
		int second = 0;
		int menu = 0;
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		first = s.nextInt();
		second = s.nextInt();
		
		System.out.println("�޴�");
		System.out.println("1. ������");
		System.out.println("2. ū ��");
		System.out.println("3. �հ�");
		System.out.println("4. ���");
		System.out.println("5. ����");
		System.out.print("�޴��� �����ϼ��� : ");
		menu = s.nextInt();
		
//		if( menu == 1)	{
//			
//		}else if(menu == 2) {
//		
//		}else if(menu == 3)	{
//			
//		}else if(menu == 4)	{
//			
//		}else {
//			
//		}
		
		switch(menu) {
		case 1:
			System.out.println("��� : " + (first > second ? second : first));
			break;
		case 2:
			System.out.println("��� : " + (first > second ? first : second));
			break;
		case 3:
			System.out.println("��� : " + (first + second));
			break;
		case 4:
			System.out.println("��� : " + (first + second) / 2.0);
			break;
		case 5:
			System.out.println("�����մϴ�.");
			break;
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
		s.close();
		
	}

}
