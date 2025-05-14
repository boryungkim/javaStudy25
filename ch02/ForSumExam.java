package ch02;

import java.util.Scanner;

public class ForSumExam {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("최대값을 입력하세요.");
		int max = inputInt.nextInt();
		
		System.out.println("최소값을 입력하세요.");
		int min = inputInt.nextInt();
		
		int sum = 0;
		int i = min;
		for( ; i <=max; i++) {
			sum = sum + i;
		}
		System.out.println("1~" + (i-1) + "까지의 합 : " + sum);
	}

}
