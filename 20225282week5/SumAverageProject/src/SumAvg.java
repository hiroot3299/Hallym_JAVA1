/*
 * �Էµ� ������ ����� ���ϴ� ���α׷�
 */
import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int inputNumber = 0;
		int sum = 0;	//	���������� �ʱⰪ�� �ִ°� ����.
		double avg = 0.0;	//	���� ���
		int count = 1;	//	����� ����ϱ� ���� �Է� ī��Ʈ
		
		do	{
			System.out.print("���� �Է� : ");
			inputNumber = s.nextInt();	//	���� �ޱ�
			
			sum += inputNumber;
			if( inputNumber == 0 )	{	//	0�̸� �ݺ��� Ż��
				break;
			}
			avg = (double)sum / count++;	//	����� �Ҽ����� �����ϴ� ������ �����̱� ������ �Ǽ� �������� �ؾ���.
			System.out.println( "-> �� : " + "���" + avg);
			
		}while(true);
		

	}

}
