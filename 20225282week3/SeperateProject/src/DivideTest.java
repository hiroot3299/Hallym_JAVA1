/*
 * ��� ������ ������ ���ؼ� �� �ڸ��� ���ڸ� �̾Ƴ��� ���α׷�.
 */

import java.util.Scanner;


public class DivideTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int input;
		
		System.out.print("������ �Է��ϼ��� : ");
		input = s.nextInt();
		
		System.out.println("õ�� �ڸ� : " + input/1000);
		input = input%1000;
		
		System.out.println("���� �ڸ� : " + input/100);
		input = input%100;
		
		System.out.println("���� �ڸ� : " + input/10);
		input = input%10;
		
		System.out.println("���� �ڸ� : " + input);
		
	}

}
