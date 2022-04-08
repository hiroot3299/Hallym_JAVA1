/*
 * 박스의 길이 높이 너비를 입력받아 키보드로부터 입력받아
 * 부피를 계산하고 출력하는 프로그램
 */
import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int length = 0;
		int width = 0;
		int height = 0;
		int volume = 0;
		
		System.out.println("상자의 길이를 입력해주세요");
		length = scan.nextInt();
		System.out.println("상자의 너비를 입력해주세요");
		width = scan.nextInt();
		System.out.println("상자의 높이를 입력해주세요");
		height = scan.nextInt();
		
		volume = length * width * height;
		
		System.out.println("상자의 부피는 " + volume + "입니다.");
	}

}
