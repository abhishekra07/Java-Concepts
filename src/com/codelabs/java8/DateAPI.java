package com.codelabs.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateAPI {

	public static void main(String[] args) {
		LocalDate localDate=LocalDate.now();
        System.out.println("Year: "+localDate.getYear());
        System.out.println("Month: "+localDate.getMonth());
        System.out.println("Day:"+localDate.getDayOfMonth());
        
        System.out.println("****************************************************");
        
        LocalTime localTime = LocalTime.now();
        System.out.println("Hour: " + localTime.getHour());
        System.out.println("Minute: " + localTime.getMinute());
        System.out.println("Second:" + localTime.getSecond());
        
        System.out.println("****************************************************");
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Year: "+localDateTime.getYear());
        System.out.println("Month: "+localDateTime.getMonth());
        System.out.println("Day:"+localDateTime.getDayOfMonth());
        System.out.println("Hour: "+localDateTime.getHour());
        System.out.println("Minute: "+localDateTime.getMinute());
        System.out.println("Second:"+localDateTime.getSecond());
        
        System.out.println("****************************************************");
        
        Date date = new Date();
        System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime());
        System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        
        System.out.println("****************************************************");
        
        Date date1 = new Date();
        System.out.println(new java.sql.Date(date1.getTime()).toLocalDate());
        
	}
}
