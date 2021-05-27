
package com.wf.dp.cr.singleton;

public class TypicalSingletonEagerInit {

	// private static singleton variable
	private static TypicalSingletonEagerInit typicalSingletonObject = new TypicalSingletonEagerInit();

	// private constructor
	private TypicalSingletonEagerInit() {
		// making constructor private so that instance creation doesn't happen
	}

	// Global access point
	public static TypicalSingletonEagerInit getTypicalSingletonInstance() {
		return typicalSingletonObject;
	}
	
	public void sayHello() {
		System.out.println("Hello from TypicalSingletonEagerInit Instance!! (y)");
	}
}
