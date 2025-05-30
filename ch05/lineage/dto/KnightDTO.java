package ch05.lineage.dto;

public class KnightDTO extends HumanDTO{
	//추가하는 필드
	private String sword;
	private String armor;
	private String shield;
	//생성자
	
	
    //메서드
		
	public String getSword() {
		return sword;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public String getShield() {
		return shield;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	
}
