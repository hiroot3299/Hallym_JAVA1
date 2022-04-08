/*
 * 몫과 나머지 연산을 통해서 각 자리의 숫자를 뽑아내는 프로그램.
 */

import java.util.Scanner;


public class DivideTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int input;
		
		System.out.print("정수를 입력하세요 : ");
		input = s.nextInt();
		
		System.out.println("천의 자리 : " + input/1000);
		input = input%1000;
		
		System.out.println("백의 자리 : " + input/100);
		input = input%100;
		
		System.out.println("십의 자리 : " + input/10);
		input = input%10;
		
		System.out.println("일의 자리 : " + input);
		
	}

}
