/*
 * 이번 학기 과목들의 점수를 입력하면 이번 학기 평균 점수를 도출해주는 프로그램.
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
		
		System.out.print("컴퓨터 개론 점수 : ");
		com = s.nextInt();
		
		System.out.print("C언어 점수 : ");
		cProgram = s.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = s.nextInt();
		
		System.out.print("수학 점수 : ");
		math = s.nextInt();
		
		total = com + cProgram + eng + math;
		avg = (double)total / (double)4;
		
		System.out.println("평균 점수는 : "+avg);
		
	}

}
