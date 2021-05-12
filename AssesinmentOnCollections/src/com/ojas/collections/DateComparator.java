package com.ojas.collections;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparator {
	private static int compareDates(LocalDate date1, LocalDate date2) {
		date1 = LocalDate.of(2021, 04, 24);
		date2 = LocalDate.of(2021, 04, 24);

		System.out.println("Date1: " + date1);
		System.out.println("Date2: " + date2);

		if (date1.isAfter(date2)) {
			return 2;
		} else if (date1.isBefore(date2)) {
			return 1;
		} else if (date1.isEqual(date2)) {
			return 0;
		} else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println(compareDates(null, null));

		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

		Scanner sc = new Scanner(System.in);

	}

}
