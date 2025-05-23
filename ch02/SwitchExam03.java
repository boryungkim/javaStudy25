package ch02;

import java.util.Scanner;

public class SwitchExam03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("동물의 이름을 입력하세요>>>");
		String monster = input.next();
		
		Who(monster);
		

	}//main method

	static void Who(String monster) {
	
		String kind = null;
		switch (monster) {
		case "호랑이","사자","강아지" -> kind = "포유류";
		case "독수리","참새", "까마귀" -> kind = "조류";
		default -> System.out.println("알 수 없는 개체");
		}//switch문
		System.out.println(monster + "는 " + kind + "입니다" );
	}//사용자지정 메서드

}// class
