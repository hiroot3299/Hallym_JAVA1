/*
 * �ڽ��� ���� ���� �ʺ� �Է¹޾� Ű����κ��� �Է¹޾�
 * ���Ǹ� ����ϰ� ����ϴ� ���α׷�
 */
import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int length = 0;
		int width = 0;
		int height = 0;
		int volume = 0;
		
		System.out.println("������ ���̸� �Է����ּ���");
		length = scan.nextInt();
		System.out.println("������ �ʺ� �Է����ּ���");
		width = scan.nextInt();
		System.out.println("������ ���̸� �Է����ּ���");
		height = scan.nextInt();
		
		volume = length * width * height;
		
		System.out.println("������ ���Ǵ� " + volume + "�Դϴ�.");
	}

}
