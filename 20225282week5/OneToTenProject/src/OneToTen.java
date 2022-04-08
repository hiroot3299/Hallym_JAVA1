/*
 * while문을 사용해 1부터 10까지의 숫자를 출력하는 프로그램
 */
public class OneToTen {

	public static void main(String[] args) {
		
//		int printValue = 1;
		int i = 1;	//숫자를 출력하기 위한 카운트 변수
		
		while( i <= 10 ) {	//i가 10보다 작거나 같으면 계속 반복
			//	소괄호 안의 조건이 TRUE인 동안에는 계속 반복한다.
			//	언젠가는 종료될 수 있도록 조건값을 변화시켜야한다.
			
//			System.out.print((printValue)+"\t");
//			printValue++
			
			System.out.print( (i++) + " " );
			//i를 출력후 TAP키로 띄우고 ++ 연산자를 통해 i사용 후 1 증가.
			
		}

	}

}
