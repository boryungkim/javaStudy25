package ch02;

import java.util.Scanner;

public class SwitchIfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("번호를 입력해주세요");
		System.out.println("1. ");
		int myNum1 = input.nextInt();
		
		System.out.println("번호를 입력해주세요");
		System.out.println("2. ");
		int myNum2 = input.nextInt();
	
		System.out.println("번호를 입력해주세요");
		System.out.println("3. ");
		int myNum3 = input.nextInt();
		
		System.out.println("번호를 입력해주세요");
		System.out.println("4. ");
		int myNum4 = input.nextInt();
		
		System.out.println("번호를 입력해주세요");
		System.out.println("5. ");
		int myNum5 = input.nextInt();
		
		System.out.println("번호를 입력해주세요");
		System.out.println("6. ");
		int myNum6 = input.nextInt();
		
		int num1 = (int)(Math.random()* 45) + 1;
		int num2 = (int)(Math.random()* 45) + 1;
		int num3 = (int)(Math.random()* 45) + 1;
		int num4 = (int)(Math.random()* 45) + 1;
		int num5 = (int)(Math.random()* 45) + 1;
		int num6 = (int)(Math.random()* 45) + 1;
		
		int x = 0;
		
		if (mynum1 == num1|| mynum1 == num2 || mynum1 == num3 || mynum1 == num4 || mynum1 == num5 || mynum1 ==num6) {
			++x;
		}
		if (mynum2 == num1|| mynum2 == num2 || mynum2 == num3 || mynum2 == num4 || mynum2 == num5 || mynum2 ==num6) {
			++x;
		}
		if (mynum3 == num1|| mynum3 == num2 || mynum3 == num3 || mynum3 == num4 || mynum3 == num5 || mynum3 ==num6) {
			++x;
		}
		if (mynum4 == num1|| mynum4 == num2 || mynum4 == num3 || mynum4 == num4 || mynum4 == num5 || mynum4 ==num6) {
			++x;
		}
		if (mynum5 == num1|| mynum5 == num2 || mynum5 == num3 || mynum5 == num4 || mynum5 == num5 || mynum5 ==num6) {
			++x;
		}
		if (mynum6 == num1|| mynum6 == num2 || mynum6 == num3 || mynum6 == num4 || mynum6 == num5 || mynum6 ==num6) {
			++x;
		}
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " +num6+ " ");
		
		
		
		
		
		
		
		
		

	}

}
