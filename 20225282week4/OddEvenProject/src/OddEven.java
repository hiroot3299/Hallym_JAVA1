/*
 * �Է¹��� ������ Ȧ������ ¦������ �����ϴ� ���α׷�
 */
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputNumber = 0;	//	�Է¹��� ��
		
		System.out.print("Ȧ���� ¦���� ������ ���� �Է��ϼ��� : ");
		inputNumber = s.nextInt();
		
		if(inputNumber%2 == 0)	{
			System.out.printf("�Է¹��� ���� %d ��(��) ¦���Դϴ�.",inputNumber);
		}else	{
			System.out.printf("�Է¹��� ���� %d ��(��) Ȧ���Դϴ�.",inputNumber);
		}
		
		s.close();

	}

}
