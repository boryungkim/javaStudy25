package ch02;

import java.util.Scanner;

public class MethodExam02 {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);	
		Scanner inputChar = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			int select = menu(inputInt);
			switch(select) {
			case 1 :
				staffAdmin(inputChar, inputStr);
				break;
			case 2 :
				studentAdmin(inputChar);
				break;
			case 3 :
				gradeAdmin();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
			System.out.println("다시 선택해주세요.");		
			break;
			}//switch
		}//while(run)
		
		
	}//main method


	private static void studentAdmin(Scanner inputChar) {
		boolean subRun2 = true;
		Scanner inputStr = new Scanner(System.in);
		while (subRun2) {
			System.out.println("===학생관리메뉴로 진입===");
			System.out.println("a. 학생등록"); // c
			System.out.println("b. 학생보기"); // r
			System.out.println("c. 학생수정"); // u
			System.out.println("d. 학생삭제"); // d
			System.out.println("z. 학생관리메뉴종료");
			System.out.print("(a~z)>>>");
			
			char subSelect2 = inputChar.next().charAt(0);
			
			switch(subSelect2) {
			case 'a':
			case 'A':
				stdReg(inputStr);
				break;
			case 'b':
			case 'B':
				stdRea(inputStr);
				break;
			case 'c':
			case 'C':
				stdUp();
				break;
			case 'd':
			case 'D':
				stdDe();
				break;
			case 'z':
			case 'Z':
				System.out.println("메뉴를 종료합니다");
				subRun2 = false;
				break;
			
	
			}//switch
		}//while
		
	}//studentAdmin


	private static void stdRea(Scanner inputStr) {
		System.out.println("1. 글 작성하기");
		System.out.println("2. 게시글 보기");
		System.out.println("3. 게시글 수정하기");
		System.out.println("4. 게시글 삭제하기");
	}


	private static void stdReg(Scanner inputStr) {
		
		System.out.println("새로 등록하시겠습니까?");
		String newmember = inputStr.next();
		if (newmember.equalsIgnoreCase("yes")){
			System.out.println("id를 입력해주세요");
			String newname = inputStr.next();
			System.out.println(newname + "님 등록이 완료되었습니다");
		}else {
			System.out.println("등록실패");
		}//if
	}// stdReg 메서드


	private static int menu(Scanner inputInt) {
			
		System.out.println("=======엠비씨성적처리======");
		System.out.println("1.교직원관리");
		System.out.println("2.학생관리");
		System.out.println("3.성적관리");
		System.out.println("9.프로그램 종료");
		System.out.println("(1~9)>>>>>");
		
		return inputInt.nextInt();
		
		
			
	
	}//menu

	
	private static void staffAdmin(Scanner inputChar, Scanner inputStr) {
		boolean subRun = true;
		while (subRun) {
			System.out.println("===교직원관리메뉴로 진입===");
			System.out.println("a. 교직원등록"); // c
			System.out.println("b. 교직원보기"); // r
			System.out.println("c. 교직원수정"); // u
			System.out.println("d. 교직원삭제"); // d
			System.out.println("z. 교직원관리메뉴종료");
			System.out.print("(a~z)>>>");
			
			char subSelect = inputChar.next().charAt(0);
			
			switch(subSelect) {
			case 'a':
			case 'A':
				stfReg(inputStr);
				break;
			case 'b':
			case 'B':
				stfRea();
				break;
			case 'c':
			case 'C':
				stfUp();
				break;
			case 'd':
			case 'D':
				stfDe();
				break;
			case 'z':
			case 'Z':
				System.out.println("메뉴를 종료합니다");
				subRun = false;
				break;
			
	
			}//switch
		}//while
		
	}//staffAdmin method


	private static void stfReg(Scanner inputStr) {
		System.out.println("새로 등록하시겠습니까?");
		String newmember = inputStr.next();
		if (newmember.equalsIgnoreCase("yes")){
			System.out.println("id를 입력해주세요");
			String newname = inputStr.next();
			System.out.println(newname + "님 등록이 완료되었습니다");
		}else {
			System.out.println("등록실패");
		}//if
	}//stgReg 메서드

	
}//class
