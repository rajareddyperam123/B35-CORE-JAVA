package org.tnsindia.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		LocalDate a=LocalDate.now();
		LocalTime b=LocalTime.now();
		LocalDateTime obj1=LocalDateTime.now();
		LocalDate c=LocalDate.of(2022, 2, 18);
		System.out.println(obj1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
