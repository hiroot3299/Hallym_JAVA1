/*
 * 나이 성별 등에 대한 질문에 대한 답변을 입력된 정보들을 통해서 판단하여 결론을 출력하는 프로그램
 */
import java.util.Scanner;


public class TFTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		char married = 'n';
		int age = 20;
		char gender = 'm';
		int com = 90;
		int eng = 85;
		int math = 100;
		int total = com + eng + math;
		int average = (com+eng+math)/3;
		int score = 50;
		int count = 3;
		int year = 2022;
		int inputnum = s.nextInt();
		
		System.out.println("혼인여부 : " + (married == 'y'));
		System.out.println("나이가 19세 이상이고 남자인가? : "+(age>=19&&gender=='m'));
		System.out.println("컴퓨터, 영어, 수학 모두 90점 이상인가? : "+(com>=90&&eng>=90&&math>=90));
		System.out.println("총점이 200점 이상이거나 평균이 60점 이상인가? : "+ (total>=200||average>=60));
		System.out.println("점수가 60점 미만이거나 결석횟수가 4번 이상인가? : "+(score<60||count>=4));
		System.out.println("현재의 년도가 윤년인가? : " + ((year%4==0&&year%100==0)||year%400==0));
		System.out.println("입력된 숫자가 짝수인가? : "+ (inputnum%2==0));
		System.out.println("입력된 숫자가 3과 5의 공배수인가? : "+ (inputnum%3==0&&inputnum%5==0));
		
	}

}
