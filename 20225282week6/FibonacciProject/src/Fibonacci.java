/*
 * ����� ������ ���� �Է��Ͽ� �Ǻ���ġ ������ ����ϱ� ���� ���α׷�. 
 */
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int end = 0;
		int first = 0;	//	�Ǻ���ġ ���� ù��°�� 0
		int second = 1;	//	�Ǻ���ġ ���� �ι�°�� 1
		int next;	// ���� �Ǻ���ġ �������� ����ϱ� ���� ����
		
		System.out.print("������ �� �Է� : ");
		end = s.nextInt();
		
		System.out.print("�Ǻ���ġ ���� : ");
		
		for( int i = 0 ; i < end ; i++ ) {
			
			if( i < 2 ) {	//	1, 2��° ���� �̹� ������ �ֱ� ������ �״�� ���.
				
				System.out.print(i + " , ");
				
			}else {
				
				next = first + second;	//	�� ������ ���� �� ���� ��
								//	0	1	1	2	3
								//	f	s	n
				
				first = second;	//	0	1	1	2	3
				second = next;	//		f	s	n
				
				if(i!=end-1) {
					System.out.print( next + " , ");
				}else {
					System.out.print( next );	//	������ ��¿��� , ������� �ʰ� ��.
				}
				
			}
			
		}
		
	}
	
}
