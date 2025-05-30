package ch05.grade.dto;

public class TeacherDTO extends PersonDTO {
	private String teacherID; //교직원번호
	private int grade;			// 담당학년
	private int room;			// 담당교실
	private int Stcount;
	
	//기본 생성자
	public TeacherDTO() {
		super();
	}

	//GETTER SETTER
	
	public String getTeacherID() {
		return teacherID;
	}


	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getRoom() {
		return room;
	}


	public void setRoom(int room) {
		this.room = room;
	}


	public int getStcount() {
		return Stcount;
	}


	public void setStcount(int stcount) {
		Stcount = stcount;
	}	
	
	
	
	
	
	
}
