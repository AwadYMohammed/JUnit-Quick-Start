package com.junit.quick.start;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class StringTest {
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
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
	@After
	public void After() {
		System.out.println("After");
	}
}
