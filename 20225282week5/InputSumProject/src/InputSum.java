/*
 * ���� �Է��ϰ� �װ��� ��� ���� ������ ���� ����ؼ� ����ϴ� ���α׷�
 */
import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputNumber = 0;	//�Է°��� ������ ����.
		int sum = 0;	//	���������� 0���� �ʱ�ȭ�ϴ°� ����.
		
		while( sum <= 500 ) {	//	sum �� 500�� ������ �ݺ� ����
			System.out.print("������ ���� �Է��ϼ��� : ");
			inputNumber = s.nextInt();	//	������ ���� �Է�
			if( inputNumber == 0 ) {	//	�Է� ���ڰ� 0�̸� �ݺ� ���� �� ���� ������ ���
				System.out.printf("��������� ���� ���� %d �Դϴ�.\n", sum);
				break;
			}
			sum = sum + inputNumber;	//	���� ����
			System.out.println("�� �������� " + sum + "�Դϴ�.");
		}
		
		
		
		
	}

}
