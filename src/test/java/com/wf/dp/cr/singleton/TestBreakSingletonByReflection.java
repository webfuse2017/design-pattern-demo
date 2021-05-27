package com.wf.dp.cr.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestBreakSingletonByReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Lets take any singleton (lazy/init) and try to break it by reflection
		TypicalSingletonEagerInit typicalSingleton = TypicalSingletonEagerInit.getTypicalSingletonInstance();
		typicalSingleton.sayHello();

		TypicalSingletonEagerInit anotherTypicalSingleton = TypicalSingletonEagerInit.getTypicalSingletonInstance();

		System.out.println("typicalSingleton.hashCode()==> " + typicalSingleton.hashCode());
		System.out.println("anotherTypicalSingleton.hashCode()==> " + anotherTypicalSingleton.hashCode());
		System.out.println("Checking if typicalSingleton.equals(anotherTypicalSingleton)? ==> "
				+ typicalSingleton.equals(anotherTypicalSingleton));

		// Two objects created above, lets create the third object whose hashcode will
		// be different
		Class clazz = Class.forName("com.wf.dp.cr.singleton.TypicalSingletonEagerInit");
		Constructor<TypicalSingletonEagerInit> clazzConstructor = clazz.getDeclaredConstructor();
		clazzConstructor.setAccessible(true);

		TypicalSingletonEagerInit brokenTypicalSingletonByReflection = clazzConstructor.newInstance();
		System.out.println(
				"brokenTypicalSingletonByReflection.hashCode()==> " + brokenTypicalSingletonByReflection.hashCode());
		System.out.println("See the initialization of the so called singleton got broken using reflection!!");
	}

}
