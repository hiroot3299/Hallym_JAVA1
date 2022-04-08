/*
 * 1 ~ 50까지의 숫자를 출력하되 3또는 5의 배수는 *로 출력하는 프로그램
 */
public class OneToFifty {

	public static void main(String[] args) {
		
		for( int i = 1 ; i <= 50 ; i++ ) {//	50번 반복
			if( i % 3 == 0 || i % 5 == 0 ) {	//	i를 3 또는 5로 나눈 나머지가 0이면 * 출력
				System.out.print( "*\t" );
			}else	{							//	아니라면 i 출력
				System.out.print( i + "\t" );
			}
			
		}

	}

}
