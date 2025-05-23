package ch03;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {

		Scanner inputInt = new Scanner(System.in);
		System.out.println("========엠비씨 성적처리=======");
		System.out.println("학생 수를 입력해주세요");
		System.out.print(">>>");

		int count = inputInt.nextInt();
		System.out.println(count + "명의 학생 성적을 입력하였습니다");

		String[] names = new String[count];
		int[] kors = new int[count];
		int[] mats = new int[count];
		int[] engs = new int[count];

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
				scoreAdd(names, kors, mats, engs);
				break;

			case 2:
				System.out.println("전체성적보기메뉴입니다");
				
				break;

			case 3:
				System.out.println("개인성적보기메뉴입니다");
				scoreRead(names, kors, mats, engs);
				break;

			case 4:
				System.out.println("성적수정하기메뉴입니다");
				scoreMod(names, kors, mats, engs);
				break;

			case 5:
				System.out.println("성적삭제하기메뉴입니다");
				scoreDel(names, kors, mats, engs);
				break;

			case 9:
				System.out.println("종료됩니다");
				run = false;
				break;

			default:
				System.out.println("다시입력해주세요");
				break;

			}// switch
		} // while (run)
	} // main method

	private static void scoreDel(String[] names, int[] kors, int[] mats, int[] engs) {
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("성적을 삭제하고 싶은 학생의 이름을 입력하세요");
		
		
	}//scoreDel method

	private static void scoreRead(String[] names, int[] kors, int[] mats, int[] engs) {
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("확인할 학생의 이름을 입력하세요");
		System.out.println(">>>");
		String name = inputStr.nextLine();
		int i;
		for(i=0; i < names.length; i++) {
			if(names[i].equals(name)) {
				System.out.println(names[i] + "학생 점수");
				System.out.println("===================");
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				break;				
			}else {
				System.out.println("일치하는 이름을 찾을 수 없습니다");
			}//if
			
		}//for

	}// scoreRead method

	static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("수정할 학생의 이름을 입력하세요");
		System.out.println(">>>");
		String name = inputStr.nextLine();
		int i;
		for (i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				System.out.println(names[i] + "학생 점수");
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				System.out.println("===================");
				System.out.println("수정할 점수를 입력하세요");
				System.out.print("국어수정점수 : ");
				kors[i] = inputInt.nextInt();

				System.out.print("수학수정점수 : ");
				mats[i] = inputInt.nextInt();

				System.out.print("영어수정점수 : ");
				engs[i] = inputInt.nextInt();

				System.out.println("수정이 완료되었습니다");

				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				System.out.println("===================");
				break;

			} else {
				System.out.println("일치하는 이름을 찾을 수 없습니다");
			} // if
			
		} // for

	}// scoreMod method

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		int i;
		for (i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요");
			System.out.println(">>>");
			names[i] = inputStr.next();

			System.out.println("국어성적을 입력하세요");
			System.out.println(">>>");
			kors[i] = inputInt.nextInt();
			

			System.out.println("수학성적을 입력하세요");
			System.out.println(">>>");
			mats[i] = inputInt.nextInt();

			System.out.println("영어성적을 입력하세요");
			System.out.println(">>>");
			engs[i] = inputInt.nextInt();

		} // for
		System.out.println("성적입력이 완료되었습니다");
	}// scoreAdd method

}// class
