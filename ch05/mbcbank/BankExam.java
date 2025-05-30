package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.service.HanaBankService;
import ch05.mbcbank.service.NhBankService;

public class BankExam {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
			
	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] wooriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];
	public static AccountDTO session = null;
	
	
	
	// 생성자 -> 정적 블럭 (main 메서드 초기화 값)
	static {
		AccountDTO accountDTO0 = new AccountDTO("1234", "김기원", 3000000, "하나");
		hanaBank[0] = accountDTO0;
		
		AccountDTO accountDTO1 = new AccountDTO("5678", "조은아", 3000000, "우리");
		wooriBank[0] = accountDTO1;
		
		AccountDTO accountDTO2 = new AccountDTO("9876", "최준오", 300000000, "농협");
		nhBank[0] = accountDTO2;
	}
	
	
	//메서드
	
	
	public static void main(String[] args) {
		// 은행 3개를 만들어 계좌 관리하는 프로그래밍
		// 테스트 코드 작성
		// 기본값 입력 더미데이터 출력용 코드 -> toString 오버라이딩으로 볼 수 있다
	//	System.out.println("하나은행 더미데이터 출력 테스트 : " + hanaBank[0]);
	//	System.out.println("우리은행 더미데이터 출력 테스트 : " + wooriBank[0]);
	//	System.out.println("농협은행 더미데이터 출력 테스트 : " + nhBank[0]);
		
		boolean run = true; //주메뉴 반복용
		
		while(run) {
			System.out.println("==============================");
			System.out.println("MBC코인시스템에 오신 것을 환영합니다");
			System.out.println("==============================");
			System.out.println("1.하나은행");
			System.out.println("2.우리은행");
			System.out.println("3.농협은행");
			System.out.println("4.프로그램 종료");
			System.out.println(">>>");
			
			String select = inputStr.next();
			switch(select) {
			case "1" :
				System.out.println("하나은행으로 진입합니다");
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputInt, inputStr, hanaBank);
				break;
				
			case "2" :
				System.out.println("우리은행으로 진입합니다");
				WooriBankService wooriBankService = new WooriBankService();
				wooriBankService.menu(inputInt, inputStr, wooriBank);
				break;
				
			case "3" :
				System.out.println("농협은행으로 진입합니다");
				NhBankService nhBankService = new NhBankService();
				nhBankService.menu(inputInt, inputStr, nhBank);
				break;
				
			case "4" :
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
				
			default :
				System.out.println("1~4 값만 입력하세요");
				break;
			}//switch 메뉴 선택문 종료
			
			
			
		}//while(run) 주메뉴 종료
	}//main 메서드 종료 

}//class (BankExam)
