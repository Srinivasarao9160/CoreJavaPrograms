package com.ojas.collections;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class MonthPrinter {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter month and year");
//		int month = sc.nextInt();
//		int year = sc.nextInt();

		YearMonth ym = YearMonth.of(2012,1);

		String fd = ym.atDay(1).getDayOfWeek().name();
		String ld = ym.atEndOfMonth().getDayOfWeek().name();

		System.out.println(fd);

		System.out.println(ld);
	}
}

//	public static  void getMonthCalendar(int year,int month) {
//		YearMonth ym = YearMonth.of(year, month);
//		String fd = ym.atDay(1).getDayOfWeek().name();
//		String ld = ym.atEndOfMonth().getDayOfWeek().name();
//		System.out.println(fd);
//		System.out.println(ld);
//	}
//	
//	public static void main(String[] args) {
//		getMonthCalendar(5, 2020);
//	}
