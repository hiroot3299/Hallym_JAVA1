/*
 * 출력 최댓값을 입력하고 범위 내의 수들 중 소수만을 출력하는 프로그램.
 */
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0;	//	출력 최댓값 변수
		int value = 0;	//	나머지를 저장하기 위한 변수
		
		System.out.print("출력 최댓값 입력 : ");
		max = s.nextInt();
		
		System.out.print("소수:\t");
		
		for( int i = 2 ; i <= max ; i++ ) {	//	나누어서 판별할 숫자
			
			for( int j = 2 ; j <= i ; j++ ) {	//	나누기에 사용할 숫자
				
				value = i%j;	//	소수 판별을 위한 나머지 변수
				
				if(( value == 0 )) {	//	나누어 떨어졌다는 것은 나머지가 0이란 뜻

					if(j != i) {	//	나누어 떨어졌을 때 그게 자기 자신과 같은 수가 아니라면, ( 1로는 당연히 나누어 떨어지기 때문에 생략)
						
						break;	// 그냥 반복문 탈출
						
					}else {	// 나누어 떨어졌을 때 그 수가 자기 자신이라면
						
						System.out.print( i + "\t" );	//	소수임을 알리기 위한 출력문
						break;	// 반복문 탈출
						
					}
					
				}
				
			}
			
		}
		
	}

}
