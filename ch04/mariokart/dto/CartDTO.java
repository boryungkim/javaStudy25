package ch04.mariokart.dto;

public class CartDTO {
	public String name;
	public double speed;
	public double handling;
	public double acceleration;
	// 필드
	public CartDTO(String name, double speed, double handling, double acceleration) {
		this.name = name;
		this.speed = speed;
		this.handling = handling;
		this.acceleration = acceleration;
	} // cartDTO 메서드

}//class
