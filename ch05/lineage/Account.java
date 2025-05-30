package ch05.lineage;

public class Account {

	private String id;
	private String pw;
	private String nickName;
	private ElfDTO elfDTO;
	private KnightDTO knightDTO;
	
	//메서드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public ElfDTO getElfDTO() {
		return elfDTO;
	}
	public void setElfDTO(ElfDTO elfDTO) {
		this.elfDTO = elfDTO;
	}
	public KnightDTO getKnightDTO() {
		return knightDTO;
	}
	public void setKnightDTO(KnightDTO knightDTO) {
		this.knightDTO = knightDTO;
	}
	
	
}
