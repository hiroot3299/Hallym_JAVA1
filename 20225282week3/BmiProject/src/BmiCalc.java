/*
 * 비만도를 계산하는 프로그램
 */
import java.util.Scanner;


public class BmiCalc {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double height = 0.0;
		double weight = 0.0;
		double stweight = 0.0;
		double bmi = 0.0;
		
		System.out.println("비만도를 계산합니다.");
		System.out.print("키를 입력하세요 : ");
		height = s.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		weight = s.nextInt();
		
		stweight = (height-100)*0.9;
		bmi = (weight - stweight)/stweight*100;
		
		System.out.println("표준 몸무게는 " + stweight + "입니다");
		System.out.println("비만 지수는 " + bmi + "입니다.");
	
	}
}
