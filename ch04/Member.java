package ch04;

import java.util.Scanner;

public class Member {
	// 회원용 객체로 main() method는 exam에서 진행함

	// 클래스는 기본속성이 3가지 필요하다
	// 필드, 생성자, 메서드

	// 필드 : 객체가 가지고 있어야 할 값(변수)
	// 회원번호, id, 이름, 암호, 이메일주소, 집주소, 전화번호
	public int mno;
	public String id;
	public String pw;

	// 생성자 : Exam 클래스에서 main() 메서드에서 new로 호출할 때
	public Member() {
		// 기본생성자 : 클래스명과 같은 메서드
		// Member member = new Member();
	}

	// 메서드 : Member 클래스에서 행해지는 동작 CRUD
	public Member memberAdd(Scanner input) { // main에서 전달된 스캐너 객체

		Member member = new Member();// 리턴용 객체

		System.out.println("회원가입용 메서드입니다");
		System.out.println("회원번호를 입력하세요");
		System.out.println("(숫자)>>>");
		member.mno = input.nextInt();

		System.out.println("회원 id를 입력하세요");
		System.out.println(">>>");
		member.id = input.next();

		System.out.println("회원 pw를 입력하세요");
		member.pw = input.next();

		return member;

	}// memberAdd() method 종료

	public void memberAllList(Member[] members) {
		System.out.println("모든 회원 보기 리스트입니다");
		for (int i = 0; i < members.length; i++) {
			System.out.print("회원번호 : " + members[i].mno);
			System.out.print(" : 회원 id : " + members[i].id);
			System.out.print(" : 회원 pw : " + members[i].pw);
			System.out.println("============================");
		}
	}// memberAllList() method 종료

	public Member memberLogin(Scanner input, Member[] members) {
		System.out.println("로그인 메서드입니다");
		System.out.println("회원 id를 입력해주세요 >>>");
		String inputID = input.next();
		System.out.println("회원 pw를 입력해주세요 >>>");
		String inputPW = input.next();

		for (int i = 0; i < members.length; i++) {
			if (inputID.equals(members[i].id) && inputPW.equals(members[i].pw)) {
				System.out.println("로그인 성공");
				System.out.println("회원님의 회원 번호 : " + members[i].mno);

				return members[i]; // 일치하는 회원을 리턴함
			} // if
		} // for 반복 돎
		System.out.println("일치하는 회원 정보가 없습니다");
		return null;
	}// memberLogin() method 종료

	public void memberUpdate(Scanner input, Member[] members) {
		System.out.println("회원수정 메서드입니다");

		Member member = memberLogin(input, members);

		if (member == null) {
			System.out.println("회원을 찾을 수 없습니다");
			return;
		}
		System.out.println("새로운 id를 입력하세요 >>>");
		member.id = input.next();

		System.out.println("새로운 pw를 입력하세요 >>>");
		member.pw = input.next();

		System.out.println("회원님의 정보가 수정되었습니다");

	}// memberUpdate() method 종료

	public void memberDelete(Scanner input, Member[] members) {
		System.out.println("회원탈퇴 메서드입니다");

		Member member = memberLogin(input, members); // 로그인 기능 받아옴

		if (member == null) {
			System.out.println("회원을 찾을 수 없습니다");
			return;
		} // 로그인 안될 때 -> 회원정보 찾을 수 없음
		for (int i = 0; i < members.length; i++) {
			if (members[i] == member) {
				members[i] = null;
				System.out.println("회원탈퇴가 완료되었습니다");
				return;
			}//if 로그인 성공하면 회원탈퇴함
		} // for

	}// memberDelete() method 종료

}
