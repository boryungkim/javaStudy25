package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;

public class NhBankService {

	public void menu(Scanner inputInt, Scanner inputStr, AccountDTO[] nhBank) {
		boolean subRun = true;
		while (subRun) {
			System.out.println("--------------------------------------");
			System.out.println("농협은행계좌관리 메서드입니다.");
			System.out.println("1. 계좌생성");
			System.out.println("2. 계좌목록");
			System.out.println("3. 예금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 종료");
			System.out.println(">>>");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("===계좌생성메서드로 진입합니다===");
				createAccount(inputStr, inputStr, nhBank);
				break;

			case "2":
				System.out.println("===계좌목록메서드로 진입합니다===");
				accountLists(inputStr, inputInt, nhBank);
				break;

			case "3":
				System.out.println("===예금메서드로 진입합니다===");
				deposit(inputStr, inputInt, nhBank);
				break;

			case "4":
				System.out.println("===출금메서드로 진입합니다===");
				withDraw(inputStr, inputInt, nhBank);
				break;

			case "5":
				System.out.println("===이체메서드로 진입합니다===");
				System.out.println("1. 농협은행 내 송금");
				System.out.println("2. 타 은행 간 송금");
				System.out.println(">>>");
				String tselect = inputStr.next();

				if (tselect.equals("1")) {
					transferSameBank(inputStr, inputInt, nhBank);
				} else if (tselect.equals("2")) {
					transfterOtherBank(inputStr, inputInt, senderBank, receiverBank);
				}
				break;

			case "6":
				System.out.println("종료합니다");
				System.out.println("메인으로 복귀합니다");
				subRun = false;
				break;

			default:
				System.out.println("1~6까지만 입력해주세요");
				break;

			}// switch

		} // while(subRun)

	}// menu 메서드 종료

	private void transferSameBank(Scanner inputStr, Scanner inputInt, AccountDTO[] nhBank) {

		System.out.println("농협은행 간 송금 페이지입니다");
		System.out.println("보내는 분의 계좌번호 : ");
		String sendAno = inputStr.next();
		
		System.out.println("받는 분의 계좌번호 : ");
		String receiveAno = inputStr.next();
		
		System.out.println("송금할 금액 : ");
		int money = inputInt.nextInt();
		
		AccountDTO sender = findAccount(sendAno, nhBank); 
		AccountDTO receiver = findAccount(receiveAno, nhBank);
		
		if(sender == null || receiver == null) {
			System.out.println("계좌를 찾을 수 없습니다");
			return;
		} // 받는 사람 주는 사람 둘 중 하나라도 계좌 찾을 수 없을 경우
		if(sender.getBalance() < money) {
			System.out.println("잔액이 부족합니다");
			return;
		} // 보내는 사람 계좌에 보낼 돈 보다 잔액이 부족할 경우
		sender.setBalance(sender.getBalance() - money);
		receiver.setBalance(receiver.getBalance() + money);
		// 잔액 정리
		System.out.println("송금 성공!");
		System.out.println(receiver.getOwner()+"님 잔액 : " + receiver.getBalance());
		System.out.println(sender.getOwner() + "님 잔액 : " + sender.getBalance());
		
	}

	private void withDraw(Scanner inputStr, Scanner inputInt, AccountDTO[] nhBank) {
		System.out.println("========출금=========");
		System.out.println("계좌번호 : ");
		String ano = inputStr.next();
		System.out.println("출금액 : ");
		int money = inputInt.nextInt();
		AccountDTO withdrawalAccount = findAccount(ano, nhBank);

		if (withdrawalAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다");
			return;
		}
		withdrawalAccount.setBalance(withdrawalAccount.getBalance() - money);
		System.out.println("출금테스트 결과 : " + withdrawalAccount);
		System.out.println(withdrawalAccount.getOwner() + "님 출금이 성공되었습니다");
		System.out.println("잔액 : " + withdrawalAccount.getBalance());
		System.out.println("======================");
	}

	private void deposit(Scanner inputStr, Scanner inputInt, AccountDTO[] nhBank) {
		// 계좌변호를 입력하고 입금액을 입력하면 계좌번호를 찾아서 잔액을 증가시킨다
		System.out.println("========예금========");
		System.out.println("계좌번호 : ");
		String ano = inputStr.next();
		System.out.println("예금액 : ");
		int money = inputInt.nextInt();
		AccountDTO inputAccount = findAccount(ano, nhBank);
		// findAccount 메서드는 배열에서 객체를 찾아주고 객체를 리턴해준다(반복코드 배제용)

		if (inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다");
			return;
		}
		inputAccount.setBalance(inputAccount.getBalance() + money);
		System.out.println("입금테스트 결과 : " + inputAccount);
		// toString으로 결과 보기
		System.out.println(inputAccount.getOwner() + "님 입금이 성공되었습니다");
		System.out.println("잔액 : " + inputAccount.getBalance());
		System.out.println("======================");

	}// 입금용 메서드 종료

	private AccountDTO findAccount(String ano, AccountDTO[] nhBank) {
		// 입금, 출금, 이체에서 계좌번호를 이용해 객체를 찾는 반복코드 메서드
		AccountDTO account = null; // 빈 객체
		for (int i = 0; i < nhBank.length; i++) {
			if (nhBank[i] != null) {
				// 하나은행배열이 null이 아님
				String dbAno = nhBank[i].getAno();
				// 배열에 있는 계좌 번호를 가져와 dbAno 변수에 넣음
				if (dbAno.equals(ano)) {
					// 키보드로 입력된 계좌번호와 dbAno와 같은 값을 찾는다
					account = nhBank[i];
					// 빈객체에 찾은 객체를 넣는다
					break;
				} // 번호 같은지 판단 종료
			} // 빈객체가 아닌지 판단 종료
		} // for 배열 반복 종료

		return account;
	}// 계좌찾기 메서드 종료

	private void accountLists(Scanner inputStr, Scanner inputInt, AccountDTO[] nhBank) {
		// 하나은행에 계정을 모두 본다 (은행원용)
		System.out.println("------농협은행계좌리스트------");
		for (int i = 0; i < nhBank.length; i++) {
			AccountDTO accountlist = nhBank[i];
			if (accountlist != null) {
				// 배열에 null이 아니면 출력
				System.out.println(accountlist.getAno());
				System.out.println("\t");

				System.out.println(accountlist.getOwner());
				System.out.println("\t");

				System.out.println(accountlist.getBalance());
				System.out.println("\t\n");
				System.out.println("-------------------------");
			}

		}

	}

	private void createAccount(Scanner inputStr, Scanner inputInt, AccountDTO[] nhBank) {
		// 하나은행 배열에 새로운 객체를 넣는다
		System.out.println("----------계좌생성-----------");
		AccountDTO myAccount = new AccountDTO(); // 빈객체 생성
		System.out.println("계좌번호 : ");
		myAccount.setAno(inputStr.next());

		System.out.println("계좌주 : ");
		myAccount.setOwner(inputStr.next());

		System.out.println("초기입금액 : ");
		myAccount.setBalance(inputInt.nextInt()); // 21억까지 입금
		myAccount.setBankname("농협"); // 빈 객체에 데이터 입력완료

		// 하나 은행 배열에 객체를 삽입 (null인지 확인하고 넣음)
		for (int i = 0; i < nhBank.length; i++) {
			if (nhBank[i] == null) {
				nhBank[i] = myAccount; // 배열에 입력한 객체 연결
				System.out.println("계좌 입력 완료 테스트 : " + nhBank[i]);
				break; // 1개만 입력하기 위해
				// toString으로 테스트결과가 보임
				// 하나은행배열에 null값이면 처리하는 코드
			}

		} // for 하나은행 배열을 0번에서부터 반복

		System.out.println("계좌생성이 정상적으로 처리되었습니다");
	} // createAccount 메서드 종료

}// 클래스 종료
