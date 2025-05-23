package ch02;

public class SwitchNoBreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int time = (int) (Math.random()* 6) + 6;
		System.out.println("현재시간 : " + time + "시");
		
		switch(time) {
		case 6 :
			System.out.println("일어나서 세수를 합니다.");
		case 7 :
			System.out.println("아침식사를 합니다.");
		case 8: 
			System.out.println("학교에 갑니다");
		case 9:
			System.out.println("수업을 듣습니다.");
		case 10:
			System.out.println(".");
		default:
			System.out.println("�ڹٸ� ������ ����Ĩ�ϴ�.");
		}
	}

}
