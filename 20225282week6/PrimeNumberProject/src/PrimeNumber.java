/*
 * ��� �ִ��� �Է��ϰ� ���� ���� ���� �� �Ҽ����� ����ϴ� ���α׷�.
 */
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0;	//	��� �ִ� ����
		int value = 0;	//	�������� �����ϱ� ���� ����
		
		System.out.print("��� �ִ� �Է� : ");
		max = s.nextInt();
		
		System.out.print("�Ҽ�:\t");
		
		for( int i = 2 ; i <= max ; i++ ) {	//	����� �Ǻ��� ����
			
			for( int j = 2 ; j <= i ; j++ ) {	//	�����⿡ ����� ����
				
				value = i%j;	//	�Ҽ� �Ǻ��� ���� ������ ����
				
				if(( value == 0 )) {	//	������ �������ٴ� ���� �������� 0�̶� ��

					if(j != i) {	//	������ �������� �� �װ� �ڱ� �ڽŰ� ���� ���� �ƴ϶��, ( 1�δ� �翬�� ������ �������� ������ ����)
						
						break;	// �׳� �ݺ��� Ż��
						
					}else {	// ������ �������� �� �� ���� �ڱ� �ڽ��̶��
						
						System.out.print( i + "\t" );	//	�Ҽ����� �˸��� ���� ��¹�
						break;	// �ݺ��� Ż��
						
					}
					
				}
				
			}
			
		}
		
	}

}
