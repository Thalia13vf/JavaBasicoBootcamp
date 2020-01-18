package basico.datas.calendar;

import java.util.Calendar;

public class ExCalendar2 {
	public static void main(String[] args) {
		//Formatação de datas com Calendar
		Calendar agora = Calendar.getInstance();
		
		System.out.printf("%tc\n", agora);
		//qui jan 16 18:55:03 BRT 2020
		
		System.out.printf("%tF\n", agora);
		//2020-01-16
		
		System.out.printf("%tD\n", agora);
		//01/16/20
		
		System.out.printf("%tr\n" ,agora);
		//06:59:11 PM
		
		System.out.printf("%tT\n" ,agora);
		//19:00:21
		
		
	}
}
