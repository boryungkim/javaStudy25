package ch01;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double w = 0;
		double h = 0;
		double area = w * h;
		
		Scanner input = new Scanner (System.in);
		System.out.println("���簢���� ���� ����");
		w = input.nextDouble();
		System.out.println("���簢���� ���� ����");
		h = input.nextDouble();
		
		System.out.println("���簢���� ���� : " + area);
		
	}

}
