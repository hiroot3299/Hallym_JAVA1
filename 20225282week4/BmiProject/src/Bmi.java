/*
 * �񸸵��� ����ؼ� �� ���θ� �Ǵ��ϴ� ���α׷�
 */
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double height = 0;	//	Ű ����
		double weight = 0;	//	������ ����
		double stWeight = 0;	//	��� ������
		double bmi = 0;	//	�񸸵�
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = s.nextDouble();
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		weight = s.nextDouble();
		
		stWeight = (height - 100)*0.9;
		bmi = (weight - stWeight) / stWeight*100;
		
		if(bmi < 20) {
			System.out.println("�񸸵��� �����Դϴ�.");
		}else if(bmi <= 30) {
			System.out.println("�񸸵��� �浵���Դϴ�.");
		}else if(bmi <=50)	{
			System.out.println("�񸸵��� ���������Դϴ�.");
		}else	{
			System.out.println("�񸸵��� �����Դϴ�.");
		}
		
		s.close();
	}

}
