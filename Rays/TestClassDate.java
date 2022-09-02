package com.Rays;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClassDate {
public static void main(String[] args) throws ParseException {
	Date d=new Date();
	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	String sd = sdf.format(d);
	System.out.println(sd);
	String dd = "26/03/2022";
			Date d1  = sdf.parse(dd);
			System.out.println(d1);
			}
}
