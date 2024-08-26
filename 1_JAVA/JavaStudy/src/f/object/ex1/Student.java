package f.object.ex1;
/*
	* 클래스의 구조
	접근제한타 + class + 클래스명{
	//필드영역(사용할 데이터를 선언하는 영역
	
	//생성자영역(데이터를 초기화해주기 위한 특수목적의 메소드를 정의하는 영역
	
	//메소드영역(클래스의 기능을 정의하는 영역)
	}
	
 */

public class Student {
	// 필드영역(사용할 데이터를 선언하는 영역
	String name;
	int age;
	double height;

	// 메소드영역(클래스의 기능을 정의하는 영역)
	public void print() {
		System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
	}

}


