package com.imoovc.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnotationTest {

	@Test()
	void testDivide(){
		assertEquals(3, new Calculate().divide(6, 0));;
	}

}
 