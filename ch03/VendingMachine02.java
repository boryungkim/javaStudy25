package ch03;

import java.util.Scanner;

public class VendingMachine02 {

	public static void main(String[] args) {
	
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		String [] drinks = {"콜라","사이다","커피","물"};
		int [] prices = {1500, 1400, 1200, 800};
		int [] stocks = {1,1,1,1};
		int [] totalSales = {0};
		String [] pw = {"correctPw"};
		
		boolean run = true;
		while(run) {
			System.out.println("======자판기 메뉴======");
			for (int i =0; i< drinks.length; i++) {
				String stockStatus = (stocks[i] > 0)?("재고 : " + stocks[i]):"품절";
				System.out.println((i+1) + "." + drinks[i] + ":" + prices[i] + "(" + stockStatus + ")");
			}//for
			System.out.println("0. 종료");
			System.out.println("99. 관리자모드");
			System.out.println("음료 번호를 선택하세요 (1~" + drinks.length +")");
			System.out.println(">>>>");
			int select = inputInt.nextInt();
			
			if(select == 0) {
				System.out.println("종료합니다");
				run = false;
			}//0 골랐을 때 if
			else if(select == 99) {
				if(login(inputStr, pw)) {
					showAdminMenu();
				}// login()메서드 값 true이면 showAdminMenu 호출
				else {
					System.out.println("관리자 접근이 막혔습니다");
				}//login()메서드 값 false이면 관리자 접근 실패 띄움
			}//99 골랐을 때 if : 관리자용 로그인
		}//while(run)
		
		
		

	}//main method

	static boolean login(Scanner inputStr, String[] pw) {
		final int MAX_ATTEMPTS = 3;
		int attempts = 0;
		
		while (attempts < MAX_ATTEMPTS) {
			System.out.println("관리자용 비밀번호를 입력하세요");
			String pwInput = inputStr.next();
			
			if(pwInput.equals(pw)) {
				return true;
			}//if 로그인 성공했을 때
			else {
				attempts++;
				int remain = MAX_ATTEMPTS - attempts;
				if(remain > 0) {
					System.out.println("비밀번호가 일치하지 않습니다");
					System.out.println("남은 횟수 : " + remain);
				}// 로그인 오류 if (3회 넘어가지 않았을 때)
			} //else
		}//while(attempts < MAX_ATTEMPTS)
		System.out.println("비밀번호 3회 오류. 관리자 모드 진입 실패");
		return false;
	}//login method

}//class
