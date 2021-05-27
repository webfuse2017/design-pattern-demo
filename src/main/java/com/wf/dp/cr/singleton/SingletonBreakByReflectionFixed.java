
package com.wf.dp.cr.singleton;

public class SingletonBreakByReflectionFixed {

	// private static singleton variable
	private static SingletonBreakByReflectionFixed typicalSingletonObject = new SingletonBreakByReflectionFixed();

	// private constructor
	private SingletonBreakByReflectionFixed() {
		// making constructor private so that instance creation doesn't happen
		
		//Break by reflection can be fixed by adding a logic here in constructor
		if (null != typicalSingletonObject) {
			throw new RuntimeException("Hey, Can't create another instance. I told ya!! :)");
		}
	}

	// Global access point
	public static SingletonBreakByReflectionFixed getTypicalSingletonInstance() {
		return typicalSingletonObject;
	}

	public void sayHello() {
		System.out.println("Hello from SingletonBreakByReflectionFixed Instance!! (y)");
	}
}
