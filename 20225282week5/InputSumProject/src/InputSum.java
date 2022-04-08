/*
 * 값을 입력하고 그값을 계속 더해 누적된 수를 계속해서 출력하는 프로그램
 */
import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputNumber = 0;	//입력값을 저장할 변수.
		int sum = 0;	//	누적변수는 0으로 초기화하는게 좋다.
		
		while( sum <= 500 ) {	//	sum 이 500이 넘으면 반복 종료
			System.out.print("누적할 값을 입력하세요 : ");
			inputNumber = s.nextInt();	//	누적할 숫자 입력
			if( inputNumber == 0 ) {	//	입력 숫자가 0이면 반복 종료 후 최종 누적값 출력
				System.out.printf("현재까지의 누적 합은 %d 입니다.\n", sum);
				break;
			}
			sum = sum + inputNumber;	//	누적 계산식
			System.out.println("총 누적합은 " + sum + "입니다.");
		}
		
		
		
		
	}

}
