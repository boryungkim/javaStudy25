package ch05.extended.Phone;

public class CellPhone {
	String model;
	String color;
	
	//생성자
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

 //메서드
	void powerOn() {
		System.out.println("전원을 킵니다");
	}
	void poweroff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangup() {
		System.out.println("전화를 끊습니다");
	}
}
