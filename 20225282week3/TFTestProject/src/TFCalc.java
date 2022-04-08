/*
 * 입력된 값들을 관계연산자를 활용하여 비교하고 그에대한 결론을 출력하는 프로그램.
 */

public class TFCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		int j = 3;
		int k = 5;
		
		System.out.println("i 가 " + i + "이고 j가 " + j + "이고 k가 "+ k +"일떄");
		System.out.println("(i <= k) && (i >= j) 조건은 " + ((i<=k)&&(i>=j)));
		System.out.println("(i < k) || (k == j) 조건은 " + ((i < k)||(k == j)));
		System.out.println("(i != k) && (( i + j ) < k) 조건은 " + ((i != k) && (( i + j ) < k)));
		
		
	}

}
