package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String loginid = "kkw";
		String loginpw = "1234";
		
		Scanner in = new Scanner(System.in);
		System.out.println("로그인할 id를 입력해주세요.");
		System.out.print("ID : ");
		String id = in.nextLine();
		System.out.println("입력하신 id는" + id);
		
		System.out.println("로그인할 암호를 입력해주세요.");
		System.out.print("PW : ");
		String pw = in.nextLine();
		
		if ((loginid.equals(id)) & (loginpw.equals(pw))) {
			System.out.println("로그인 성공");
			}
		else { 
			System.out.println("로그인 실패");
		}//if문 종료
		

	} //메인 메서드 종료

}//클래스 종료
