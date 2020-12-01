package sec02.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.print(day + "��");
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
		case Calendar.WEDNESDAY:
			strWeek = "��";
		case Calendar.THURSDAY:
			strWeek = "��";
		case Calendar.FRIDAY:
			strWeek = "��";
		case Calendar.SATURDAY:
			strWeek = "��";
		default:
			strWeek = "��";
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		}else {
			strAmPm = "����";
		}
		
		System.out.print(strAmPm + " ");
		
		int hour = now.get(Calendar.HOUR);
		int mintue = now.get(Calendar.MINUTE);
		int secod = now.get(Calendar.SECOND);
		
		System.out.print(hour + "�� ");
		System.out.print(mintue + "�� ");
		System.out.print(secod + "�� ");
		
	
	}

}