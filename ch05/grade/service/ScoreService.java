package ch05.grade.service;

import java.util.Scanner;

public class ScoreService {

	public static void scoreDel(Scanner inputStr, Scanner inputInt, String[] names, int[] score) {

		System.out.println("성적을 삭제하고 싶은 학생의 이름을 입력하세요");
		System.out.println(">>>");
		String name = inputStr.nextLine();
	
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				score[i] = 0;
				System.out.println(names[i] + "님의 성적이 0으로 초기화되었습니다");
				System.out.println("재입력 바랍니다");
				break;
			} else {
				System.out.println("일치하는 이름을 찾을 수 없습니다");
			}//if 
		}//for

	}// scoreDel method

	public static void scoreReadi(Scanner inputStr, Scanner inputInt, String[] names, int[] score) {
		
		System.out.println("확인할 학생의 이름을 입력하세요");
		System.out.println(">>>");
		String name = inputStr.nextLine();
	
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				System.out.println(names[i] + "학생 점수");
				System.out.println("점수 : " + score[i]);
				System.out.println("===================");
				break;
			} else {
				System.out.println("일치하는 이름을 찾을 수 없습니다");
			} // if

		} // for

	}// scoreReadi method

	public static void scoreMod(Scanner inputStr, Scanner inputInt, String[] names, int[] score) {


		System.out.println("수정할 학생의 이름을 입력하세요");
		System.out.println(">>>");
		String name = inputStr.nextLine();
	
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				System.out.println(names[i] + "학생 점수");
				System.out.println("성적 : " + score[i]);
				System.out.println("===================");
				System.out.println("수정할 점수를 입력하세요");
				System.out.print("수정점수 : ");
				score[i] = inputInt.nextInt();

				System.out.println("수정이 완료되었습니다");

				System.out.println("성적 : " + score[i]);
				System.out.println("===================");
				break;

			} else {
				System.out.println("일치하는 이름을 찾을 수 없습니다");
			} // if

		} // for

	}// scoreMod method

	public static void scoreAdd(Scanner inputStr, Scanner inputInt, String[] names, int[] score) {


		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요");
			System.out.println(">>>");
			names[i] = inputStr.next();
					

			System.out.println("성적을 입력하세요");
			System.out.println(">>>");
			score[i] = inputInt.nextInt();

		} // for
		
		System.out.println("성적입력이 완료되었습니다");
	}// scoreAdd method

	public static void scoreReada(Scanner inputStr, Scanner inputInt, String[] names, int[] score) {
		
		System.out.println("전체 학생의 성적정보를 가져옵니다");
		System.out.println("===================");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "학생 점수");
			System.out.println("점수 : " + score[i]);
			System.out.println("===================");
		}
	}
}
