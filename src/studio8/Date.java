package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * 
	 * @param month (1 to 12)
	 * @param day (1 to 31)
	 * @param year 
	 * @param holiday true if day is a holiday
	 */

	public Date(int month, int day, int year, boolean holiday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	public String toString() {
		return month + "/" + day + "/" + year + ", is a holiday is " + holiday + ".";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(day, month);
	}

	@Override
	public boolean equals(Object obj) { // equals if d/m are same, not if year
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month;
	}

	public static void main(String[] args) {
		
		Date halloween = new Date(10, 31, 2022, true);
		System.out.println("Halloween: " + halloween.toString());
		
		Date today = new Date(11, 17, 2022, false);
		System.out.println("Today: " + today.toString());
		
		Date birthday = new Date(11, 12, 2003, true);
		System.out.println("Birthday: " + birthday.toString());
		
		Date tomorrow = new Date(11, 18, 2022, false);
		System.out.println("Tomorrow: " + today.toString());
		
		Date valentines = new Date(2, 14, 2023, false);
		System.out.println("Valentine's Day: " + today.toString());
		
		System.out.println("Today is Halloween: " + halloween.equals(today));
		
		LinkedList<Date> dateList = new LinkedList<Date>();
		
		dateList.add(halloween);
		dateList.add(today);
		dateList.add(birthday);
		dateList.add(tomorrow);
		dateList.add(valentines);
		
		System.out.println(dateList);
		
		Date d1 = new Date(4, 19, 2028, false);
		Date d2 = new Date(4, 19, 2028, false);
		dateList.add(d1);
		dateList.add(d2);
		dateList.add(d1);
		System.out.println(dateList); // same date appears 3 times
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d1);
		System.out.println(set); // no repeats
		
		

    }

}
