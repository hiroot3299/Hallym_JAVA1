/*
 * �ΰ��� ���� �Է¹޾� ���迬���ڸ� ���� ���ϰ� ����� ����ϴ� ���α׷�
 */

import java.util.Scanner;


public class LogicalTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean tf;
		
		int first;
		int second;
		
		System.out.print("ù��° �� �Է� : ");
		first = s.nextInt();
		
		System.out.print("�ι�° �� �Է� : ");
		second = s.nextInt();
		
		tf = first < second;
		
		System.out.println(first + " < " + second + " �� " + tf);
		System.out.println(first + " > " + second + " �� " + (first>second));
		System.out.println(first + " <= " + second + " �� " + (first<=second));
		System.out.println(first + " >= " + second + " �� " + (first>=second));
		System.out.println(first + " == " + second + " �� " + (first==second));
		System.out.println(first + " != " + second + " �� " + (first!=second));
		System.out.println("!(" + first + " != " + second + ")" + " �� " + !(first!=second));
	}

}
