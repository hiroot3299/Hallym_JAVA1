/*
 * Ű����� ���� �޴��� �Է¹޾� ó���ϴ� �޴���� ���α׷�
 */

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyInput = new Scanner(System.in);
		int menu;
		
		System.out.println("*******�޴�*******");
		System.out.println("[1] �Է� : ");
		System.out.println("[2] ��� : ");
		System.out.println("[3] �ʱ�ȭ : ");
		System.out.println("[4] ���� : ");
		System.out.println("�޴��� �����ϼ���");
		menu = keyInput.nextInt();
		
		System.out.println(menu + "�� �޴��� �����ϼ̽��ϴ�.");
		
		
	}

}
