/*
 * 입력된 숫자만큼 1차원 배열 모양으로 반복하는 프로그램
 */
import java.util.Scanner;
public class OneDimForm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("크기를 입력하세요 : ");
		int size = s.nextInt();
		
		for( int i = 0 ; i < size ; i++ ) {	//	입력된 크기만큼 반복 
			System.out.print("[" + i + "] ");	//	배열 형식으로 출력
		}

	}

}
