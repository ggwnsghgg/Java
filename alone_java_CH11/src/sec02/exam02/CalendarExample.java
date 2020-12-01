package sec02.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.print(day + "일");
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
		case Calendar.WEDNESDAY:
			strWeek = "수";
		case Calendar.THURSDAY:
			strWeek = "목";
		case Calendar.FRIDAY:
			strWeek = "금";
		case Calendar.SATURDAY:
			strWeek = "토";
		default:
			strWeek = "일";
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		System.out.print(strAmPm + " ");
		
		int hour = now.get(Calendar.HOUR);
		int mintue = now.get(Calendar.MINUTE);
		int secod = now.get(Calendar.SECOND);
		
		System.out.print(hour + "시 ");
		System.out.print(mintue + "분 ");
		System.out.print(secod + "초 ");
		
	
	}

}
