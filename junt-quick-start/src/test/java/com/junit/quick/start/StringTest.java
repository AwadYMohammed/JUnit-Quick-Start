package com.junit.quick.start;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testToDemonstrateAssertEqual() {
		//
		int actualOutput = Math.min(5, 10);
		int expectedOutput = 5;
		assertEquals(expectedOutput, actualOutput);
		fail();
	}
	@Test
	void test2() {
		//fail("Not yet implemented");
	}
}
