package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("2�ǹ���ų� 3�ǹ��?");
		System.out.println(">>>");
		int value = input.nextInt();
		
		if ((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2�� ��� �Ǵ� 3�� ����Դϴ�.");
		}
		else {
			System.out.println("2�� ��� �Ǵ� 3�� ����� �ƴմϴ�");
		}
	}
}
