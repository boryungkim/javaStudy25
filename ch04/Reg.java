package ch04;

public class Reg {

	//필드 6개
	public String id;
	public String pw;
	public String name;
	public int age;
	public String email;
	public String phone;
	
	
	//기본 생성자
	
	public Reg() {
		id = "o";
		pw = "o";
		name = "kbr";
		age = 27;
		email = "o";
		phone = "o";
		
	}
	
	//사용자 지정 생성자 (id, pw만 받음)
	public Reg(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	//사용자 지정 생성자 (id, pw, name, age만 받음)
	public Reg(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	
	//정보 출력용 메서드
	public void printInfo() {
		System.out.println(this.id);
		System.out.println(this.pw);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.email);
		System.out.println(this.phone);
	}
	
}
