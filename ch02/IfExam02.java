package ch02;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주민번호를 입력하세요.");
		Scanner input = new Scanner(System.in);
		String ssn = input.next();
		
		char ssn2 = ssn.charAt(6);
		int num = Character.getNumericValue(ssn2);
		if(num%2 == 0) {
			System.out.println("여자");
		} else if (num%2 == 1) {
			System.out.println("남자");
		} else {
			System.out.println("인식불가");
		}

	}

}
