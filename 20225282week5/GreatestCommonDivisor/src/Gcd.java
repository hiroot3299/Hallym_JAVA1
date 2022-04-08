/*
 * 유클리드 호제법을 활용해 최대공약수를 구하는 프로그램
 */
import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int firstN = 0;
		int secondN = 0;
		int x;	//	두 입력값 중 큰수
		int y;	// 	두 입력값 중 작은 수
		int r;	//	두 수의 나눈 나머지 값
		
		System.out.print("최대 공약수를 구할 두 정수를 입력하세요 : ");
		firstN = s.nextInt();
		secondN = s.nextInt();
		x = firstN > secondN ? firstN : secondN;	//	큰수 정하는 삼항연산자
		y = firstN < secondN ? firstN : secondN;	//	작은수 정하는 삼항연산자
		
		while( y != 0 )	{	
			r = x % y;	//나머지 구하기
			x = y;
			y = r;
		}
		System.out.println("최대공약수는 : " + x);
		

	}

}
