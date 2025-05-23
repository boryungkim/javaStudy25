package ch02;

import java.util.Scanner;

public class WhileExam02 {

	public static void main(String[] args) {

		Scanner inputInt = new Scanner(System.in);
		Scanner inputChar = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("=======엠비씨성적처리======");
			System.out.println("1.교직원관리");
			System.out.println("2.학생관리");
			System.out.println("3.성적관리");
			System.out.println("9.프로그램 종료");
			System.out.println("(1~9)>>>>>");
			int selectInt = inputInt.nextInt();

			switch (selectInt) {
			case 1:
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

					switch (subSelect) {
					case 'a':
					case 'A':
						System.out.println("교직원등록메뉴로 진입");
						System.out.println("새로 등록하시겠습니까? >>");
						String newmember = inputStr.next();
						if (newmember.equalsIgnoreCase("yes")) {
							System.out.println("등록할 이름을 입력해주세요.");
							String newname = inputStr.next();
							System.out.println(newname + "님 등록이 완료되었습니다.");
						} // if종료
						else {
						System.out.println("등록실패");
						}
						break;
					case 'b':
					case 'B':
						System.out.println("교직원보기메뉴로 진입");
						// 교직원보기코드 작성
						break;
					case 'c':
					case 'C':
						System.out.println("교직원수정메뉴로 진입");
						// 교직원수정코드 작성
						break;
					case 'd':
					case 'D':
						System.out.println("교직원삭제메뉴로 진입");
						// 교직원삭제코드 작성
						break;
					case 'z':
					case 'Z':
						System.out.println("교직원메뉴를 종료합니다.");
						subRun = false;
						break;
					default: // 위 조건에 해당하지 않는 값
						System.out.println("1~3까지 입력 바랍니다.");
						break;

					} // switch (subSelect)

				} // while (subRun)

			}// switch (selectInt)

		} // while (run)

	}

}
