/*
 * 사용자로 부터 단 수를 입력받아서 구구단을 출력하는 프로그램
 */
import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
		int inputV = s.nextInt();	//	정수
		
		for( int i = 1 ; i <= 9 ; i++ ) {	//	i가 9까지 변화하면서 출력
			System.out.println(inputV + " * " + i + " = " + (inputV*i));	//	A * B = C 의 형식으로 출력
		}
	}

}
