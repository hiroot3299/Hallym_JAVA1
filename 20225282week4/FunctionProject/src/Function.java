/*
 * ���׽� �Լ��� x ���� �Է¹޾� �Լ��� ����� ����ϴ� ���α׷�
 */
import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0;	//	���׽� �Լ��� x ��
//		int result = 0;
		
		System.out.print("���׽� ��꿡 �ʿ��� x �� �Է� : ");
		x = s.nextInt();
		
		if(x <= 0)	{
//			result = x*x*x-9*x+2;
			System.out.println("x^3 - 9x + 2 = " + (x*x*x-9*x+2));
		}else {
//			result = 7*x+2;
			System.out.println("7x + 2 = " + (7*x+2));
		}
		
	}

}
