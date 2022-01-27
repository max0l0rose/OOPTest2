package com.pack;

public interface IFoo {

	int field = 1; // need to be initialized

	int getField();

	default int defFunc() {
		return getField() + privStaticFunc() + privFunc();
	}

	 static int privStaticFunc() {
		//privFunc(); // error
		//defFunc(); // error
		return 2;
	}

	private int privFunc() {
		privStaticFunc();
		return 3;
	}
}
