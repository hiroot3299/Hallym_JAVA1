/*
 * 비만도를 계산해서 비만 여부를 판단하는 프로그램
 */
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double height = 0;	//	키 변수
		double weight = 0;	//	몸무게 변수
		double stWeight = 0;	//	평균 몸무게
		double bmi = 0;	//	비만도
		
		System.out.print("키를 입력하세요 : ");
		height = s.nextDouble();
		
		System.out.print("몸무게를 입력하세요 : ");
		weight = s.nextDouble();
		
		stWeight = (height - 100)*0.9;
		bmi = (weight - stWeight) / stWeight*100;
		
		if(bmi < 20) {
			System.out.println("비만도는 정상입니다.");
		}else if(bmi <= 30) {
			System.out.println("비만도는 경도비만입니다.");
		}else if(bmi <=50)	{
			System.out.println("비만도는 중증도비만입니다.");
		}else	{
			System.out.println("비만도는 고도비만입니다.");
		}
		
		s.close();
	}

}
