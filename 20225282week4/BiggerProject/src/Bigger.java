/*
 * 사용자로 부터 두 정수를 입력받아 크기를 비교하는 프로그램
 */
import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first = 0;
		int second = 0;
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		first = s.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		second = s.nextInt();
		
		if(first > second) {
			System.out.println("첫 번째 정수 "+ first + " 이(가) 두 번째 정수 " + second + " 보다 큼");
		}else if(first < second)	{
			System.out.println("두 번째 정수 " + second + " 이(가) 첫 번째 정수 " + first + "보다 큼");
		}else {
			System.out.println("첫 번째 정수 "+ first + " 이(가) 두 번째 정수 " + second + " 와(과) 같음");
		}
		
		s.close();
	}

}
