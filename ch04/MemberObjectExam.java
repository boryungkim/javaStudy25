package ch04;

import java.util.Scanner;

public class MemberObjectExam { // 배열 main에서

	public static void main(String[] args) { // 필드(전역변수) -> 클래스에 선언함 
											 // 지역변수 -> method안에 있는 거 parameter
		// Member 클래스를 호출하여 처리해보자.

		Scanner input = new Scanner(System.in);
		Member[] members = null;

		System.out.println("가입할 회원 수를 입력하세요");
		System.out.println(">>>");
		int count = input.nextInt();

		members = new Member[count]; // 키보드로 입력한 숫자만큼 배열 생성

		System.out.println("회원가입 프로그램을 시작합니다");

		boolean run = true;

		while (run) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원전체보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("1~5까지만 입력하세요 (다른키가 눌리면 꺼집니다)");
			System.out.print(">>>");
			
			int select = input.nextInt();

			switch (select) {
			case 1:
				
				Member member1 = new Member(); // 객체 생성
				for(int i = 0; i < members.length; i++) {
					member1 = member1.memberAdd(input); // 생성된 객체 메서드 호출 및 실행
					members[i] = member1;	
				}
				break;

			case 2:
				Member member2 = new Member(); // 객체 생성
				member2.memberAllList(members); // 전체보기 메서드 실행
				break;

			case 3:
				Member member3 = new Member(); // 객체 생성
				member3.memberLogin(input, members); // 로그인 실행
				break;

			case 4:
				Member member4 = new Member(); // 객체 생성
				member4.memberUpdate(input, members);
				; // 회원수정 실행
				break;

			case 5:
				Member member5 = new Member(); // 객체 생성
				member5.memberDelete(input, members);
				; // 회원탈퇴 실행
				break;

			default:
				System.out.println("회원가입 프로그램 종료");
				run = false;

			}// 스위치문 종료

		} // while(run)

	}//main method

}//class
