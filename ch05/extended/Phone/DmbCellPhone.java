package ch05.extended.Phone;

public class DmbCellPhone extends CellPhone{
	int channel;

	public DmbCellPhone (String model, String color, int channel){
		super(model, color); //부모필드 초기화
		this.channel = channel; // 추가된 필드
	}
	
	// 메서드 -> 자식 클래스에 추가된 메서드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 dmb 방송수신을 시작합니다");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을" + channel + "번으로 변경합니다");
	}
	void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 중지합니다");
	}
	
}
