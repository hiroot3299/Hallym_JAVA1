import java.util.Scanner;

public class KeyboardInput {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int intValue;
		
		System.out.println("������ �Է��ϼ��� : ");
		intValue = scan.nextInt();
		//nextLine
		
		System.out.println("�Է¹��� ���� : " + intValue);
		
		scan.close();
		//�� ���� �ݾ��ֱ�
		
	}

}
