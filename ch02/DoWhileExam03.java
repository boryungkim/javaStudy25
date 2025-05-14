package ch02;

import java.util.Scanner;

public class DoWhileExam03 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*50) + 1;
		Scanner input = new Scanner(System.in);
		//System.out.println(answer);
		
		int question = 0;
		int hits = 0;
		
		System.out.println("=========================");
		System.out.println("업앤다운 게임에 오신 걸 환영합니다.");
		System.out.println("3번 안에 맞히면 상품을 제공합니다.");
		System.out.println("=========================");
		
		do {
			System.out.println("1부터 50사이의 숫자를 입력하세요");
			question = input.nextInt();
			hits ++;
		
		if(question > answer) {
			System.out.println("down");
		} else if (question < answer) {
			System.out.println("up");
		} 
		}while(question != answer);
		System.out.println("정답입니다" + answer);
		System.out.println("고객님이 맞춘 횟수는 : " + hits + "번입니다.");
		
		if(hits <=3) {
			System.out.println("상품 수령 : 관리자가 연락을 드립니다.");
		}else {
			System.out.println("실패!");
				}
		}
}
