/*
 * �̹� �б� ������� ������ �Է��ϸ� �̹� �б� ��� ������ �������ִ� ���α׷�.
 */

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int com;
		int cProgram;
		int eng;
		int math;
		int total;
		double avg;
		
		System.out.print("��ǻ�� ���� ���� : ");
		com = s.nextInt();
		
		System.out.print("C��� ���� : ");
		cProgram = s.nextInt();
		
		System.out.print("���� ���� : ");
		eng = s.nextInt();
		
		System.out.print("���� ���� : ");
		math = s.nextInt();
		
		total = com + cProgram + eng + math;
		avg = (double)total / (double)4;
		
		System.out.println("��� ������ : "+avg);
		
	}

}
