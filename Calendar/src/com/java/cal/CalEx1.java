package com.java.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalEx1 {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Current Calendar Year:  " +calendar.get(Calendar.YEAR));
		System.out.println("Current Month Day :" +calendar.get(Calendar.DATE));
		int month = calendar.get(Calendar.MONTH);
		
		month++;
		System.out.println( "Month " +month);
		System.out.println( "H");
		
		Date date =  calendar.getTime();
		System.out.println("Util Date       "    +date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
	}

}
