package ch05.grade.dto;

import java.util.Scanner;

public class PersonDTO {

	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	
	public String ID; 
	public String pw;
	
	//기본생성자
	public PersonDTO() {
		super();
	}

	//getter setter 메서드
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
}
