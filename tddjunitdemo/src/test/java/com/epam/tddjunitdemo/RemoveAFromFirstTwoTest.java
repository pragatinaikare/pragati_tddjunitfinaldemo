package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveAFromFirstTwoTest {
    RemoveA removeA;
	@Test
	void setup() {
		removeA = new RemoveA();
	}
	void testForFirstChar() {
		assertEquals("BCD" , removeA.removeCharA("ABCD"));
	}
	
	void testForFirsttwoChar() {
		assertEquals("CD" , removeA.removeCharA("AACD"));
	}
	void testForSecondChar() {
		assertEquals("BCD" , removeA.removeCharA("BACD"));
	}
	void testForNoAInFirstTwoChar() {
		assertEquals("BBAA" , removeA.removeCharA("BBAA"));
		
	}
	void testForBigChar() {
		assertEquals("BAA" , removeA.removeCharA("AABAA"));
		
}
}