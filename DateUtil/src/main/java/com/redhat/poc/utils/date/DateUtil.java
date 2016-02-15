package com.redhat.poc.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
	
	public static void main(String[] args) {

		Date dob = convertStrDate("7/21/1980");
		
		System.out.println(DateUtil.calculateNumberOfYears(dob, new Date()));

	}
	
	public static Date convertStrDate(String strDate) {
		
		 	Date date = null;
			try {
				date = sdf.parse(strDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        return date;		
		
	}
	
	public static int calculateNumberOfYears(Date startDate, Date endDate) {
		
		int years = 0;
		
		if ( startDate != null && endDate != null ) {
			
			years = (int)( (endDate.getTime() - startDate.getTime()) 
	                 / (1000 * 60 * 60 * 24) ) / 365;
			
		}
		
		return years;
		
	}

}
