/*
 * 1~10�� ���� �� Ȧ���� ����ϴ� ���α׷�
 */
public class OneToTenOdd {

	public static void main(String[] args) {
		int i = 1;	//	���� ����� ���� ī��Ʈ ����
		
		while( i <= 10 ) {	//i�� 10���� �۰ų� ������ ��� �ݺ�
			if( i % 2 == 1 ) {
				System.out.print( ( i ) + " " );
				//i�� 2�� ���� �������� 1�� ���� i�� ���
				//	= Ȧ���� ����
			}
			i++;	//	i�� ����
		}

	}

}
