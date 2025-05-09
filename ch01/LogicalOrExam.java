package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("2의배수거나 3의배수?");
		System.out.println(">>>");
		int value = input.nextInt();
		
		if ((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2의 배수 또는 3의 배수입니다.");
		}
		else {
			System.out.println("2의 배수 또는 3의 배수가 아닙니다");
		}
	}
}
