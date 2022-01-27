package com.pack;

public class CFoo implements IFoo {

	//private int field = 2;
	private int field2 = 22;
	public static int field = -1;

	@Override
	public int getField() {
		//IFoo.getPrivFieldStatic();
		//privMethod(); // error
		return field;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");

		super.finalize();
	}

	//	@Override
//	public int getDef() {
//		return -1;
//	}

}


