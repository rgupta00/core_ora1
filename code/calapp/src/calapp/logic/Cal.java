package calapp.logic;

import calapp.internal.InternalLogic;

public class Cal {
   private InternalLogic internalLogic=new InternalLogic();
	public int add(int a, int b) {
		return internalLogic.add(a, b) ;
	}
}
