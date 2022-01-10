package com.pack;

public class CFoo implements IFoo {

	protected int field;

	@Override
	public int getPrivateField() {
		getDef();
		//IFoo.getPrivFieldStatic();
		//privMethod(); // error
		return field;
	}

//	@Override
//	public int getDef() {
//		return -1;
//	}

}


