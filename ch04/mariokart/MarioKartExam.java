package ch04.mariokart;

import java.util.Scanner;

import ch04.mariokart.dto.CartDTO;
import ch04.mariokart.dto.CharacterDTO;
import ch04.mariokart.dto.GliderDTO;
import ch04.mariokart.dto.ItemDTO;
import ch04.mariokart.dto.MemberDTO;
import ch04.mariokart.dto.TireDTO;
import ch04.mariokart.service.CartService;
import ch04.mariokart.service.GameService;
import ch04.mariokart.service.MemberService;

public class MarioKartExam {

	// 필드
	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[10];
	// 10명 회원
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15];
	// 캐릭터 15개
	public static CartDTO[] cartDTOs = new CartDTO[8];
	// 카트 자동차 8개 배열
	public static GliderDTO[] gliderDTOs = new GliderDTO[10];
	// 글라이더 배열
	public static TireDTO[] tireDTOs = new TireDTO[10];
	// 타이어 배열
	public static ItemDTO[] itemDTOs = new ItemDTO[10];

	public static MemberDTO loginState;

	// static 초기화
	static {
		CharacterDTO characterDTO0 = new CharacterDTO("마리오", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지", 3.2, 4.4, 3.1, 4.4, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오", 3.4, 4.2, 3.2, 4.2, 3.4);
		CharacterDTO characterDTO3 = new CharacterDTO("피치", 3.1, 4.8, 3.4, 4.5, 3.5);
		// 객체 생성 완료

		// 객체를 배열에 넣어서 관리
		characterDTOs[0] = characterDTO0;
		characterDTOs[1] = characterDTO1;
		characterDTOs[2] = characterDTO2;
		characterDTOs[3] = characterDTO3;
		
		// 타이어
		cartDTOs[0] = new CartDTO("기본카트", 4.0, 3.5, 2.0);
		cartDTOs[1] = new CartDTO("중급카트", 4.5 ,3.8, 3.0);
		cartDTOs[2] = new CartDTO("고급카트", 5.0, 4.2, 3.5);
		
		tireDTOs[0] = new TireDTO("기본타이어", 3.0, 4.0);
		tireDTOs[1] = new TireDTO("중급타이어", 3.5, 4.2);
		tireDTOs[2] = new TireDTO("고급타이어", 4.0, 4.5);
		
		gliderDTOs[0] = new GliderDTO("기본글라이더", 3.0, 3.0);
		gliderDTOs[1] = new GliderDTO("중급글라이더", 3.2, 3.5);
		gliderDTOs[2] = new GliderDTO("고급글라이더", 3.5, 4.0);
		
		itemDTOs[0] = new ItemDTO("버섯");
		
		
		
		
	} // static
		// 메인메서드

	public static void main(String[] args) {
		System.out.println("============마리오카트 게임을 시작합니다");
		boolean run = true;
	while(run){
			System.out.println("1.회원관리 | 2. 카트관리 | 3. 게임실행 | 4. 종료");
			System.out.println(">>>");
			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("회원관리 클래스로 진입합니다");
				MemberService memberService = new MemberService();//회원관리용 객체 생성
				loginState = memberService.menu(input, memberDTOs, loginState);
				System.out.println("현재 로그인한 회원은 : " + loginState.nickName);
				break;
				
			case 2:
				System.out.println("카트관리 클래스로 진입합니다");
				CartService cartService = new CartService();
				cartService.menu(input, memberDTOs, loginState);
				break;
				
			case 3:
				System.out.println("게임실행 클래스로 진입합니다");
				GameService gameService = new GameService();
				gameService.startGame(input, characterDTOs, cartDTOs, tireDTOs, gliderDTOs, itemDTOs, loginState);
				break;
				
			case 4:
				System.out.println("게임종료합니다");
				run = false;
				break;

			default:
				System.out.println("1~4까지만 입력하세요");
				break;
			} // switch
		} // while (run)
} // main
}// class
