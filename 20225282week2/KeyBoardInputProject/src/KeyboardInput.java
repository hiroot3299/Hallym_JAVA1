import java.util.Scanner;

public class KeyboardInput {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int intValue;
		
		System.out.println("정수를 입력하세요 : ");
		intValue = scan.nextInt();
		//nextLine
		
		System.out.println("입력받은 값은 : " + intValue);
		
		scan.close();
		//다 쓰면 닫아주기
		
	}

}
