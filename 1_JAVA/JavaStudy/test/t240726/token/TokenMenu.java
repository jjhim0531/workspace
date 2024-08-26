package t240726.token;

import java.util.Scanner;

public class TokenMenu {
	// 필드일까요 아닐까요
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	// 메소드
	public void mainMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			tokenMenu();
			break;
		case 2 :
			inputMenu();
			break;
		case 3 :
			System.out.println("프로그램을 종료합니다.");
			return;
		default :
			System.err.println("잘못된 입력입니다. 다시 입력해주세요.\n");
			mainMenu();
		}
	}
	
	public void tokenMenu() {
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환한 것을 출력
		String str = "J a v a P r o g r a m";
		
		System.out.println("\n===== 지정 문자열 =====");
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 개수 : " + tc.afterToken(str).length());
		
		System.out.println("모두 대문자로 변환 : " + tc.afterToken(str).toUpperCase() + "\n");
		
		mainMenu();
	}
	
	public void inputMenu() {
		// 1. tc에 firstCap()으로 입력 받은 문자열을 넘기고 반환값 출력
		// 2. tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨 반환값 출력
		System.out.println("\n===== 입력 문자열 =====");
		System.out.print("문자열을 입력하세요: ");
		String input = sc.next();
		sc.nextLine();
		
		System.out.println("첫 글자 대문자 : " + tc.firstCap(input));
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char one = sc.next().charAt(0);
		sc.nextLine();
		System.out.println(one + " 문자가 들어간 개수 : " + tc.findChar(input, one) + "\n");
		
		mainMenu();
	}
}
