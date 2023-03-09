package Inheritance;

public class staff extends person {
	int attendance;
	int experince;
	String subject;
	public staff()
	{
		
	}
	public staff(int id, String name, String address, String city, String state
			,int attendance, int experince, String subject) {
		super(id,name,address,city,state);
		this.attendance = attendance;
		this.experince = experince;
		this.subject = subject;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getExperince() {
		return experince;
	}
	public void setExperince(int experince) {
		this.experince = experince;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return super.toString()+"staff [attendance=" + attendance + ", experince=" + experince + ", subject=" + subject + "]";
	}
	
}
