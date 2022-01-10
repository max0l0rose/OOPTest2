package com.pack;

public interface IFoo {

	int field = 1; // need to be initialized

	int getPrivateField();

	default int getDef() {
		return getPrivateField() + getPrivFieldStatic() + privMethod();
	}

	private static int getPrivFieldStatic() {
		return 2;
	}

	private int privMethod() {
		return 3;
	}
}
