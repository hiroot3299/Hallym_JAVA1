/*
 * ���׽� ������α׷�
 * x�� �Է¹޾� �����.
 */

import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = 0; //���׽Ŀ� ����� x�� ����
		int result = 0;
		
		System.out.println("x���� �Է��ϼ��� : ");
		x = s.nextInt();
		
		result = 3 * ( x * x * x ) + 7 * ( x * x ) + 9;
		
		System.out.println("���׽� ������� : " + result);
	}

}
