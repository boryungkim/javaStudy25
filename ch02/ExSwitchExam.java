package ch02;

import java.util.Scanner;

public class ExSwitchExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("동물의 이름을 입력하세요 >>>");
		String monster = input.next();
		String kind = Who(monster);
		
		System.out.println(monster + "는" + kind + "입니다");

	}//main method

	static String Who(String monster) {
		String kind = null;
		switch(monster) {
		case "호랑이","사자","강아지" -> kind = "포유류";
		case "독수리","참새", "까마귀" -> kind = "조류";
		default -> System.out.println("알 수 없는 개체");
		}//switch문 종료
		return kind;
	} //Who 메서드 종료

}//class
