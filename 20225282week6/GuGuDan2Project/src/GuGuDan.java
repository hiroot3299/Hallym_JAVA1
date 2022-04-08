/*
 * 구구단 2~9단을 세로로 정렬해 출력하는 프로그램.
 */

public class GuGuDan {

	public static void main(String[] args) {
		
		for( int i = 1 ; i <= 9 ; i++ ) {	//	뒤에 곱하는 수 증가
		
			for( int j = 2 ; j <= 9 ; j++ ) {	//	2부터 9까지 단 수 증가
				
				System.out.print( j + " * " + i + " = " + ( j * i ) + "\t" );
				
			}
			
			System.out.println();
			
		}
			
	}

}
