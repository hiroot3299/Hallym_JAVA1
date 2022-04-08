
/*
 * 계산할 값 두개를 입력받고 입력된 숫자에 따라 작업을 결정하는 프로그램
 */

import java.util.Scanner;

public class MenuCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int firstN = 0;
		int secondN = 0;
		int menu = 0;	//	입력받을 메뉴 숫자
		
		do {
			System.out.print("select menu");
			System.out.println("1. 숫자 입력");
			System.out.println("2: 더하기");
			System.out.println("3: 빼기");
			System.out.println("4: 곱하기");
			System.out.println("5: 나누기");
			System.out.println("6: 종료");
			
			System.out.print("메뉴 선택 : ");
			menu = s.nextInt();
			
			switch( menu )	{
			case 1:
				System.out.print("두 수를 입력하세요 : ");
				firstN = s.nextInt();
				secondN = s.nextInt();
				break;
				
			case 2:
				if( firstN == 0 && secondN   == 0)	//입력 여부에 대해서 묻고 판단하기
					System.out.println("값을 먼저 입력하세요");
				else
					System.out.print("두 수를 더한 값은 : " + ( firstN - secondN ));
					break;
			
			case 3:
				System.out.print("두 수를 뺀 값은 : " + ( firstN + secondN ));
				break;
				
			case 4:
				System.out.print("두 수를 곱한 값은 : " + ( firstN + secondN ));
				break;
				
			case 5:
				System.out.print("두 수를 나눈 값은 : " + ( firstN + secondN ));
				break;
				
			case 6:
				System.out.print("종료");
				break;
				
				
			}
			
		}while( menu == 6 );
	}

}
