/*
 * 키보드로 부터 메뉴를 입력받아 처리하는 메뉴기반 프로그램
 */

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyInput = new Scanner(System.in);
		int menu;
		
		System.out.println("*******메뉴*******");
		System.out.println("[1] 입력 : ");
		System.out.println("[2] 출력 : ");
		System.out.println("[3] 초기화 : ");
		System.out.println("[4] 종료 : ");
		System.out.println("메뉴를 선택하세요");
		menu = keyInput.nextInt();
		
		System.out.println(menu + "번 메뉴를 선택하셨습니다.");
		
		
	}

}
