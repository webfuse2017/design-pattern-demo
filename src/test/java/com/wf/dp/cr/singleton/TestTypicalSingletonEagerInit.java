package com.wf.dp.cr.singleton;

public class TestTypicalSingletonEagerInit {

	public static void main(String[] args) {
		TypicalSingletonEagerInit typicalSingleton = TypicalSingletonEagerInit.getTypicalSingletonInstance();
		typicalSingleton.sayHello();

		TypicalSingletonEagerInit anotherTypicalSingleton = TypicalSingletonEagerInit
				.getTypicalSingletonInstance();

		System.out.println("typicalSingleton.hashCode()==> " + typicalSingleton.hashCode());
		System.out.println("anotherTypicalSingleton.hashCode()==> " + anotherTypicalSingleton.hashCode());
		System.out.println("Checking if typicalSingleton.equals(anotherTypicalSingleton)? ==> "
				+ typicalSingleton.equals(anotherTypicalSingleton));

	}

}
