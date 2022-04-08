/*
 * 다항식 함수의 x 값을 입력받아 함수의 결과를 출력하는 프로그램
 */
import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0;	//	다항식 함수의 x 값
//		int result = 0;
		
		System.out.print("다항식 계산에 필요한 x 값 입력 : ");
		x = s.nextInt();
		
		if(x <= 0)	{
//			result = x*x*x-9*x+2;
			System.out.println("x^3 - 9x + 2 = " + (x*x*x-9*x+2));
		}else {
//			result = 7*x+2;
			System.out.println("7x + 2 = " + (7*x+2));
		}
		
	}

}
