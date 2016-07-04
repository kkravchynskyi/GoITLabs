package module6_4;

import java.util.InputMismatchException;
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
		setNameFigures("круг");
		System.out.println("r = ");
		try{
			radius = scan.nextDouble();
		}    
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		}
				
	}

}
