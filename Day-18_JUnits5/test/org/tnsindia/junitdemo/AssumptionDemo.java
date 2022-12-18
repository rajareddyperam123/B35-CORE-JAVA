package org.tnsindia.junitdemo;

import org.junit.jupiter.api.Assumptions;

import org.junit.jupiter.api.Test;


class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("rajareddy", "vanaja");
		
		//Execute the body when the positive condition  else test will be skipped
		Assumptions.assumeTrue("vijay".equals(System.getProperty("rajareddy")));
	}
	
	@Test
	void display() {
		System.setProperty("rajareddy", "vanaja");
		
		//Execute the body when the negative condition  else test will be skipped
		Assumptions.assumeFalse("kavitha".equals(System.getProperty("rajareddy")));
	}
	@Test
	void display1() {
		System.setProperty("rajareddy", "vanaja");
		
		//Execute the body when the negative condition  else test will be skipped
		Assumptions.assumingThat("pranaya".equals(System.getProperty("rajareddy")), null);
	
	}

}	
