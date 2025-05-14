package ch02;

public class For2to9Exam {

	public static void main(String[] args) {
		
		for (int m=2; m<=9; m++) {
			System.out.println("========"+m+"단=========");
			for (int n = 1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}//안쪽 for문
			
		}//바깥쪽 for문

	}//main method

}//class
