import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int radius = 0;
		double area = 0.0;
		
		System.out.println("�������� �Է��ϼ��� : ");
		radius = scan.nextInt();
		
		area = radius * radius * 3.14;
		
		System.out.printf("������ %d�� ���� ������ %9.6f�Դϴ�." , radius , area );
		
		
	}

}
