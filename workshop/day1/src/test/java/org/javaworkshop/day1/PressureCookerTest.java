package org.javaworkshop.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PressureCookerTest {
	private PressureCooker getCookerInstance() {
		PressureCooker pc = new PressureCooker();
		return pc;
	}

	@Test
	public void checkCookRice() {
		PressureCooker pc = getCookerInstance();

		assertEquals(pc.cookRice(), "starting to cook rice");
	}

	@Test
	public void checkRemainingTime() {
		PressureCooker pc = getCookerInstance();

		assertEquals(pc.remainingMinutesToCookRice(2),8); 
		assertEquals(pc.remainingMinutesToCookRice(12),-1); 
	}

	@Test
	public void checkExpectedMinutesToCookRice() {
		PressureCooker pc = getCookerInstance();

		assertEquals(pc.expectedMinutesToCookRice(),10); 
	}


}