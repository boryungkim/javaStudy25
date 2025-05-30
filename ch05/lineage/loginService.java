package ch05.lineage;

import java.util.Scanner;

public class loginService {

	public static Account menu(Scanner input, Account[] account, Account loginAccount) {
	System.out.println("1. 로그인");
	System.out.println("2. 회원가입");
	System.out.println("3. 회원수정");
	System.out.println("4. 종료");
	System.out.println(">>>");
	int select = input.nextInt();
	
	switch(select) {
	case 1:
		System.out.println("로그인을 시작합니다");
		System.out.println("id:");
		String id = input.next();
		
		System.out.println("pw: ");
		String pw = input.next();
		
		Account temp = new Account();
		temp.setId(id);
		temp.setPw(pw);
		
		for(int i=0; i<account.length; i++) {
			if(account[i] != null &&
					account[i].getId().equals(temp.getId())&&
					account[i].getPw().equals(temp.getPw())) {
				
				loginAccount = account[i];
				System.out.println("로그인 성공!");
				break;
			}//if 로그인 성공할 때
			else {
				System.out.println("일치하는 회원정보가 없습니다");
			}
			break;
				
		}// for 반복
	
	}//switch
	
		return loginAccount;
		
		
	}// menu method
}//class
