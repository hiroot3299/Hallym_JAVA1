/*
 * ������ ���̿� �ʺ� �Է��ϰ� �� ���� ����
 * ���� ������ ����ϴ� ���α׷�.
 */
import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int height = 0;	//	������ ����
		int width = 0; //	������ �ʺ�
		
		System.out.print("������ ���� : ");
		height = s.nextInt();
		System.out.print("������ ���� : ");
		width = s.nextInt();
		
		System.out.println("�簢��");
		for( int i = 0 ; i < height ; i++ ) {	//	�ݺ��Ǿ ���� ������ ��� �ݺ��ؼ� ����� ����.
			
			for( int j = 0 ; j < width ; j++ ) {	//	���� ��� �ݺ��ؼ� ������.
				
				System.out.print("*");
				
			}
			
			System.out.println();	//	�� ���� �� �ٹٲ�
			
		}
		
		System.out.println("�����ﰢ��");
		for( int i = 0 ; i < height ; i++ ) {	//	i=	0	1	2	3
			
			for( int j = 0 ; j < i + 1 ; j++ ) {//	j=	1	2	3	4	�� ��� ����
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("�̵�ﰢ��");					//height ex) 5
		for( int i = 0 ; i < height ; i++ ) {				//	i=	0	1	2	3
			
			for( int j = 0 ; j < height - i - 1 ; j++ ) {	//	j=	4	3	2	1	���� ����
				
				System.out.print(" ");
				
			}
			
			for( int j = 0 ; j < i * 2 + 1 ; j++ ) {		//	j=	1	3	5	7	�� ����
				
				System.out.print("*");
			
			}
			
			System.out.println();
			
		}
		
		System.out.println("���ﰢ��");
		for( int i = 0 ; i < height ; i++ ) {			//i=	0	1	2	3	4	�� ����
			
			for( int j = 0 ; j < i ; j++ ) {			//j=	0	1	2	3	4	���� ����
				
				System.out.print(" ");
				
			}
			
			for( int j = 0 ; j < (height - i)*2 - 1 ; j++) {
														//j=	9	7	5	3	1	�� ����
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}
