package t240722.charCheck;

import java.util.Scanner;

public class CharacterMenu {
	public void Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		CharacterController cc = new CharacterController();
		
		try {
			int length = cc.countAlpahs(str);
			System.out.println("문자 개수 : " + length);
		}
		catch(CharCheckException e) {
			System.out.println("문자열에 공백이 포함되어있습니다.");
		}
		finally {
			sc.close();
			System.out.println("잘 종료되었습니다.");
		}
	}
}
