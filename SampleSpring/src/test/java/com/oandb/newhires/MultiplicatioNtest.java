package com.oandb.newhires;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class MultiplicatioNtest {
	private CalculatorEngine multiplicationTest;
	
	@Before
	public void init(){
		multiplicationTest = new MultiplicationCalculatorEngine();
	}
	
	@Test
	public void multiplyNumbers(){
		
		Assert.assertEquals(20, multiplicationTest.computer(4, 5));
	}
}
