/*
 * 1 ~ 50������ ���ڸ� ����ϵ� 3�Ǵ� 5�� ����� *�� ����ϴ� ���α׷�
 */
public class OneToFifty {

	public static void main(String[] args) {
		
		for( int i = 1 ; i <= 50 ; i++ ) {//	50�� �ݺ�
			if( i % 3 == 0 || i % 5 == 0 ) {	//	i�� 3 �Ǵ� 5�� ���� �������� 0�̸� * ���
				System.out.print( "*\t" );
			}else	{							//	�ƴ϶�� i ���
				System.out.print( i + "\t" );
			}
			
		}

	}

}
