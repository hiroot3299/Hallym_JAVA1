/*
 * 출력할 마지막 항을 입력하여 피보나치 수열을 출력하기 위한 프로그램. 
 */
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int end = 0;
		int first = 0;	//	피보나치 수열 첫번째는 0
		int second = 1;	//	피보나치 수열 두번째는 1
		int next;	// 다음 피보나치 수열값을 계산하기 위한 변수
		
		System.out.print("마지막 항 입력 : ");
		end = s.nextInt();
		
		System.out.print("피보나치 수열 : ");
		
		for( int i = 0 ; i < end ; i++ ) {
			
			if( i < 2 ) {	//	1, 2번째 항은 이미 정해져 있기 때문에 그대로 출력.
				
				System.out.print(i + " , ");
				
			}else {
				
				next = first + second;	//	앞 두항의 앞은 그 다음 항
								//	0	1	1	2	3
								//	f	s	n
				
				first = second;	//	0	1	1	2	3
				second = next;	//		f	s	n
				
				if(i!=end-1) {
					System.out.print( next + " , ");
				}else {
					System.out.print( next );	//	마지막 출력에는 , 출력하지 않게 함.
				}
				
			}
			
		}
		
	}
	
}
