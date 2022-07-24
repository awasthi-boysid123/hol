package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CheckDateAndTime {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//To check current date
		Date d = new Date();
		String g = d.toString();
		System.out.println(g);
		
		//To change Format(you can set format accordingly)
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		//System.out.println(sdf.format(d));
		System.out.println(sdf.format(d));
		
		//To check if current year is leap year
		GregorianCalendar gl = new GregorianCalendar();
		System.out.println(gl.isLeapYear(2020));
		
		Calendar cal = Calendar.getInstance();
		int s = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(s);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.PM));
		

	}

}
