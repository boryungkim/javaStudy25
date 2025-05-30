package ch05.lineage.dto;

public class ElfDTO extends HumanDTO{

	//추가하는 필드
	private String bow;
	private String dress;
	private String arrow;
	
	//생성자
	
	
	//메서드
	public String getBow() {
		return bow;
	}
	public void setBow(String bow) {
		this.bow = bow;
	}
	public String getDress() {
		return dress;
	}
	public void setDress(String dress) {
		this.dress = dress;
	}
	public String getArrow() {
		return arrow;
	}
	public void setArrow(String arrow) {
		this.arrow = arrow;
	}
	
	
}
