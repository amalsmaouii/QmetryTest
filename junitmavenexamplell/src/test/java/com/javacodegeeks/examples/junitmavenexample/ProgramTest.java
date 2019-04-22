package com.javacodegeeks.examples.junitmavenexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;




public class ProgramTest {

	@Test
	public void createMessageTest() {
		assertEquals("Hello World", Program.createMessage());
	}

	@Test
	public void IsOver16() {
		assertTrue(Program.getAge() > 16);

	}

	@Test
	public void testConcat() {
		Program myConcat = new Program();
		String result = myConcat.concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

	@Test
	
	void test_ValueSource(int i) {
		System.out.println(i);
	}

	@Test
	void test_ValueSource_String(String s) {
		assertTrue(Integer.parseInt(s) < 5);
	}
}
