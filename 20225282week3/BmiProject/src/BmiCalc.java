/*
 * �񸸵��� ����ϴ� ���α׷�
 */
import java.util.Scanner;


public class BmiCalc {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double height = 0.0;
		double weight = 0.0;
		double stweight = 0.0;
		double bmi = 0.0;
		
		System.out.println("�񸸵��� ����մϴ�.");
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = s.nextInt();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		weight = s.nextInt();
		
		stweight = (height-100)*0.9;
		bmi = (weight - stweight)/stweight*100;
		
		System.out.println("ǥ�� �����Դ� " + stweight + "�Դϴ�");
		System.out.println("�� ������ " + bmi + "�Դϴ�.");
	
	}
}
