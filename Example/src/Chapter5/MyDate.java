package Chapter5;

import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	public MyDate(int day, int month, int year) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		switch (this.month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				if (day >= 0 && day <= 31) {
					this.day = day;
				} else {
					this.isValid = false;
				}
				break;
			case 2 :
				if ((this.year % 4 != 0 || this.year % 100 == 0) && this.year % 400 != 0) {
					if (day >= 0 && day <= 28) {
						this.day = day;
					} else {
						this.isValid = false;
					}
				} else if (day >= 0 && day <= 29) {
					this.day = day;
				} else {
					this.isValid = false;
				}
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				if (day >= 0 && day <= 30) {
					this.day = day;
				} else {
					this.isValid = false;
				}
				break;
			default :
				this.isValid = false;
		}

	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.isValid = false;
		}

	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if (year > Calendar.getInstance().get(1)) {
			this.isValid = false;
		} else {
			this.year = year;
		}

	}

	public String isValid() {
		return this.isValid ? "유효한 날짜입니다." : "유효하지 않은 날짜입니다.";
	}
}