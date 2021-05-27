package com.wf.dp.cr.singleton;

public class TestTypicalSingletonLazyInit {

	public static void main(String[] args) {
		TypicalSingletonLazyInit typicalSingletonLazyInit = TypicalSingletonLazyInit
				.getTypicalSingletonLazyInitInstance();
		typicalSingletonLazyInit.sayHello();

		TypicalSingletonLazyInit anotherTypicalSingletonLazyInit = TypicalSingletonLazyInit
				.getTypicalSingletonLazyInitInstance();

		System.out.println("typicalSingletonLazyInit.hashCode()==> " + typicalSingletonLazyInit.hashCode());
		System.out
				.println("anotherTypicalSingletonLazyInit.hashCode()==> " + anotherTypicalSingletonLazyInit.hashCode());
		System.out.println("Checking if typicalSingletonLazyInit.equals(anotherTypicalSingletonLazyInit)? ==> "
				+ typicalSingletonLazyInit.equals(anotherTypicalSingletonLazyInit));

	}

}
