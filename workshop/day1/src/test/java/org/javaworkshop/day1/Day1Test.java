package org.javaworkshop.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Day1Test {


	@Test
	public void test() {
		Day1 d = new Day1();
		assertEquals(d.add(1, 2), 3);
	}

}