/*
 * 1~50�� ���ڸ� ��������� 3�Ǵ� 5�� ����� *�� ����ϴ� ���α׷�.
 */
public class ThreeOrFive {

	public static void main(String[] args) {
		int i = 1;	//	���� ����� ���� ī��Ʈ ����
		
		while( i <= 50 )	{	//	i�� 50 ���϶�� ��� �ݺ�
			if( i % 3 == 0 || i % 5 == 0 ) {
				//i�� 3 �Ǵ� 5�� ���� �������� 0�̶�� ��� �ݺ�
				System.out.print("* ");	// �����
			}
			System.out.print( i + " " );	
			i++;	//	i ����
		}

	}

}
