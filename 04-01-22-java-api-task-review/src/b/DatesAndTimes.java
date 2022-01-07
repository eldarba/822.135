package b;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesAndTimes {

	public static void main(String[] args) {

		Date date1 = new Date();
		Date date2 = new Date(0); // 1/1/1970 midnight

		System.out.println(date1);
		System.out.println(date2);

		System.out.println("============================");

		java.sql.Date date3 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(date3);

		System.out.println("============================");
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);

		Calendar cal2 = new GregorianCalendar(2020, Calendar.JANUARY, 25);
		Date date4 = cal2.getTime();
		System.out.println(date4);

		System.out.println("============================");
		LocalTime time1 = LocalTime.of(10, 30, 25);
		System.out.println(time1);
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);

		System.out.println("============================");
		LocalDate lDate1 = LocalDate.now();
		System.out.println(lDate1);
		LocalDate lDate2 = LocalDate.of(1986, 1, 25);
		System.out.println(lDate2);

		System.out.println("============================");
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);
		LocalDateTime dateTime2 = LocalDateTime.of(2000, 5, 15, 10, 30);
		System.out.println(dateTime2);
		LocalDateTime dateTime3 = LocalDateTime.of(lDate1, time1);
		System.out.println(dateTime3);

		System.out.println("============================");
		System.out.println("convert LocalDate to java.sql.Date");
		java.sql.Date sqlDate = java.sql.Date.valueOf(lDate1);
		System.out.println(sqlDate);

		System.out.println("convert java.sql.Date to LocalDate");
		LocalDate ld = sqlDate.toLocalDate();
		System.out.println(ld);

		System.out.println("============================");
		LocalTime lt = LocalTime.parse("23:10:30");
		System.out.println(lt);

		LocalDate ld2 = LocalDate.parse("2007-12-03");
		System.out.println(ld2);

	}

}
