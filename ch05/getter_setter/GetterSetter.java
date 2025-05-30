package ch05.getter_setter;

public class GetterSetter {

	private String name; //private 필드 선언
	private int age;
	private boolean active;
	
	public String getName() {
		return name;
	}// getter 메서드
	
	public void setName(String name) {
		this.name = name;
		//setter 메서드
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}//클래스
