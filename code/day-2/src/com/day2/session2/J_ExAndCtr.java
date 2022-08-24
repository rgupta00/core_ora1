package com.day2.session2;

import java.io.FileNotFoundException;
import java.io.IOException;

//base class
class P {
	P() throws IOException{
		System.out.println("ctr of class P");
	}
}

//drived class
class Q extends P {
	Q() throws Exception{
		System.out.println("ctr of class Q");
	}
}

public class J_ExAndCtr {

	public static void main(String[] args) {

		try {
			P p=new Q();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
