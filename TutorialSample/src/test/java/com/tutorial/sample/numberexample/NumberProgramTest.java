/**
 * 
 */
package com.tutorial.sample.numberexample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Admin
 *
 */
public class NumberProgramTest {

	NumberProgram numProg = null;
	
	@Before
	public void setUp(){
		 numProg = new NumberProgram();
	}
	
	@After
	public void clean(){
		
	}
	
	@Test
	public void summationTest(){
		long expectedValue = 10;
		assertEquals(expectedValue,numProg.numSummation(5,5));
		
	}
	
	@Test
	public void returnLargeNumberTest(){
		int expectedValue = -5;
		int actualValue = 0;
		actualValue = numProg.returnLargeNumber(-5,-5);
		assertEquals(expectedValue,actualValue);
	}
	
	
	
	
}
