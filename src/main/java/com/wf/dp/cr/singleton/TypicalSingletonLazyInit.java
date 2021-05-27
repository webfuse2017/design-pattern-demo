
package com.wf.dp.cr.singleton;

public class TypicalSingletonLazyInit {

	// private static singleton variable
	private static TypicalSingletonLazyInit typicalSingletonLazyInitObject = null;

	// private constructor
	private TypicalSingletonLazyInit() {
		// making constructor private so that instance creation doesn't happen
	}

	// Global access point
	public static TypicalSingletonLazyInit getTypicalSingletonLazyInitInstance() {
		if (null == typicalSingletonLazyInitObject) {
			typicalSingletonLazyInitObject = new TypicalSingletonLazyInit();
		}
		return typicalSingletonLazyInitObject;
	}

	public void sayHello() {
		System.out.println("Hello from TypicalSingletonLazyInit Instance!! (y)");
	}
}
