package calapp.logic;

import calapp.internal.CalUtil;

public class Cal {
	CalUtil calUtil=new CalUtil();
	public int add(int a, int b) {
		return calUtil.add(a, b);
	}
}
