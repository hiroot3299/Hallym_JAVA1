/*
 * 두 수를 입력받고 이를 입력받은 메뉴값에 따라서 결과를 출력하는 프로그램
 * switch 사용 예제
 */

import java.util.Scanner;

public class MenuSelect {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first = 0;
		int second = 0;
		int menu = 0;
		
		System.out.print("두 수를 입력하세요 : ");
		first = s.nextInt();
		second = s.nextInt();
		
		System.out.println("메뉴");
		System.out.println("1. 작은수");
		System.out.println("2. 큰 수");
		System.out.println("3. 합계");
		System.out.println("4. 평균");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택하세요 : ");
		menu = s.nextInt();
		
//		if( menu == 1)	{
//			
//		}else if(menu == 2) {
//		
//		}else if(menu == 3)	{
//			
//		}else if(menu == 4)	{
//			
//		}else {
//			
//		}
		
		switch(menu) {
		case 1:
			System.out.println("결과 : " + (first > second ? second : first));
			break;
		case 2:
			System.out.println("결과 : " + (first > second ? first : second));
			break;
		case 3:
			System.out.println("결과 : " + (first + second));
			break;
		case 4:
			System.out.println("결과 : " + (first + second) / 2.0);
			break;
		case 5:
			System.out.println("종료합니다.");
			break;
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
		s.close();
		
	}

}
