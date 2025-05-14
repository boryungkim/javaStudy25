package ch02;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String regNo = in.nextLine();
		char gender =  regNo.charAt(7);
		switch (gender) {
		case '1': case '3' : case '5' : case '7':
			System.out.println("남자");
			break;
		case '2' : case '4': case '6' : case '8':
			System.out.println("여자");
			break;
		default :
			System.out.println("다시 입력해주세요.");
			break;
		}
		

	}

}
