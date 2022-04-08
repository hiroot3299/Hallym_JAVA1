/*
 * 1부터 10까지 for문을 이용해 출력하는 프로그램
 */
public class ForExample1 {

	public static void main(String[] args) {
		
		//int i = 0; 제어 변수가 아니면 밖에서 정의, 제어 변수라면 그때그떄 해도된다.
		//for문 안에있는 경우 반복 후 사라짐
		
		for( int i = 1 ; i <= 10 ; i++ ) {	//	i를 1에서 10까지 1씩 증가하게하고 매번 출력한다.	//	10회 반복 루프
			
			System.out.print( i + "\t" );	//	i를 출력하고 탭키를 입력해 간격을 맞춘다.	//	1부터 10까지 출력
			
		}
		
//		int i = 1;
//		while( true ) {
//			if( i > 10 ) {	i가 10보다 커지면 반복문 탈출
//				break;
//			}
//			System.out.print( i + "\t" );
//			i++;
//		}

	}

}
