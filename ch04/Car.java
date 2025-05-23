package ch04;

import java.util.Scanner;

public class Car {

	// 필드
	public String company; // 제작회사 (현대, 기아, KGM 쉐보레, 아우디)
	public String model; // 아반테, 그렌져, 쏘나타
	public String color; // 빨강, 은색, 검정색, 흰색
	int maxSpeed; // 최고속도
	public String oilType; // 경유, 휘발유

	// 상태값(변동가능)
	public int speed;
	public int rpm;
	public int oil;
	public boolean isStarted = false;

	// 기본생성자
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 15;
	}

	// 사용자지정생성자
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}

	// 메서드 (시동)
	public void start() {
		this.isStarted = true;
		System.out.println(this.model + "가(이) 주행을 시작합니다");
		System.out.println("현재속도 : " + this.speed);
		System.out.println("현재 rpm : " + this.rpm);
		System.out.println("현재 주유량 : " + this.oil);
	}

	// 메서드 (운전)
	public void drive(Scanner input) {

		boolean driving = true;
		final int MAX_SPEED = 300;
		final int MIN_SPEED = 0;

		boolean warned = false;
		int oilIgnoreCount = 0;
		
		while (driving) {
			if (oil <= 0) {
				System.out.println("기름이 떨어졌습니다");
				System.out.println("주행을 중지합니다");
				break;
			} // if 오일 다 떨어졌을 때

			if (oil <= 10 && !warned) {// 오일량 10 이하면서 아직 경고안 뜬 경우
				System.out.println("오일량이 10 남았습니다");
				System.out.println("주유가 필요합니다");
				System.out.println("주유하시겠습니까?");
				System.out.println("1. YES");
				System.out.println("2. NO");
				System.out.println(">>>");

				String oilWarning = input.next();

				switch (oilWarning) {
				case "1":
					refillOil(input);
					break;

				case "2":
			
					System.out.println("주행을 계속합니다");
					System.out.println("경고 : 주유를 권장합니다");
					oilIgnoreCount++;
					break;

				default:
					System.out.println("다시 입력해주세요");
					break;
				} //switch
				
				warned = true; //경고 뜨는 게 한번만

			}// if 오일량이 10 이하일 때
			if(oilIgnoreCount >=3) {
				System.out.println("주유 경고를 무시하여 차량이 멈춥니다");
				break;
			} // 경고 3번 무시하면 자동으로 시동꺼짐
			

			System.out.println("=====================");
			System.out.println("차량 주행을 시작합니다");
			System.out.println("번호를 선택하세요");
			System.out.println("1. 가속");
			System.out.println("2. 감속");
			System.out.println("3. 브레이크");
			System.out.println("4. 그만하기");
			System.out.println(">>>");

			String select = input.next();

			switch (select) {
			case "1":
				if (speed + 50 > MAX_SPEED) {
					System.out.println("최고속도" + MAX_SPEED + "를 초과할 수 없습니다");
				} else {
					speed = speed + 50;
					rpm = rpm + 10;
					oil = oil - 10;
					System.out.println("현재속도 : " + speed);
					System.out.println("오일 : " + oil);
				}
				break;

			case "2":
				if (speed - 50 < MIN_SPEED) {
					System.out.println("이미 최저속도입니다");
				} else {
					speed = speed - 50;
					rpm = rpm - 10;
					oil = oil - 5;
					System.out.println("현재속도 : " + speed);
					System.out.println("오일 : " + oil);
				}
				break;

			case "3":
				speed = 0;
				System.out.println("브레이크가 걸렸습니다");
				System.out.println("현재속도 : " + speed);
				System.out.println("오일 : " + oil);
				break;

			case "4":
				System.out.println("주행을 종료합니다");
				System.out.println("이용해주셔서 감사합니다");
				driving = false;
				break;

			default:
				System.out.println("다시 선택해주세요");
				break;

			} // switch

		} // while (driving)

	} // drive 메서드

	public void refillOil(Scanner input) {

		final int oilMax = 300;

		System.out.println("주유할 수 있는 최대양은 " + oilMax + "입니다");
		System.out.println("현재 남은 오일량: " + oil);
		System.out.println("주유하실 양을 입력해주세요");
		int refill = input.nextInt();

		if (oil + refill > oilMax) {
			int actualRefill = oilMax - oil; // 현재 넣을 수 있는 오일량 (최대 - 현재)
			oil = oilMax; // 현재 오일량 오일 max 만큼 덮어씌움
			System.out.println("주유할 수 있는 오일량 최대치" + oilMax + "를 만족했습니다");
			System.out.println(actualRefill + "만큼 주유되었습니다");
		} else {
			oil = oil + refill;
			System.out.println("성공적으로 주유하였습니다");
		} // if
		System.out.println("현재 오일량 : " + oil);

	}// refillOil 메서드

}
