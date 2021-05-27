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

		testBreakByReflectionFixed();
	}

	private static void testBreakByReflectionFixed()
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println(
				"Now we will test the same steps using another class where the break by reflection problem is fixed.");
		// Lets take any singleton (lazy/init) and try to break it by reflection
		SingletonBreakByReflectionFixed singletonBbRFixed = SingletonBreakByReflectionFixed
				.getTypicalSingletonInstance();
		singletonBbRFixed.sayHello();

		SingletonBreakByReflectionFixed anothersingletonBbRFixed = SingletonBreakByReflectionFixed
				.getTypicalSingletonInstance();

		System.out.println("singletonBbRFixed.hashCode()==> " + singletonBbRFixed.hashCode());
		System.out.println("anothersingletonBbRFixed.hashCode()==> " + anothersingletonBbRFixed.hashCode());
		System.out.println("Checking if singletonBbRFixed.equals(anothersingletonBbRFixed)? ==> "
				+ singletonBbRFixed.equals(anothersingletonBbRFixed));

		System.out.println(
				"Lets try to break the SingletonBreakByReflectionFixed class by reflection and see what it does!!");
		// Two objects created above, lets create the third object whose hashcode will
		// be different
		Class clazz = Class.forName("com.wf.dp.cr.singleton.SingletonBreakByReflectionFixed");
		Constructor<TypicalSingletonEagerInit> clazzConstructor = clazz.getDeclaredConstructor();
		clazzConstructor.setAccessible(true);

		TypicalSingletonEagerInit brokenTypicalSingletonByReflection = clazzConstructor.newInstance();
	}

}
