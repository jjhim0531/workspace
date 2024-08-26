package t240729.MVC;

public class Music {
	// 매개변수
	private String title;
	private String singer;
	
	// 기본 생성자
	public Music() {}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	// 메소드
	public String toString() {
		return null;
	}
	
	public int hashConde() {
		return this.hashCode();
	}
	
	public boolean equals(Object obj) {
		return this.equals(obj);
	}
	
	// getter
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSinger() {
		return this.singer;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
}
