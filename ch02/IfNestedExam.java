package ch02;

public class IfNestedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = (int)(Math.random()*20) + 81;
		
		System.out.println("�������� : " + score);
		String grade;
		if (score >=90) {
			if(score>=95) {
				grade = "A+";ㄴ
			} else {
				grade = "A";
			}//if�� �� else ����
		}//90 if ����
		else {
			if(score>=85) {
				grade = "B+";
			}//else �� if ����
			else {
				grade = "B";
			}//else �� else ����
		}//else

	}//method

}//class
