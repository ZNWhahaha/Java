package com.znwhahaha.www;

import java.util.GregorianCalendar;

public class Zuoye8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gre = new GregorianCalendar();
		System.out.println(gre.get(GregorianCalendar.YEAR) + "��" +(gre.get(GregorianCalendar.MONTH)+1)
				 + "��" + gre.get(GregorianCalendar.DAY_OF_MONTH) + "��");
		gre.setTimeInMillis(1234567898765L);
		System.out.println(gre.get(GregorianCalendar.YEAR) + "��" + (gre.get(GregorianCalendar.MONTH)+1)
			+ "��" + gre.get(GregorianCalendar.DAY_OF_MONTH) + "��");
	}
}
