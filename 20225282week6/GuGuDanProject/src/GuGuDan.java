/*
 * ����ڷ� ���� �� ���� �Է¹޾Ƽ� �������� ����ϴ� ���α׷�
 */
import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("����� �������� �� ���� �Է��ϼ��� : ");
		int inputV = s.nextInt();	//	����
		
		for( int i = 1 ; i <= 9 ; i++ ) {	//	i�� 9���� ��ȭ�ϸ鼭 ���
			System.out.println(inputV + " * " + i + " = " + (inputV*i));	//	A * B = C �� �������� ���
		}
	}

}
