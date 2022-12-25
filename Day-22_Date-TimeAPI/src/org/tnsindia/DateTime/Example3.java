package org.tnsindia.DateTime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Example3 {

	public static void main(String[] args) {
		OffsetDateTime d=OffsetDateTime.now();
		OffsetTime c=OffsetTime.now();
		System.out.println(c);
		System.out.println(d);

	}

}
