package ch03;

import java.util.Scanner;

class VendingMachineExam {

	public static void main(String[] args) {

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		//자판기 데이터
		String[] drinks = { "콜라", "사이다", "커피", "물" };
		int[] prices = { 1500, 1400, 1200, 800 };
		int[] stocks = { 1, 1, 1, 0 };
		int[] totalSales = {0}; // 배열이 참조형이기 때문에 다른 메서드에서 반영가능
		String[] pw = {"correctPw"};
		
		//회원 관리 배열
		String[] memberNames = new String [0];
		int memberCount = 0;
		int currentUserIndex = -1;
		// -1 : 없다
		
		
		
		
		boolean run = true;
		while (run) {
			System.out.println("====자판기 메뉴====");
			for (int i = 0; i < drinks.length; i++) {
				String stockStatus = (stocks[i] > 0) ? ("재고 : " + stocks[i]) : "품절";
				System.out.println((i + 1) + "." + drinks[i] + " : " + prices[i] + "(" + stockStatus + ")");
			} // for
			System.out.println("0. 종료");
			System.out.println("99. 관리자 모드");
			System.out.println("10. 회원모드");

			
			// 메뉴, 재고, 가격 보기

			System.out.println("음료 번호를 선택하세요 (1~" + drinks.length + ") >>>");
			int select = inputInt.nextInt();

			// 사용자가 음료번호 입력해서 선택

			if (select == 0) {
				System.out.println("자판기를 종료합니다");
				run = false;
			} // if(select == 0)
			else if (select == 99) {
				if (login(inputStr, pw)) {
					showAdminMenu(inputStr, drinks, stocks, inputInt, totalSales, pw);
				} else {
					System.out.println("관리자 접근 실패");
				} // else

			} // else if (select == 99) 관리자용 기능 로그인
			else if (select == 10) {
				System.out.println("회원 id를 입력해주세요 : ");
				String idInput = inputStr.next();
				boolean found = false; //회원존재여부 확인 변수
				for(int i =0; i< memberCount; i++) {
					if(memberNames[i].equals(idInput)) {
						currentUserIndex = i;
						System.out.println("환영합니다" + memberNames[i] + "님!");
						MemberCart(drinks, prices, stocks, inputInt, totalSales, currentUserIndex);
						found = true;
						break;
					}//id 찾았을 경우
				}//for
				if (!found) {
					memberNames[memberCount] = idInput;
					currentUserIndex = memberCount;
					memberCount ++;
					System.out.println("신규회원으로 등록되었습니다");
				}//id를 못찾았을 경우 -> 회원등록
			}// else if 회원전용 선택 시
			
			else if (select < 1 || select > drinks.length) {
				System.out.println("다시 입력해주세요");
			} else {
				int index = select - 1;
				String selectedDrink = drinks[index];
				int selectedPrice = prices[index];

				if (stocks[index] == 0) {
					System.out.println(selectedDrink + ": 품절입니다");
				} else {
					System.out.println("선택한 음료 : " + selectedDrink + " : " + selectedPrice);
					System.out.println("돈을 투입하세요");
					int money = inputInt.nextInt(); // 금액 투입

					if (money < selectedPrice) { // 투입된 금액이 음료가격보다 적은 경우
						System.out.println("금액이 부족합니다.");
						System.out.println("현재 입금액 : " + money);
					} else { // 투입된 금액이 음료가격보다 많은 경우
						int change = money - selectedPrice;
						stocks[select - 1]--; // 재고 감소
						totalSales[0] = totalSales[0] + selectedPrice; // 매출 증가
						System.out.println("거스름돈 : " + change);
					} // if(money<selectedPrice)
				} // else
				System.out.println("계속하시겠습니까?");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				int again = inputInt.nextInt();
				if (again == 2) {
					System.out.println("이용해주셔서 감사합니다.");
					run = false;
				} // if
			} // else (정상 선택 처리)
		} // while (run)

	} // main method

	static void MemberCart(String[] drinks, int[] prices, int[] stocks, Scanner inputInt, int[] totalSales,
			int currentUserIndex) {
		int[] cart = new int[drinks.length];
		boolean shopping = true; // 쇼핑하는 동안에 장바구니 기능 돌아감
		while (shopping) {
			System.out.println("음료 번호를 선택하세요");
			System.out.println("0. 결제");
			int choice = inputInt.nextInt();
			
			if(choice == 0) { // 결제창으로 돌아가려면 장바구니 기능 꺼야함
				shopping = false; // 없어도 상관 없음
				break; // while 바로 종료
			}// if 0을 선택해서 결제할 경우
			if(choice < 1 || choice > drinks.length) {
				System.out.println("잘못된 선택입니다");
				continue; // 현재 반복 스킵하고 다음 반복으로 넘어감
				// 수량입력, 장바구니 재고관리 코드 실행하지 않음
			}// if 잘못된 숫자 입력했을 경우
			System.out.println("수량을 입력해주세요 : ");
			int itemNum = inputInt.nextInt();
			if (stocks[choice-1] < itemNum) {
				System.out.println("재고가 부족합니다");
				continue;
			}//수량 입력 (재고 부족일 경우)
			cart[choice-1] = cart[choice-1] + itemNum;
			
		}//while(shopping)
		
		int total = 0;
		for (int i =0; i< drinks.length; i++) {
			total = total + (cart[i] * prices[i]);
		}//장바구니 합계액
		
		if(total == 0) {
			System.out.println("장바구니 비어있음");
			return; // 현재 실행중인 메서드 종료하고 호출한 쪽으로 돌아감
		}//장바구니가 비었을 때 메인메뉴로 다시 돌아감
		
		System.out.println("총금액 : " + total + "원. 돈을 투입하세요");
		int money = inputInt.nextInt();
		if(money < total) {
			System.out.println("잔액이 부족합니다.");
			return;
		}// 입금액이 부족할 때
		int change = money - total;
		System.out.println("거스름돈 : " + change + "원");
		totalSales[0]= totalSales[0] + total; //  총매출액 증가
		
		for(int i = 0; i < drinks.length; i++) {
			stocks[i] = stocks[i] - cart[i]; //재고 감소
		}// for
		
	}//memberCart method

	static boolean login(Scanner inputStr, String[] pw) {
		final int MAX_ATTEMPTS = 3;
		int attempts = 0;

		while (attempts < MAX_ATTEMPTS) {
			System.out.println("==================");
			System.out.println("관리자 비밀번호를 입력하세요");
			String pwInput = inputStr.nextLine();

			if (pwInput.equals(pw[0])) {
				return true; // 로그인 성공
			} else {
				attempts++;
				int remain = MAX_ATTEMPTS - attempts;
				if (remain > 0) {
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("남은 횟수 : " + remain);
				} // if(remain > 0)
			} // else
		} // while (attempts < MAX_ATTEMPTS)
		System.out.println("비밀번호 3회 오류. 관리자모드 진입 실패");
		return false;
	} // login method

	static void showAdminMenu(Scanner inputStr, String[] drinks, int[] stocks, Scanner inputInt, int[] totalSales,
			String[] pw) {

		boolean adminMode = true;

		while (adminMode) {
			System.out.println("=====관리자모드======");
			System.out.println("1. 재고확인");
			System.out.println("2. 재고 수정");
			System.out.println("3. 매출 확인");
			System.out.println("4. 비밀번호 변경");
			System.out.println("0. 관리자모드 종료");
			System.out.println(">>>");

			int adminSelect = inputInt.nextInt();

			switch (adminSelect) {
			case 1:
				System.out.println("재고현황");
				for (int i = 0; i < drinks.length; i++) {
					System.out.println((i + 1) + "." + drinks[i] + " : " + stocks[i] + "개");
				} // for
				break;

			case 2:
				System.out.println("수정할 음료 번호를 입력하세요 (1~" + drinks.length + ") : ");
				int index = inputInt.nextInt() - 1;
				if (index >= 0 && index < drinks.length) {
					System.out.println("새 재고 수량입력 >>> ");
					int newStock = inputInt.nextInt();
					stocks[index] = newStock;
					System.out.println(drinks[index] + "재고가" + newStock + "개로 수정되었습니다");
				} else {
					System.out.println("잘못된 번호입니다");
				}
				break;

			case 3:
				showSales(totalSales);
				break;

			case 4:
				System.out.println("새로운 비밀번호를 입력해주세요 >>>");
				String newPw = inputStr.nextLine();
				pw[0] = newPw;
				System.out.println("비밀번호가 변경되었습니다");
				break;

			case 0:
				System.out.println("관리자 모드를 종료합니다");
				adminMode = false;
				break;

			default:
				System.out.println("잘못된 선택입니다");
				break;
			}// switch(adminSelect)

		} // while(adminMode)

	}// showAdminMenu method

	static void showSales(int[] totalSales) {
		System.out.println("현재까지 매출 : " + totalSales[0] + "원");

	} // showSales method

}// class
