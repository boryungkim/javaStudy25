package ch04.singleton;

public class Singleton {

	private static final Singleton instance = new Singleton();
	
	private Singleton() {
		
	} // 생성자 private 으로 제한
	
				//반환타입     메서드 이름(보통 getInstance로 통일)
	public static Singleton getInstance() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("안녕하세요 저는 싱글톤입니다");
	}
}
