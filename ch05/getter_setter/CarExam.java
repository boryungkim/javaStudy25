package ch05.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재속도 : " + myCar.getSpeed());

		myCar.setSpeed(250);
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		myCar.setStop(true);
	}

}
