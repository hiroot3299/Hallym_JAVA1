/*
 * ����ڷ� ���� �� ������ �Է¹޾� ũ�⸦ ���ϴ� ���α׷�
 */
import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first = 0;
		int second = 0;
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		first = s.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		second = s.nextInt();
		
		if(first > second) {
			System.out.println("ù ��° ���� "+ first + " ��(��) �� ��° ���� " + second + " ���� ŭ");
		}else if(first < second)	{
			System.out.println("�� ��° ���� " + second + " ��(��) ù ��° ���� " + first + "���� ŭ");
		}else {
			System.out.println("ù ��° ���� "+ first + " ��(��) �� ��° ���� " + second + " ��(��) ����");
		}
		
		s.close();
	}

}
