package ch02;

import java.util.Scanner;

public class CalculatorExam {
	static int plus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	}
	static int minus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 - x3;
		return x4;
	}
	static int times(int x1, int x3) {
		int x4 = 0;
		x4 = x1 * x3;
		return x4;
	}
	static int divide(int x1, int x3) {
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	}
	
	
	public static void main(String[] args) {
		
		int x1 =0, x2 =0, x3=0, x4=0, x5=0;
		
		boolean run = true;
		String y1 = "연산기호";
		Scanner scInt = new Scanner(System.in);
		
		while(run) {
			if(x1==0) {
				System.out.println("숫자를 입력해주세요");
				x1 = scInt.nextInt();
			} // if
			System.out.println("부호를 선택해주세요.");
			System.out.println("1. +");
			System.out.println("2. -");
			System.out.println("3. x");
			System.out.println("4. %");
			
			x2 = scInt.nextInt();
			
			System.out.println("숫자를 입력해주세요");
			
			x3 = scInt.nextInt();
			
			
			switch(x2) {
			case 1:
				x4 = plus(x1,x3);
				y1 = "+";
				break;
			case 2:
				x4 = minus(x1,x3);
				y1 = "-";
				break;
			case 3:
				x4 = times(x1,x3);
				y1 = "x";
				break;
			case 4:
				x4 = divide(x1,x3);
				y1 = "/";
				break;
			}//switch(x2)
			
			System.out.println("계산결과 : " + x1 + " " + y1 + x3 + "=" + x4);
			
			boolean run2 = true;
			while(run2) {
				if(x4 != 0) {
					System.out.println("1.종료하기");
					System.out.println("2.다시하기");
					System.out.println("3.이어서 계산하기");
				}else {
					System.out.println("1.종료하기");
					System.out.println("2.다시하기");
				}//if 종료
				x5 = scInt.nextInt();
				
				switch(x5) {
				case 1:
					run = false;
					run2 = false;
				case 2:
					x1=0;
					x2=0;
					x3=0;
					run2 = false;
					break;
				case 3:
					x1=x4;
					x2=0;
					x3=0;
					run2 =false;
					break;
				default: 
					System.out.println("다시 입력해주세요");
					break;
				}//switch(x5)
					
			}//while(run2)
			
			
			
		} // while (run)
		

	}//main method

}//class
