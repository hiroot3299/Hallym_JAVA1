/*
 * 원의 부피와 면적을 계산하는 프로그램
 */
import java.util.Scanner;

public class CirCleCalc {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int radius = 0;
		//float pi = 3.14F;
		double pi = 3.14;
		double volume = 0.0;
		double surface = 0.0;
		
		System.out.print("정수형 반지름을 입력하세요 : ");
		radius = s.nextInt();
		
		volume = 4.0/3.0*pi*radius*radius*radius;
		surface = 4*(pi)*(radius*radius);
		
		System.out.println("반지름이 " + radius + "인 공의 부피는 " + volume);
		System.out.println("반지름이 " + radius + "인 공의 표면적은 " + surface);

	}

}
