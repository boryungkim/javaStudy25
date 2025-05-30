package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.dto.ElfDTO;
import ch05.lineage.dto.KnightDTO;

public class LineageExam {
	public static Scanner input = new Scanner(System.in);
	public static Account[] account = new Account[10];
	public static Account loginAccount;
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();

	static {
		knightDTO.setSword("양손검");
		knightDTO.setArmor("갑옷");
		knightDTO.setShield("방패");
		knightDTO.setName("양기사");
		knightDTO.setSex("남");
		knightDTO.setLevel("1");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);

		elfDTO.setBow("양손활");
		elfDTO.setDress("드레스");
		elfDTO.setArrow("화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(20);
		elfDTO.setMoney(50000);

		Account testAccount = new Account(); // 테스트용 계정

		testAccount.setId("kkk");
		testAccount.setPw("kkk");
		testAccount.setNickName("kkk");
		account[0] = testAccount;
	}// static

	public static void main(String[] args) {

		System.out.println("====리니지 게임을 시작합니다====");
		boolean run = true;

		while (run) {
			System.out.println("1.로그인");
			System.out.println("2.캐릭터 선택");
			System.out.println("3.게임실행");
			System.out.println("4.종료");
			System.out.println(">>>");
			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("로그인을 시작합니다");
				loginService.menu(input, account, loginAccount);
				break;

			case 2:
				System.out.println("캐릭터를 선택합니다");
				characterService
				break;

			case 3:
				System.out.println("게임을 시작합니다");
				break;

			case 4:
				System.out.println("종료합니다");
				run = false;
				break;

			default:
				System.out.println("1~4까지 입력해주세요");
				break;
			} // switch

		} // while(run)

	}// main method

}// class
