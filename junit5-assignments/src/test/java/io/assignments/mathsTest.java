package io.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mathsTest {
	
	maths objMaths;
	
	@BeforeEach
	void instance() {
		objMaths = new maths();
	}

	@Test
	void addtest() {
		assertEquals(4, objMaths.add(2, 2),"Shoud return correct sum");
	}
	
	

}
