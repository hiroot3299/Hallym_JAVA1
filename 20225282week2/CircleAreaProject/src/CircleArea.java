import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int radius = 0;
		double area = 0.0;
		
		System.out.println("반지름을 입력하세요 : ");
		radius = scan.nextInt();
		
		area = radius * radius * 3.14;
		
		System.out.printf("반지름 %d인 원의 면적은 %9.6f입니다." , radius , area );
		
		
	}

}
