package ch04.mariokart.service;

import java.util.Scanner;

import ch04.mariokart.dto.CartDTO;
import ch04.mariokart.dto.CharacterDTO;
import ch04.mariokart.dto.GliderDTO;
import ch04.mariokart.dto.ItemDTO;
import ch04.mariokart.dto.TireDTO;

public class SelectService {
	
	public CharacterDTO selectCharacter(Scanner input, CharacterDTO[] characters)
	{
		System.out.println("=====캐릭터 선택=====");
		for(int i=0; i < characters.length; i++) {
			if(characters[i] != null) {
				System.out.println(i + "." + characters[i].name);
			} //if
		} //for
		System.out.println("선택>>>");
		int select = input.nextInt();
		return characters[select];
	}// character DTO selectCharacter 메서드

	
	//접근제어자 리턴타입   이름        매개변수목록
	public CartDTO selectCart(Scanner input, CartDTO[] carts) {
		System.out.println("=====카트 선택=====");
		for(int i = 0; i < carts.length; i++) {
			if(carts[i] != null) {
				System.out.println((i+1) + "." + carts[i].name);
			}
		}
		System.out.println(">>>");
		int select = input.nextInt();
		
		if(select < 1 || select > carts.length || carts[select - 1] == null ) {
			System.out.println("잘못된 선택입니다. 기본카트를 선택합니다.");
			return carts[0];
		}
		return carts[select - 1];
	}
	
	public TireDTO selectTire(Scanner input, TireDTO[] tires) {
		System.out.println("타이어를 선택하세요");
		for(int i=0; i<tires.length; i++) {
			if(tires[i]!=null) {
				System.out.println((i+1) + "." + tires[i].name);
			}
		}//for
		System.out.println(">>>");
		int select = input.nextInt();
		
		if(select < 1 || select > tires.length || tires[select - 1] == null) {
			System.out.println("잘못된 선택입니다. 기본 타이어를 선택합니다");
			return tires[0];
		}
		return tires[select-1];
	}
	
	public GliderDTO selectGlider(Scanner input, GliderDTO[] gliders) {
		System.out.println("글라이더를 선택하세요");
		for(int i=0; i<gliders.length; i++) {
			if(gliders[i]!=null) {
				System.out.println((i+1) + "." + gliders[i].name);
			}
		}//for
		System.out.println(">>>");
		int select = input.nextInt();
		
		if(select < 1 || select > gliders.length || gliders[select - 1] == null) {
			System.out.println("잘못된 선택입니다. 기본 글라이더를 선택합니다");
			return gliders[0];
		}
		return gliders[select-1];
	
	}
	
	public ItemDTO selectItem(Scanner input, ItemDTO[] items) {
		System.out.println("아이템을 선택하세요");
		for(int i=0; i<items.length; i++) {
			if(items[i]!=null) {
				System.out.println((i+1) + "." + items[i].name);
			}
		}//for
		System.out.println(">>>");
		int select = input.nextInt();
		
		if(select < 1 || select > items.length || items[select - 1] == null) {
			System.out.println("잘못된 선택입니다. 기본 글라이더를 선택합니다");
			return items[0];
		}
		return items[select-1];
	}
} //class

