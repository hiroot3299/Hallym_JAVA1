/*
 * 1~10의 숫자 중 홀수만 출력하는 프로그램
 */
public class OneToTenOdd {

	public static void main(String[] args) {
		int i = 1;	//	숫자 출력을 위한 카운트 변수
		
		while( i <= 10 ) {	//i가 10보다 작거나 같으면 계속 반복
			if( i % 2 == 1 ) {
				System.out.print( ( i ) + " " );
				//i를 2로 나눈 나머지가 1일 때만 i값 출력
				//	= 홀수일 때만
			}
			i++;	//	i값 증가
		}

	}

}
