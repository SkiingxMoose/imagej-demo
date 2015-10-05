package com.gmail.jdesmond10.demoplugin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class TempExampleIntegrationTest {

	@SuppressWarnings("static-access")
	@Test
	public void testStuff() throws Exception {
		final TempExample z = new TempExample();
		Thread.sleep(1000);
		assertEquals(z.multiplyByThree(13),39);
	}

}
