/*
 * ���� ���� � ���� ������ ���� �亯�� �Էµ� �������� ���ؼ� �Ǵ��Ͽ� ����� ����ϴ� ���α׷�
 */
import java.util.Scanner;


public class TFTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		char married = 'n';
		int age = 20;
		char gender = 'm';
		int com = 90;
		int eng = 85;
		int math = 100;
		int total = com + eng + math;
		int average = (com+eng+math)/3;
		int score = 50;
		int count = 3;
		int year = 2022;
		int inputnum = s.nextInt();
		
		System.out.println("ȥ�ο��� : " + (married == 'y'));
		System.out.println("���̰� 19�� �̻��̰� �����ΰ�? : "+(age>=19&&gender=='m'));
		System.out.println("��ǻ��, ����, ���� ��� 90�� �̻��ΰ�? : "+(com>=90&&eng>=90&&math>=90));
		System.out.println("������ 200�� �̻��̰ų� ����� 60�� �̻��ΰ�? : "+ (total>=200||average>=60));
		System.out.println("������ 60�� �̸��̰ų� �ἮȽ���� 4�� �̻��ΰ�? : "+(score<60||count>=4));
		System.out.println("������ �⵵�� �����ΰ�? : " + ((year%4==0&&year%100==0)||year%400==0));
		System.out.println("�Էµ� ���ڰ� ¦���ΰ�? : "+ (inputnum%2==0));
		System.out.println("�Էµ� ���ڰ� 3�� 5�� ������ΰ�? : "+ (inputnum%3==0&&inputnum%5==0));
		
	}

}
