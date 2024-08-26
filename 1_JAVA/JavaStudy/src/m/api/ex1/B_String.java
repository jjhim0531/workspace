package m.api.ex1;

import java.util.StringTokenizer;

public class B_String {
	public void method01() {
		// 2. 문자열을 리터럴값으로 생성
		String str3 = "hello";
		String str4 = "hello2";
		
		// 리터럴 제시 시 상수풀영역에 들어감
		// String Pool 특징 : 동일한 문자열을 가질 수 없다.
		
		// 변경하는 순간 기존의 문자열 자리에서 변경되는 게 아닌
		// 새로운 곳을 참조한도록 변경 됨(새로운 주소갑 숩여받음 == 주소값 변경)
		
		// 6. 문자열.toUperCase() : String => 문자열을 전부 대문자로 변경해서 반환
		// 	  문자열.toLowerCase() : String => 문자열을 전부 소문자로 변경해서 반환
		
		// 7. 문자열.trim() : String
		//	  문자열의 앞 뒤 공백을 제거시킨 새 문자열을 리턴
		
		// 8. 문자열.tocharArray() : char[]
		
		// 9. String -> valueOf
		
		// 10. str.substring() : 문자열의 지정된 인덱스 값을 가지고 온다.
		// ex) str.subString(0) : 0번째 인덱스부터의 값을 전부 가지고 옴
		//	   str.subString(1, 3) : 1번째 인덱스부터 3번째 인덱스까지의 값을 가지고 옴
		
		
		// ------------------------------------------------------
		
		String str5 = "Java,Oracle,Tocat,MySQL";
		
		// 특정 문자로 구분하여 배열로 바꾸는 방법
		// 문자열.split(구분자) : String[]
		
		String[] splitArr = str5.split(",");
		for(int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		
		// 분리된 문자열 배열을 다시 String으로 변경하는 방법
		// String.join(구분자, 배열);
		
		// 방법2. 분리된 문자열들을 각각 토큰으로써 관리 가능 
		// java.util.StringTokenizer 클래스 이용
		// StringTokenizer stn = new StringTokenizer(배열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str5, ",");
		System.out.println(stn.countTokens());	// 저장된 토큰의 개수 출력
		
		// 모든 토큰을 조회하는 방법1
		// System.out.println(stn.nextToken()); 
		// 토큰 출력 (순차), 다음 토큰이 없을 때 가져오려고 하면 예외 발생
		// 한 번 nextToken()으로 토큰을 꺼내고 나면 토큰은 사라진다.
		System.out.println("\n===== stn.nextToken() =====");
		int count = stn.countTokens();
		for(int i = 0; i < count; i++) {
			System.out.println(stn.nextToken());
		}
		
		// 조회 방법2
		// hasMoreElements -> 가져올 토큰이 남아있는지 확인해주는 메소드. 남아있다면 true, 없다면 false 반환
		System.out.println("\n===== hasMoreElements =====");
		StringTokenizer stn2 = new StringTokenizer(str5, ",");
		while(stn2.hasMoreElements()) {
			System.out.println(stn2.nextToken());
		}
	}
}
