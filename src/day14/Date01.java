package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 시간 클래스
		/* Date 클래스 => Deprecated(비권장)
		 * Calender 클래스
		 * LocalDate 클래스
		 * */
		
		// Date 클래스 => Deprecated(비권장)
		Date date = new Date(); // 오늘 날짜 리턴
		System.out.println(date);
		date.getDate();
		System.out.println(date.getDate());
		
		// Calender 클래스
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println(year + " " + month + " " + day);
		
		// LocalDate 클래스
		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);
		
		LocalDateTime local = LocalDateTime.now();
		System.out.println(local.getYear());
		System.out.println(local.getMonth());
		System.out.println(local.getMonthValue());
		System.out.println(local.getDayOfMonth());
		
		System.out.println(local.toLocalDate());
		System.out.println(local.toLocalTime());
		
		LocalDateTime birth = LocalDateTime.of(1993, 6, 18, 9, 00);
		System.out.println(birth);
		
		// yyyy MM dd hh:mm:ss
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
	}

}
