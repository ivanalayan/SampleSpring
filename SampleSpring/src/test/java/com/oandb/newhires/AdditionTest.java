package com.oandb.newhires;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	private CalculatorEngine additionCalucation;
	
	@Before
	public void init(){
		additionCalucation = new AdditionCalculatorEngine();
	}
	
	@Test
	public void addTwoNumbers(){
		
		Assert.assertEquals(9, additionCalucation.computer(4, 5));
	}
}
