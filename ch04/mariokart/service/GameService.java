package ch04.mariokart.service;

import java.util.Scanner;

import ch04.mariokart.dto.CartDTO;
import ch04.mariokart.dto.CharacterDTO;
import ch04.mariokart.dto.GliderDTO;
import ch04.mariokart.dto.ItemDTO;
import ch04.mariokart.dto.MemberDTO;
import ch04.mariokart.dto.TireDTO;

public class GameService {

	public void startGame(Scanner input, CharacterDTO[] characterDTOs, CartDTO[] carts, TireDTO[] tires,
			GliderDTO[] gliders, ItemDTO[] items, MemberDTO loginUser) {

		SelectService selectService = new SelectService();
		// 캐릭터 선택

		CharacterDTO selectedChar = selectService.selectCharacter(input, characterDTOs);
		System.out.println("당신이 선택한 캐릭터 : " + selectedChar.name + "입니다!");

		CartDTO selectedCart = selectService.selectCart(input, carts);
		System.out.println("당신이 선택한 카트 : " + selectedCart.name + "입니다!");

		TireDTO selectedTire = selectService.selectTire(input, tires);
		System.out.println("당신이 선택한 타이어 : " + selectedTire.name + "입니다!");

		GliderDTO selectedGlider = selectService.selectGlider(input, gliders);
		System.out.println("당신이 선택한 글라이더 : " + selectedGlider.name + "입니다!");

		ItemDTO selectedItem = selectService.selectItem(input, items);
		System.out.println("당신이 선택한 아이템 : " + selectedItem.name + "입니다!");
		// 선택과정
		
		loginUser.selectedcharacter = selectedChar;
		loginUser.selectedCart = selectedCart;
		loginUser.selectedTire = selectedTire;
		loginUser.selectedGlider = selectedGlider;
		loginUser.selectedItem = selectedItem;
		// 로그인한유저가 고른 아이템 정보 덮어씌움 저장
		
		
		double totalSpeed = selectedChar.speed + selectedCart.speed + selectedTire.speed + selectedGlider.speed;
		totalSpeed = applyItemEffect(selectedItem, totalSpeed);
		
		double totalAccel = selectedChar.acceleration + selectedCart.handling + selectedTire.handling
				+ selectedGlider.handling;
		double totalHandling = selectedChar.handling + selectedCart.handling + selectedTire.handling
				+ selectedGlider.handling;
		//능력치 계산
		
		System.out.println("캐릭터 : " + selectedChar.name);
		System.out.println("카트 : " + selectedCart.name);
		System.out.println("타이어 : " + selectedTire.name);
		System.out.println("글라이더 : " + selectedGlider.name);
		System.out.println("아이템 : " + selectedItem.name);
		
		System.out.println("최종능력치");
		System.out.println("속도 : " + totalSpeed + " 가속도 : " + totalAccel + " 조작력 : " + totalHandling );

		System.out.println("선택완료! 게임을 시작합니다!");
	}// startGame 메서드
		
		public double applyItemEffect(ItemDTO item, double speed) {
			if(item.name.equals("버섯")) {
				System.out.println("버섯 획득! 속도가 +1 증가합니다");
				return speed + 1.0;
			}//if
			return speed;
		
	}// applyItemEffect 메서드

}
