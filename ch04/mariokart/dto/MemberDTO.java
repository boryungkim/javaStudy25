package ch04.mariokart.dto;

public class MemberDTO {
	public String id; // 아이디 (로그인용)
	public String pw; // 암호 (로그인용)
	public String nickName; // 닉네임 (게임용)
	
	
	public CharacterDTO selectedcharacter; // 계정별 캐릭터 객체
	public CartDTO selectedCart;
	public TireDTO selectedTire;
	public GliderDTO selectedGlider;
	public ItemDTO selectedItem;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String id, String pw, String nickName) {
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
	} // 생성자
}
