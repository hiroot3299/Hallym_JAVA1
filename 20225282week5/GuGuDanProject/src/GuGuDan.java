/*
 * 1�ܺ��� 9�ܱ����� �������� ����ϴ� ���α׷�
 */
import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		int i = 1;	// 1���� 9������ �ݺ��ϸ鼭 ���� ��
		int dan = 0;	//	����ڷκ��� �Է¹��� ���� ��
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ ���� �Է��ϼ��� : ");
		dan = s.nextInt();	// �ܿ� �ش��ϴ� ���� �Է�
		
		while( i < 10 )	{
			System.out.println(dan + " * " + i + " = " + ( dan * i ) );//	����� ���
			i++;
		}
		
		
	}

}
