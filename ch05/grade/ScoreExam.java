package ch05.grade;

import java.util.Scanner;

import ch05.grade.dto.StudentDTO;
import ch05.grade.dto.TeacherDTO;
import ch05.grade.service.ScoreService;

public class ScoreExam {
	public static StudentDTO[] studentDTOs = new StudentDTO[30];
	public static TeacherDTO[] teacherDTOs = new TeacherDTO[20];
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	 
	static {
		
	}
	
	public static void main(String[] args) {

		System.out.println("========성적처리=======");
		System.out.println("학생 수를 입력해주세요");
		System.out.print(">>>");

		int count = inputInt.nextInt();
		System.out.println(count + "명의 학생 성적을 입력하였습니다");

		String[] names = new String[count];
		int[] score = new int[count];
		
		boolean run = true;
		while (run) {
			System.out.println("=======성적처리========");
			System.out.println("1.성적입력");
			System.out.println("2.전체성적보기");
			System.out.println("3.개인성적보기");
			System.out.println("4.성적수정하기");
			System.out.println("5.성적삭제하기");
			System.out.println("9.성적프로그램 종료");
			System.out.println(">>>>");

			int select = inputInt.nextInt();

			switch (select) {
			case 1:
				System.out.println("성적입력메뉴입니다");
				ScoreService scoreService = new ScoreService();
				ScoreService.scoreAdd(inputStr, inputInt, names, score);
				break;

			case 2:
				System.out.println("전체성적보기메뉴입니다");
				ScoreService scoreService2 = new ScoreService();
				ScoreService.scoreReada(inputStr, inputInt, names, score);
				break;

			case 3:
				System.out.println("개인성적보기메뉴입니다");
				ScoreService scoreService3 = new ScoreService();
				ScoreService.scoreReadi(inputStr, inputInt, names, score);
				break;

			case 4:
				System.out.println("성적수정하기메뉴입니다");
				ScoreService scoreService4 = new ScoreService();
				ScoreService.scoreMod(inputStr, inputInt, names, score);
				break;

			case 5:
				System.out.println("성적삭제하기메뉴입니다");
				ScoreService scoreService5 = new ScoreService();
				ScoreService.scoreDel(inputStr, inputInt, names, score);
				break;

			case 9:
				System.out.println("종료되었습니다");
				run = false;
				break;

			default:
				System.out.println("다시 입력해주세요");
				break;

			}// switch
		} // while (run)
	} // main method

}