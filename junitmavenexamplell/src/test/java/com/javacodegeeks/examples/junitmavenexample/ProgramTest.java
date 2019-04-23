package com.javacodegeeks.examples.junitmavenexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;




public class ProgramTest {

	@Test
	public void createMessageTest() {
		assertEquals("Hello World ", Program.createMessage());
	}

	@Test
	public void IsOver16() {
		assertTrue(Program.getAge() > 10);

	}

	@Test
	public void testConcat() {
		Program myConcat = new Program();
		String result = myConcat.concat("Hello ", "World");
		assertEquals("HelloWorld", result);
	}


}
