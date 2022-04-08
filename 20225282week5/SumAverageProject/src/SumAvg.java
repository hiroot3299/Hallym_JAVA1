/*
 * 입력된 값들의 평균을 구하는 프로그램
 */
import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int inputNumber = 0;
		int sum = 0;	//	누적변수는 초기값을 주는게 좋다.
		double avg = 0.0;	//	누적 평균
		int count = 1;	//	평균을 계산하기 위한 입력 카운트
		
		do	{
			System.out.print("정수 입력 : ");
			inputNumber = s.nextInt();	//	정수 받기
			
			sum += inputNumber;
			if( inputNumber == 0 )	{	//	0이면 반복문 탈출
				break;
			}
			avg = (double)sum / count++;	//	평균은 소수점을 포함하는 나누기 연산이기 때문에 실수 연산으로 해야함.
			System.out.println( "-> 합 : " + "평균" + avg);
			
		}while(true);
		

	}

}
