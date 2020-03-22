package tddjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
class RemoveA{
	/*
	 * 3.1 CHAR:A->"",B->""
	 * 4.EMPTY CHAR:""->""
	 * */
	RemoveAChar removeA ;
	@BeforeEach
	void setUp() {
		removeA = new RemoveAChar();
	}
	@Test
	void testNchars() {
		assertEquals("CD",removeA.remove("AACD"));
	}
	@Test
	void test1char() {
		assertEquals("B",removeA.remove("B"));
	}
	@Test
	void testNochar() {
		assertEquals("",removeA.remove(""));
	}
}
/*ABCD->BCD*/
/*AACD->CD*/
/*BBAA->BBAA*/
/*AABAA->BAA*/