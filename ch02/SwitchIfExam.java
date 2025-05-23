package ch02;

import java.util.Scanner;

public class SwitchIfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("고사장 번호를 알려줍니다.");
		System.out.println("수험번호를 입력하세요 >>>");
		Scanner number = new Scanner(System.in);
		
		char classnum = number.next().charAt(0);
		
		//System.out.println(classnum);
		
		switch(classnum) {
		case '1' : case '2' : case '3':
			System.out.println("제1고사장");
			break;
		case '4' : case '5' : case '6':
			System.out.println("제2고사장");
			break;
		case '7' : case '8' : case '9':
			System.out.println("제3고사장");
			break;
		default:
			System.out.println("다시입력하시려면 yes를 입력해주세요.");
			String retry = number.next();
			if(retry.equalsIgnoreCase("yes")) {
				System.out.println("수험번호를 입력해주세요.");
				char reclassnum = number.next().charAt(0);
				
				//System.out.println(reclassnum);
				
				switch (reclassnum) {
				case '1' : case '2' : case '3':
					System.out.println("제1고사장");
					break;
				case '4' : case '5' : case '6':
					System.out.println("제2고사장");
					break;
				case '7' : case '8' : case '9':
					System.out.println("제3고사장");
					break;
				default:
					System.out.println("인식에 실패하였습니다.");
					break;
				}
				}//if
				else{
					System.out.println("경고 : 수험 전까지 고사장을 확인해주세요.");
					
				} //else
			
			
			
 		
		}//switch
		

	}//main method

}//class
