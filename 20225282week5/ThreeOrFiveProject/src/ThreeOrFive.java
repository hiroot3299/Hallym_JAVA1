/*
 * 1~50의 숫자를 출력하지만 3또는 5의 배수는 *로 출력하는 프로그램.
 */
public class ThreeOrFive {

	public static void main(String[] args) {
		int i = 1;	//	숫자 출력을 위한 카운트 변수
		
		while( i <= 50 )	{	//	i가 50 이하라면 계속 반복
			if( i % 3 == 0 || i % 5 == 0 ) {
				//i를 3 또는 5로 나눈 나머지가 0이라면 계속 반복
				System.out.print("* ");	// 별찍기
			}
			System.out.print( i + " " );	
			i++;	//	i 증가
		}

	}

}
