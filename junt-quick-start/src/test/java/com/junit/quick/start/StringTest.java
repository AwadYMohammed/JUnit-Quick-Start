package com.junit.quick.start;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class StringTest {
	@org.junit.Before
	public void before() {
		System.out.println("before");
	}
	@Test
	void testToDemonstrateAssertEqual() {
		System.out.println("test1");
		int actualOutput = Math.min(5, 10);
		int expectedOutput = 5;
		assertEquals(expectedOutput, actualOutput);
		fail();
	}
	@Test
	void test2() {
		//fail("Not yet implemented");
		System.out.println("test2");
	}
	@org.junit.After
	public void After() {
		System.out.println("After");
	}
}
