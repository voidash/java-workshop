package org.javaworkshop.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Day1Test {


	@Test
	public void addTest() {
		Day1 d = new Day1();
		assertEquals(d.add(1, 2), 3);
	}

	@Test
	public void testFizzBuzz() {
		Day1 d = new Day1();
		assertEquals(d.fizzbuzz(15),"FizzBuzz");
	}

}