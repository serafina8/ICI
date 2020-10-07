package Tch;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class tch_01_CalendarEx {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		//Calendar date = Calendar.getInstance();
		GregorianCalendar date = new GregorianCalendar();
		
		System.out.println(date.get(Calendar.YEAR)+"³â"
				+(date.get(Calendar.MONTH)+1)+"³â"
				+date.get(Calendar.DAY_OF_MONTH)+"³â");
		System.out.println(System.currentTimeMillis());
	}

}
