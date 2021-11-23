package d.enums;

public class Calendar {

	private int month;
	private int year;
	private int dayInMonth;
	private Day dayOfWeek;

	public Calendar(int month, int year, int dayInMonth, Day dayOfWeek) {
		super();
		this.month = month;
		this.year = year;
		this.dayInMonth = dayInMonth;
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Calendar [month=" + month + ", year=" + year + ", dayInMonth=" + dayInMonth + ", dayOfWeek=" + dayOfWeek
				+ "]";
	}

	// enum declaration can be nested in a class declaration
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

}
