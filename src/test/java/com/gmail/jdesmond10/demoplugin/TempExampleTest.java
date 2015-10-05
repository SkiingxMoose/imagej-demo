package com.gmail.jdesmond10.demoplugin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TempExampleTest {

	@Test
	public void testMultiplyByThree() {
		assertEquals("5*3 should be 15", TempExample.multiplyByThree(5),15);
		assertEquals("0*3 should be 0", TempExample.multiplyByThree(0),0);
		assertEquals(TempExample.multiplyByThree(4), 12);
	}
}
