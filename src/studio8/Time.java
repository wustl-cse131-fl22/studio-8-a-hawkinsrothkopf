package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean armytime;
	
/**
 * 
 * @param hour (0 to 23)
 * @param minute (0 to 23)
 * @param armytime 
 */
	public Time(int hour, int minute, boolean armytime) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.armytime = armytime;
	}
	
	public String toString() {
		if (this.armytime) {
			return hour + ":" + minute;
		} else {
			if (this.hour > 12) {
				return (hour - 12) + ":" + minute + "PM";
			} else {
				return hour + ":" + minute + "AM";
			}
		}
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) { // equal if same hour/minute, armytime not important
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		
		Time lunch = new Time(12, 30, false);
		System.out.println("Lunchtime: " + lunch.toString());
		
		Time sleep = new Time(22, 15, true);
		System.out.println("Bedtime: " + sleep.toString());
		
		Time rem = new Time(23, 45, false);
		System.out.println("REM Sleep: " + rem.toString());
		
		Time wake = new Time(7, 30, false);
		System.out.println("Wake up: " + wake.toString());
		
		Time breakfast = new Time(8, 45, false);
		System.out.println("Breakfast: " + breakfast.toString());
		
		System.out.println("Lunchtime is bedtime: " + lunch.equals(sleep));
    	
    }

}