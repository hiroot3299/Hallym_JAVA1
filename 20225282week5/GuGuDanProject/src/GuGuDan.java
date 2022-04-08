/*
 * 1단부터 9단까지의 구구단을 출력하는 프로그램
 */
import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		int i = 1;	// 1부터 9까지의 반복하면서 곱할 값
		int dan = 0;	//	사용자로부터 입력받을 곱셈 값
		Scanner s = new Scanner(System.in);
		
		System.out.print("구구단 단을 입력하세요 : ");
		dan = s.nextInt();	// 단에 해당하는 정수 입력
		
		while( i < 10 )	{
			System.out.println(dan + " * " + i + " = " + ( dan * i ) );//	결과값 출력
			i++;
		}
		
		
	}

}
