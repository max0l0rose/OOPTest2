package com.company;

public class CFoo implements IFoo {

	private int privateField = 1;

	static public void staticFunc() {
	}

	@Override
	public int getPrivateFiled() {
		return privateField;
	}
}


