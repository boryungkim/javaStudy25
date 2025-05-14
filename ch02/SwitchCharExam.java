package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inChar = new Scanner(System.in);
		
		System.out.println("회원등급을 입력하세요.");
		
		char gradeChaStr = inChar.next().charAt(0);
		
		System.out.println(gradeChaStr);
		
		switch(gradeChaStr) {
		case 'a':
		case 'A':
			System.out.println("우수회원입니다.");
		break;
		case 'b':
		case 'B':
			System.out.println("일반회원입니다.");
			break;
		case 'c':
		case 'C':
			System.out.println("사업자회원입니다.");
			break;
		default:
			System.out.println("회원가입하시려면 yes를 입력해주세요.");
		String newmember= inChar.next();
		if(newmember.equalsIgnoreCase("yes")) {
			System.out.println("회원가입을 진행합니다.");
			System.out.println("ID를 입력해주세요 >>>");
			String id = inChar.next();
			System.out.println(id + "님 회원가입을 축하드립니다.");
			break;
			}
		else {
			System.out.println("회원가입실패");
			break;
			}//회원 가입 if문 종료
		}// switch문 종료
	}// main method

}//class
