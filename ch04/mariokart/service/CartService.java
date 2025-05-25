package ch04.mariokart.service;

import java.util.Scanner;

import ch04.mariokart.dto.CartDTO;
import ch04.mariokart.dto.MemberDTO;

public class CartService {
	
	public void menu(Scanner input, MemberDTO[] members, MemberDTO loginUser) {
		boolean run = true;
		
		while(run) {
			System.out.println("카트관리메뉴");
			System.out.println("1. 내 선택카트보기");
			System.out.println("2. 전체 카트 목록보기");
			System.out.println("3. 종료");
			System.out.println(">>>");
			String select = input.next();
			
			switch(select) {
			case "1":
				showMyCart(loginUser);
				break;
				
			case "2" :
				showAllCarts(members);
				break;
				
			case "3" :
				System.out.println("종료합니다");
				run = false;
				break;
				
				default : 
				System.out.println("다시 입력해주세요");
			}
		}
		
	}
	
	public void showAllCarts(MemberDTO[] members) {
		System.out.println("모든 회원의 선택 카트 보기");
		for(MemberDTO member : members) {
			if(member != null && member.selectedCart != null) {
				System.out.println(member.nickName + "님의 카트 : " + member.selectedCart.name);
			}
		}
		
	}

	public void showMyCart(MemberDTO loginUser) {
		if(loginUser == null) {
			System.out.println("로그인 상태가 아닙니다");
			return;
		}
		if(loginUser.selectedCart == null) {
			System.out.println("선택된 카트가 없습니다");
		}else {
			CartDTO cart = loginUser.selectedCart;
			System.out.println("내 카트 : " + cart.name);
			System.out.println("속도 :"+ cart.speed);
			System.out.println("조작력 : " + cart.handling);
		}
	}
	
	
}

