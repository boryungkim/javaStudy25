package ch02;

public class IfNestedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = (int)(Math.random()*20) + 81;
		
		System.out.println(" 점수 : " + score);
		String grade;
		if (score >=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}//
		}//90 if 종료
		else {
			if(score>=85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}//else

	}//method

}//class
