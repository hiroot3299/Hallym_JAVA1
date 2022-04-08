/*
 * 두개의 수를 입력받아 관계연산자를 통해 비교하고 결론을 출력하는 프로그램
 */

import java.util.Scanner;


public class LogicalTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean tf;
		
		int first;
		int second;
		
		System.out.print("첫번째 수 입력 : ");
		first = s.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		second = s.nextInt();
		
		tf = first < second;
		
		System.out.println(first + " < " + second + " 은 " + tf);
		System.out.println(first + " > " + second + " 은 " + (first>second));
		System.out.println(first + " <= " + second + " 은 " + (first<=second));
		System.out.println(first + " >= " + second + " 은 " + (first>=second));
		System.out.println(first + " == " + second + " 은 " + (first==second));
		System.out.println(first + " != " + second + " 은 " + (first!=second));
		System.out.println("!(" + first + " != " + second + ")" + " 은 " + !(first!=second));
	}

}
