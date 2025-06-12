package mbcboard.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.BoardExam;
import mbcboard.dao.MemberDAO;
import mbcboard.dto.MemberDTO;

public class MemberService {

	private MemberDAO memberDAO = new MemberDAO();
	private MemberDTO memberDTO = new MemberDTO();
	private MemberDTO loginMember = null;

	public void subMenu(Scanner inputStr) throws SQLException {
		
		boolean subRun = true;
		while (subRun) {
			System.out.println("MBC 아카데미 회원 서비스입니다");
			System.out.println("0. 회원 로그인");
			System.out.println("1. 회원가입");
			System.out.println("2. 전체회원목록조회");
			System.out.println("3. 개인회원상세조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>>");

			String subSelect = inputStr.next();

			switch (subSelect) {
			case "0":
				System.out.println("회원 로그인 메뉴입니다");
				LoginMember(memberDTO, memberDAO, inputStr);
				break;

			case "1":
				System.out.println("회원가입하기 메뉴입니다");
				AddMember(inputStr);
				break;
			case "2":
				System.out.println("전체회원목록 메뉴입니다");
				ReadALLMember(memberDTO, memberDAO, inputStr);
				break;
			case "3":
				System.out.println("개인회원 상세조회 메뉴입니다");
				readOne(memberDTO, memberDAO, inputStr);
				break;
			case "4":
				System.out.println("회원정보 수정 메뉴입니다");
				modifyMember(memberDTO, memberDAO, inputStr);
				break;
			case "5":
				System.out.println("회원삭제 메뉴입니다");
				deleteOne(memberDTO, memberDAO, inputStr);
				break;
			case "6":
				System.out.println("회원 메뉴 종료");
				memberDAO.connection.close(); // 게시판 종료 시 connection 종료
				subRun = false;
				break;
			default:
				System.out.println("1~6까지만 입력바랍니다");
				break;
			}// switch문 종료(부메뉴)
		} // while문 종료 (부메뉴)
	}

	private void deleteOne(MemberDTO memberDTO, MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		System.out.println("로그인 후 이용할 수 있는 서비스입니다");
		LoginMember(memberDTO, memberDAO, inputStr);
		if (loginMember != null) {
			memberDAO.deleteOne(loginMember.getMno(), loginMember.getId());
		} else {
			System.out.println("삭제 실패 : 로그인되지 않았습니다");
		}
	}

	private void LoginMember(MemberDTO memberDTO, MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		System.out.print("ID 입력 >>> ");
		String id = inputStr.next();
		System.out.print("비밀번호 입력 >>> ");
		String pw = inputStr.next();

		MemberDTO member = memberDAO.LoginMember(id, pw);
		if (member != null) {
			BoardExam.loginMember = member; //로그인 성공하면 boardexam필드에 저장됨
			this.loginMember = member;
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}

	private void modifyMember(MemberDTO memberDTO, MemberDAO memberDAO, Scanner inputStr) {
		System.out.print("수정할 ID >>> ");
		String id = inputStr.next();

		System.out.print("새 이름 >>> ");
		String bwriter = inputStr.next();

		System.out.print("새 비밀번호 >>> ");
		String pw = inputStr.next();

		memberDTO.setId(id);
		memberDTO.setbwriter(bwriter);
		memberDTO.setPw(pw);

		memberDAO.modifyMember(memberDTO); // DTO를 DAO로 전달
	}

	private void readOne(MemberDTO memberDTO, MemberDAO memberDAO, Scanner inputStr) throws SQLException {
	
		System.out.println("찾는 회원의 id를 입력하세요");
		System.out.println("id >>> ");
		String inputID = inputStr.next();
		
		memberDAO.readOne(inputID);

	}

	private void ReadALLMember(MemberDTO memberDTO, MemberDAO memberDAO, Scanner inputStr) {
		
		memberDAO.ReadAllMember();

	}

	private void AddMember(Scanner inputStr) throws SQLException {

		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();

		System.out.println("이름 >>> ");
		memberDTO.setbwriter(inputStr.next());

		System.out.println("id >>> ");
		memberDTO.setId(inputStr.next());

		System.out.println("비밀번호 >>> ");
		memberDTO.setPw(inputStr.next());

		memberDAO.addMember(memberDTO);
	}

}
