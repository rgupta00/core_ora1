package com.day2.session2;
//user define exception : define by the user
//Exception or RuntimeException

//this is a example of checked ex
class NegativeRadiusException extends Exception{
	public NegativeRadiusException(String message) {
		super(message);
	}
	
	
}
class Circle{
	private int radius;

	public Circle(int radius)throws NegativeRadiusException {
		if(radius<=0)
			throw new NegativeRadiusException("radius can not be -ve or zero");
			
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
public class G_UserDefineException {
	
	public static void main(String[] args) {
		try {
		Circle circle=new Circle(7);
		
		System.out.println(circle.getArea());
		}catch (NegativeRadiusException e) {
			System.out.println(e.getMessage());
		}
	}

}
