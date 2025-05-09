package ch01;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력 >>>");
		
		int score = input.nextInt();
		if (( score <= 100) && (score >= 90)) {
			System.out.println("A");
			}
		else if ((score < 90) && (score >= 80)) {
			System.out.println("B");
			}
		else if ((score < 80) && (score >= 70)){
			System.out.println("C");
			}
		else {
			System.out.println("F");
		}	
	}
}
