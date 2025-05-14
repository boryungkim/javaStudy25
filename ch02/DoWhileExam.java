package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputString;
		
		
		do {
			System.out.println(">>>");
			inputString = in.nextLine();
			System.out.println("전송값 : " + inputString);
		} while (!inputString.equals("q"));
		System.out.println("----------");
		System.out.println("프로그램 종료");
		System.out.println("----------");

	}

}
