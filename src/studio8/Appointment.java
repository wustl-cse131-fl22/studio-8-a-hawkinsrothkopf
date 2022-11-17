package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	
	private Date date;
	private Time time;

	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time); // delegates
	}
	

	@Override
	public String toString() {
		return "Appointment on " + date + " at " + time;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date doctordate = new Date(12, 22, 2022, false);
		Time doctortime = new Time(14, 30, false);
		
		Appointment doctor = new Appointment(doctordate, doctortime);
		
		Date anniversarydate = new Date(3, 2, 2022, false);
		Time anniversarytime = new Time(13, 0, true);
		
		Appointment anniversary = new Appointment(anniversarydate, anniversarytime);
		
		LinkedList<Appointment> appointmentList = new LinkedList<Appointment>();
		
		appointmentList.add(doctor);
		appointmentList.add(anniversary);
		
		System.out.println(appointmentList);

	}

}
