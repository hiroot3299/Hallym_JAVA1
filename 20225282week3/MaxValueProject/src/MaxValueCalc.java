/*
 * ���� �����ڸ� Ȱ���� ū ���� ã�� ���α׷�
 */

import java.util.Scanner;

public class MaxValueCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int first;
		int second;
		//int flag;

		System.out.print("ù��° ���� �Է� : ");
		first = s.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		second = s.nextInt();
		
		//flag = first > second ? first : second;
		//System.out.println("ū���� : " + flag);
		System.out.println("ū���� : " + (first>second?first:second));
		
	}

}
