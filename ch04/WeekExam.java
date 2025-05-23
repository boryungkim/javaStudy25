package ch04;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar calendar = Calendar.getInstance(); //instance -> 객체
		//타입       변수       객체 . 메서드
		//캘린더 타입의 객체가 만들어지면서 Calendar라는 변수에 들어간다
		
		int year = calendar.get(Calendar.YEAR);
		//정수 타입의 year 변수에 캘린더에서 가져온 년도 값을 넣는다.
		System.out.println("올해 연도 : " + year);
		
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println("현재 월은 " + month + "월 입니다.");
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("오늘은 " + day + "일 입니다");
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘은 " + week + "요일입니다");
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
			
		case 2:
			today = Week.MONDAY; break;
		
		
		case 3:
			today = Week.TUESDAY; break;
			
		case 4 :
			today = Week.WEDNESDAY; break;
			
		case 5 :
			today = Week.THURSDAY; break;
			
		case 6 :
			today = Week.FRIDAY; break;
			
		case 7 :
			today = Week.SATURDAY; break;
			
		}
		System.out.println("현재 날짜는 " + year + "년 " + month + "월 " + day + "일 (" + today + ")");
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println("현재시간은 " + hour + "시 " + minute + "분 " + second + "초 입니다");
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일입니다. 집안일을 합시다");
		} else if (today == Week.MONDAY) {
			System.out.println("월요일입니다");
		}else if (today == Week.TUESDAY) {
			System.out.println("화요일입니다");
		}else if (today == Week.WEDNESDAY) {
			System.out.println("수요일입니다");
		}else if (today == Week.THURSDAY) {
			System.out.println("목요일입니다");
		}else if (today == Week.FRIDAY) {
			System.out.println("금요일입니다");
		}else if (today == Week.SATURDAY) {
			System.out.println("토요일입니다");
		}//if

	}//main method

}//class
