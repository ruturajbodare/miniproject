package Enum;

public enum Days2 {
	MONDAY(0),
	TUESDAY(1),
	WEDNESDAY(2),
	THRUSDAY(3),
	FRIDAY(4),
	SATURDAY(5),
	SUNDAY(6);
	int daysindex;
	Days2(int daysindex)
	{
		this.daysindex=daysindex;
	}
	public int getDaysindex() {
		return daysindex;
	}
	public void setDaysindex(int daysindex) {
		this.daysindex = daysindex;
	}
	

}

