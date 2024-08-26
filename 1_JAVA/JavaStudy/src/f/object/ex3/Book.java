package f.object.ex3;

public class Book {
	/*
	 	접근제한자 : 해당구조에 접근할 수 있는 범위를 제한한다.
	 	public> protected > default > private
	 	
	 	클래스에 사용 가능한 접근 제한자 2가지
	 	default, pulblic
	 	
	 	필드와 메소드에 사용할 수 있는 접근제한자 4가지
	 	public : 어디서든(같은패키지, 다른패키지 모두) 접근 가능
	 	protected : 같은 패키지 + 다른패키지일 경우 상속관계에서만 접근가능
	 	default : 같은 패키지일 때만 접근 가능
	 	private : 오직 해당 클래스에서만 접근 가능
	 */

		//필드
		private String title;//제목
		//private선언을 했기 떄문에 Run에서 직접적으로 값을 넣어 변경 불가능
		private String genre;//장르
		private String author;//저자
		private int maxPage;//페이지수

		//메소드
		//객체를 생성할 때 데이터를 초기화해주는 작업이 필수이기에 
		//초기화를 위한 메소드를 만들어준다.
//		public void init(String title, String genre, String author, int maxPage){
//			this.title = title;//내가 가진(this) title에 넘겨받은 title을 넣는다.
//			this.genre = genre;//내가 가진(this) 에 넘겨받은 
//			this.author = author;//내가 가진(this) 에 넘겨받은 
//			this.maxPage = maxPage;//내가 가진(this) 에 넘겨받은 
//		}
//		
		/*
		 생성자
		 - 클래스의 이름과 동일한 메소드로 반환형이 없다.
		 - 필드 데이터의 초기화를 위한 특수목적의 메소드이다.
		 - 매개변수가 하나도 없는 생성자를 우리는 기본생성자라고 한다.
		 - 생성자를 개발자가 직접 만들지 않는다면 컴파일러는 기본생성자를 만들어준다.
		 - 개발자가 직접 생성자를 작성하면 기본생성자를 만들어주지 않는다.
		 - 메소드의 배개변수의 갯수 또는 타입에 따라서 메소드를 구분하는 메소드 오버로딩은 생정자에도 적용이 된다.
		 
		 */
		
		public Book() {
		
		}
		public Book(String title, String genre, String author, int maxPage){
			
			this.title = title;//내가 가진(this) title에 넘겨받은 title을 넣는다.
			this.genre = genre;//내가 가진(this) 에 넘겨받은 
			this.author = author;//내가 가진(this) 에 넘겨받은 
			this.maxPage = maxPage;//내가 가진(this) 에 넘겨받은 
			
		}
		
		
		//메소드(getter/setter)
		public String toString(){
			
			
			/*
			 this -> 인스턴스 객체(메모리를 사용중인 객체) 자기 자신을 의미
			 1. 자기 자신의 메모리를 가르킨다.
			 2. 생성자에서 다른 생성자를 호출할 수 있다.
			 3. 자기 자신의 주소를 반환할 수 있다.
			 */
			return "제목 : " + this.title +"\n장르 :" + this.genre +"\n저자 : " + 
			 this.author + "\n총 페이지 : " + this.maxPage;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getMaxPage() {
			return maxPage;
		}
		public void setMaxPage(int maxPage) {
			this.maxPage = maxPage;
		}
		
			
	

}
