package module4;

import java.util.Scanner;

public class Cicle extends Figures {
	
	private static final double PI = 3.1415926535;
	private double radius;
    	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void slove() {
		// TODO Auto-generated method stub		 
		setArea (PI * (radius*radius));
	}

	@Override
	@SuppressWarnings("resource")
	void inputData() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("введите значение радиуса круга");
		System.out.println("r = ");
		radius = scan.nextDouble();
		setNameFigures("круг");
		
	}

}
