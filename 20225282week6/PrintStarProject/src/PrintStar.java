/*
 * 도형의 높이와 너비를 입력하고 그 값에 따라서
 * 여러 도형을 출력하는 프로그램.
 */
import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int height = 0;	//	도형의 높이
		int width = 0; //	도형의 너비
		
		System.out.print("도형의 높이 : ");
		height = s.nextInt();
		System.out.print("도형의 너피 : ");
		width = s.nextInt();
		
		System.out.println("사각형");
		for( int i = 0 ; i < height ; i++ ) {	//	반복되어서 찍힌 별들을 몇번 반복해서 출력할 건지.
			
			for( int j = 0 ; j < width ; j++ ) {	//	별을 몇번 반복해서 찍을지.
				
				System.out.print("*");
				
			}
			
			System.out.println();	//	별 찍은 후 줄바꿈
			
		}
		
		System.out.println("직각삼각형");
		for( int i = 0 ; i < height ; i++ ) {	//	i=	0	1	2	3
			
			for( int j = 0 ; j < i + 1 ; j++ ) {//	j=	1	2	3	4	별 찍는 개수
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("이등변삼각형");					//height ex) 5
		for( int i = 0 ; i < height ; i++ ) {				//	i=	0	1	2	3
			
			for( int j = 0 ; j < height - i - 1 ; j++ ) {	//	j=	4	3	2	1	공백 개수
				
				System.out.print(" ");
				
			}
			
			for( int j = 0 ; j < i * 2 + 1 ; j++ ) {		//	j=	1	3	5	7	별 개수
				
				System.out.print("*");
			
			}
			
			System.out.println();
			
		}
		
		System.out.println("역삼각형");
		for( int i = 0 ; i < height ; i++ ) {			//i=	0	1	2	3	4	줄 개수
			
			for( int j = 0 ; j < i ; j++ ) {			//j=	0	1	2	3	4	공백 개수
				
				System.out.print(" ");
				
			}
			
			for( int j = 0 ; j < (height - i)*2 - 1 ; j++) {
														//j=	9	7	5	3	1	별 개수
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}
