/*
 * 삼항 연산자를 활용해 큰 수를 찾는 프로그램
 */

import java.util.Scanner;

public class MaxValueCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int first;
		int second;
		//int flag;

		System.out.print("첫번째 정수 입력 : ");
		first = s.nextInt();
		System.out.print("두번째 정수 입력 : ");
		second = s.nextInt();
		
		//flag = first > second ? first : second;
		//System.out.println("큰값은 : " + flag);
		System.out.println("큰값은 : " + (first>second?first:second));
		
	}

}
