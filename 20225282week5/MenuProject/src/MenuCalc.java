
/*
 * ����� �� �ΰ��� �Է¹ް� �Էµ� ���ڿ� ���� �۾��� �����ϴ� ���α׷�
 */

import java.util.Scanner;

public class MenuCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int firstN = 0;
		int secondN = 0;
		int menu = 0;	//	�Է¹��� �޴� ����
		
		do {
			System.out.print("select menu");
			System.out.println("1. ���� �Է�");
			System.out.println("2: ���ϱ�");
			System.out.println("3: ����");
			System.out.println("4: ���ϱ�");
			System.out.println("5: ������");
			System.out.println("6: ����");
			
			System.out.print("�޴� ���� : ");
			menu = s.nextInt();
			
			switch( menu )	{
			case 1:
				System.out.print("�� ���� �Է��ϼ��� : ");
				firstN = s.nextInt();
				secondN = s.nextInt();
				break;
				
			case 2:
				if( firstN == 0 && secondN   == 0)	//�Է� ���ο� ���ؼ� ���� �Ǵ��ϱ�
					System.out.println("���� ���� �Է��ϼ���");
				else
					System.out.print("�� ���� ���� ���� : " + ( firstN - secondN ));
					break;
			
			case 3:
				System.out.print("�� ���� �� ���� : " + ( firstN + secondN ));
				break;
				
			case 4:
				System.out.print("�� ���� ���� ���� : " + ( firstN + secondN ));
				break;
				
			case 5:
				System.out.print("�� ���� ���� ���� : " + ( firstN + secondN ));
				break;
				
			case 6:
				System.out.print("����");
				break;
				
				
			}
			
		}while( menu == 6 );
	}

}
