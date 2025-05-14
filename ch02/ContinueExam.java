package ch02;

public class ContinueExam {

	public static void main(String[] args) {
		int i = 0;
		for(i = 1; i <=10; i++) {
			if(i%2 != 0) {
				continue;
			}//if
			System.out.println(i);
		}//for
		
	}//main method

}//class
