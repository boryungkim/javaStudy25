package ch05.grade.dto;

import java.util.Scanner;

public class StudentDTO extends PersonDTO {

	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);

	public String studentNumber; // 학번
	public int grade; // 학년
	public int gpa; // 학점

	// 생성자
	public StudentDTO(String studentNumber, int grade, int gpa) {
		super();
		this.studentNumber = studentNumber;
		this.grade = grade;
		this.gpa = gpa;
	}

	public StudentDTO() {
		super();
	}

	// getter setter 메서드

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

}
