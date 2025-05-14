package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		String name = input.next();
		
		System.out.println("점수 >>> ");
		int score = input.nextInt();
		
		if(score <=100 && score >= 90) {
			System.out.println(name + " : " + score + "(A)" );
		}
		else if (score >= 80) {
			System.out.println(name + " : " + score + "(B)" );
		}
		else if (score >= 70) {
			System.out.println(name + " : " + score + "(C)" );
		}
		else if (score >= 60) {
			System.out.println(name + " : " + score + "(D)" );
			}
		else if (score < 60 && score >= 0){
			System.out.println(name + " : " + score + "(F)" );
		}
		else {
			System.out.println("다시 입력해주세요.");
		}// if
		
		System.out.println("저장하시겠습니까?");
		String acc = input.next();
		if(acc.equalsIgnoreCase("yes")) {
			System.out.println("저장성공.");
		}else {
			System.out.println("저장실패");
		}
		
	} // main method
} //class
