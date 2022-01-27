package com.pack2;

public class ModifAccessChange2 extends ModifAccessChange {

	//@Override // error..  no overriding fields
	private int a;

	public int func() { // wider ok!
		//return super.a;
		return super.func();
		//return 2;
	}
}
