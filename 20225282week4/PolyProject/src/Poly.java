/*
 * 2�� ������ ��� ���α׷�
 * ����ڷ� ���� 2�� �������� a,b,c�� �Է¹޾� �Ǻ����� ���� ���ϰ�
 * x���� ���ϴ� ���α׷�.
 */
import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;	//	2�� �������� 2�� ���
		int b = 0;	//	2�� �������� 1�� ���
		int c = 0;	//	2�� �������� ���
		int D = 0;	//	���� ���� �Ǻ���
		
		System.out.println("2�� ������ ax^2 + bx + c = 0 �� a ,b ,c ������ �Է��ϼ���");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		D = (b*b) - (4*a*c);
		
		if(D > 0) {
			System.out.println("x1 = " + ( (-b+Math.sqrt(D)) / 2*a) );
			System.out.println("x2 = " + ( (-b-Math.sqrt(D)) / 2*a) );
		}else if(D == 0) {
			System.out.println("x1 = " + (-b / 2*a));
			System.out.println("x1 = " + (-b / 2*a));
		}else {
			System.out.println("x1 = " + ( (-b+Math.sqrt(D)) / 2*a) + "i");
			System.out.println("x1 = " + ( (-b+Math.sqrt(D)) / 2*a) + "i");
		}
	}

}
