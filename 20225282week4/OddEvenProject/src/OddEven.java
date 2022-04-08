/*
 * 입력받은 정수가 홀수인지 짝수인지 구분하는 프로그램
 */
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputNumber = 0;	//	입력받은 수
		
		System.out.print("홀수와 짝수를 구분할 값을 입력하세요 : ");
		inputNumber = s.nextInt();
		
		if(inputNumber%2 == 0)	{
			System.out.printf("입력받은 정수 %d 은(는) 짝수입니다.",inputNumber);
		}else	{
			System.out.printf("입력받은 정수 %d 은(는) 홀수입니다.",inputNumber);
		}
		
		s.close();

	}

}
