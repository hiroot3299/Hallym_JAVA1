/*
 * 2차 방정식 계산 프로그램
 * 사용자로 부터 2차 방정식의 a,b,c를 입력받아 판별식의 값을 구하고
 * x값을 구하는 프로그램.
 */
import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;	//	2차 방정식의 2차 계수
		int b = 0;	//	2차 방정식의 1차 계수
		int c = 0;	//	2차 방정식의 상수
		int D = 0;	//	근의 공식 판별식
		
		System.out.println("2차 방정식 ax^2 + bx + c = 0 의 a ,b ,c 각각을 입력하세요");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		D = (b*b) - (4*a*c);
		
		if(D > 0) {
			System.out.println("x1 = " + ( (-b+Math.sqrt(D)) / 2*a) );
			System.out.println("x2 = " + ( (-b-Math.sqrt(D)) / 2*a) );
		}else if(D == 0) {
			System.out.println("x1 = " + (-b / 2*a));
			System.out.println("x1 = " + (-b / 2*a));
		}else {
			System.out.println("x1 = " + ( (-b+Math.sqrt(D)) / 2*a) + "i");
			System.out.println("x1 = " + ( (-b+Math.sqrt(D)) / 2*a) + "i");
		}
	}

}
