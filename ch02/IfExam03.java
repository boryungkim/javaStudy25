package ch02;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else { 
			System.out.println("홀수");
		}
		
	}

}
