/*
 * ���� ���ǿ� ������ ����ϴ� ���α׷�
 */
import java.util.Scanner;

public class CirCleCalc {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int radius = 0;
		//float pi = 3.14F;
		double pi = 3.14;
		double volume = 0.0;
		double surface = 0.0;
		
		System.out.print("������ �������� �Է��ϼ��� : ");
		radius = s.nextInt();
		
		volume = 4.0/3.0*pi*radius*radius*radius;
		surface = 4*(pi)*(radius*radius);
		
		System.out.println("�������� " + radius + "�� ���� ���Ǵ� " + volume);
		System.out.println("�������� " + radius + "�� ���� ǥ������ " + surface);

	}

}
