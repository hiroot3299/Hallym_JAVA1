/*
 * ��Ŭ���� ȣ������ Ȱ���� �ִ������� ���ϴ� ���α׷�
 */
import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int firstN = 0;
		int secondN = 0;
		int x;	//	�� �Է°� �� ū��
		int y;	// 	�� �Է°� �� ���� ��
		int r;	//	�� ���� ���� ������ ��
		
		System.out.print("�ִ� ������� ���� �� ������ �Է��ϼ��� : ");
		firstN = s.nextInt();
		secondN = s.nextInt();
		x = firstN > secondN ? firstN : secondN;	//	ū�� ���ϴ� ���׿�����
		y = firstN < secondN ? firstN : secondN;	//	������ ���ϴ� ���׿�����
		
		while( y != 0 )	{	
			r = x % y;	//������ ���ϱ�
			x = y;
			y = r;
		}
		System.out.println("�ִ������� : " + x);
		

	}

}
