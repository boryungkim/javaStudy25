package ch05.getter_setter;

public class Car {

	private int speed;
	private boolean stop;
	private static final int MAX_SPEED = 200;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {// 입력값이 음수면 0으로 입력됨
			this.speed = 0;
			System.out.println("속도가 0으로 설정됩니다");
		}else if(speed > MAX_SPEED){
			this.speed = MAX_SPEED;
			System.out.println("경고 : 최대 속도는 " + MAX_SPEED + "입니다");
		}
		else {
			this.speed = speed;
			System.out.println("속도가" + this.speed + "로 설정되었습니다");
		} 
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	} // stop값이 true이면 스피드 0
}
