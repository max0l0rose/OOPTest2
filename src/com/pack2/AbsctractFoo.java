package com.pack2;

public abstract class AbsctractFoo {
	//abstract private void func(); // error - private
	abstract protected void func2();

	static int a = 1;
	int b = 2;

	public class Inner {
		private int priv = b; // static - from 17
	}

	public void func3() {
		func2();

		Inner inner = new Inner();
		inner.priv = 2;
	}
}
