package ch03;

import java.util.Scanner;

public class ArrayScoreExam {

	public static void main(String[] args) {

		Scanner inputInt = new Scanner(System.in);

		System.out.println("학생 수를 입력해주세요");
		System.out.print(">>>");

		int count = inputInt.nextInt();
		String[] names = new String[count];

		names = student(names);

	} // main method

	public static String[] student(String[] names) {
		
		Scanner inputInt = new Scanner (System.in);
		Scanner inputStr = new Scanner (System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("=================학생관리 메뉴=================");
			System.out.println("1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 메인메뉴");
			System.out.println("===========================================");
			System.out.print(">>>");
			
			int select = inputInt.nextInt();
			switch(select) {
			case 1:
				System.out.println("등록메뉴입니다");
				System.out.println("총 학생수는" + names.length);
				
				for(int i=0; i< names.length; i++) {
					System.out.println((i+1) + "번째 학생의 이름을 입력하세요");
					names[i] = inputStr.next();
				}//for
				System.out.println("학생 등록 완료");
				break;
				
			case 2:
				System.out.println("학생명부를 불러옵니다");
				System.out.println("총 학생수는" + names.length);
				for(int i=0; i<names.length; i++) {
					System.out.println((i+1)+"번 : " + names[i]);
				}
				break;
				
			case 3:
				System.out.println("학생이름 수정 : ");
				System.out.println("수정할 학생 번호를 입력하세요 : ");
				int nameNum = inputInt.nextInt();
				System.out.println("수정할 학생 이름을 입력하세요 : ");
				String nameMOD = inputStr.next();
				names[nameNum - 1] = nameMOD;
				System.out.println("수정완료");
				break;
				
			case 4:
				System.out.println("삭제할 학생 번호를 입력하세요");
				int deleteNum = inputInt.nextInt();
				names[deleteNum - 1] = null;
				break;
				
			case 5:
				System.out.println("메인메뉴로 돌아갑니다");
				run = false;
				break;
				
				default:
					System.out.println("다시 입력해주세요");
					break;
				
				
			}//switch(select)

		}//while(run)
		
		return names;
		
	}//student 메서드 종료

}//class
