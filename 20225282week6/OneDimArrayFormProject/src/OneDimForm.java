/*
 * �Էµ� ���ڸ�ŭ 1���� �迭 ������� �ݺ��ϴ� ���α׷�
 */
import java.util.Scanner;
public class OneDimForm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ũ�⸦ �Է��ϼ��� : ");
		int size = s.nextInt();
		
		for( int i = 0 ; i < size ; i++ ) {	//	�Էµ� ũ�⸸ŭ �ݺ� 
			System.out.print("[" + i + "] ");	//	�迭 �������� ���
		}

	}

}
