/*
 * 다항식 계산프로그램
 * x값 입력받아 계산함.
 */

import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = 0; //다항식에 사용한 x값 변수
		int result = 0;
		
		System.out.println("x값을 입력하세요 : ");
		x = s.nextInt();
		
		result = 3 * ( x * x * x ) + 7 * ( x * x ) + 9;
		
		System.out.println("다항식 결과값은 : " + result);
	}

}
