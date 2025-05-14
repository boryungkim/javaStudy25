package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("a.교직원관리");
		System.out.println("b.학생관리");
		System.out.println("c.성적관리");
		System.out.println("z.프로그램 종료");
		System.out.println("(a~z)>>>");
		
		char select = input.next().charAt(0);

		switch(select) {
		case 'A':
		case 'a':
			System.out.println("교직원관리메뉴로 진입하셨습니다.");
			System.out.println("1.교직원등록");
			System.out.println("2.교직원보기");
			System.out.println("3.교직원수정");
			System.out.println("4.교직원삭제");
			System.out.println("(1~4)>>>");
			int subSelect = input.nextInt();
			switch (subSelect) {
			case 1 :
				System.out.println("교직원등록메뉴입니다.");
				break;
				
			case 2 :
				System.out.println("교직원보기메뉴입니다.");
				break;
			case 3 :
				System.out.println("교직원수정메뉴입니다.");
				break;
			case 4 :
				System.out.println("교직원삭제메뉴입니다.");
				break;
			default:
				System.out.println("다시입력해주세요.");
			}
			break;
			
		case 'B':
		case 'b':
			System.out.println("학생관리메뉴로 진입하셨습니다.");
			System.out.println("1.학생등록");
			System.out.println("2.학생보기");
			System.out.println("3.학생수정");
			System.out.println("4.학생삭제");
			System.out.println("(1~4)>>>");
			int selecto = input.nextInt();
			switch (selecto) {
			case 1 : 
				System.out.println("학생등록메뉴입니다.");
			break;
			case 2 :
				System.out.println("학생보기메뉴입니다.");
			break;
			case 3 :
				System.out.println("학생수정메뉴입니다.");
				break;
			case 4:
				System.out.println("학생삭제메뉴입니다.");
				break;
			default:
				System.out.println("다시입력해주세요.");
				}
			break;
		
		case'C':
		case'c':
			System.out.println("성적관리메뉴로 진입하셨습니다.");
			System.out.println("1.성적등록");
			System.out.println("2.성적보기");
			System.out.println("3.성적수정");
			System.out.println("4.성적삭제");
			int selectt = input.nextInt();
			switch (selectt) {
			case 1 : 
				System.out.println("성적등록메뉴입니다.");
				break;
				
			case 2:
				System.out.println("성적보기메뉴입니다.");
				break;
				
			case 3 :
				System.out.println("성적수정메뉴입니다.");
				break;
				
			case 4:
				System.out.println("성적삭제메뉴입니다.");
				break;
				
			default :
				System.out.println("다시입력해주세요.");
				break;
			}
			break;
			
			
		case'Z':
		case'z':
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default:
			System.out.println("다시 입력해주세요.");
			break;
		} //switch문 종료
		

	}//main method 종료

}//class 종료
