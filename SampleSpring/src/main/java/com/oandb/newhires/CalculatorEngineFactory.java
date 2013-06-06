package com.oandb.newhires;


public class CalculatorEngineFactory{
	
	private Class<?> engineClass;
	public CalculatorEngineFactory() {
 
	}
	
	public static Object create(){
			
		CalculatorEngineFactory engine = new CalculatorEngineFactory();
		Object object = (engine.getEngineClass().cast(new Object())) ;
		
		return  object;
	}

	public Class<?> getEngineClass() {
		return engineClass;
	}

	public void setEngineClass(Class<?> engineClass) {
		this.engineClass = engineClass;
	}

}
