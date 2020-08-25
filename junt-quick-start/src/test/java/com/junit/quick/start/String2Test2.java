package com.junit.quick.start;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class String2Test2 {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before Class");
	}
	@Test(expected=NullPointerException.class)
	public void testException() {
	String value = null;
	value.toUpperCase();
		
		
	}
	@Test
	void test2() {
		//fail("Not yet implemented");
		System.out.println("test2");
	}
	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}
	public static void main(String[] args) {
		String2Test2
	}
}
