package module6_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle extends Figures {
	
	private double a;
	private double b;
	private double c;
	
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	void slove() {
		// TODO Auto-generated method stub
		setArea(Math.sqrt((a*a) + (b*b) + (c*c)));		
	}

	@Override
	@SuppressWarnings("resource")
	void inputData() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		setNameFigures("треугольник");
		System.out.println("введите значениея сторон треугольника a, b, c");
		System.out.println("a = ");
		try{
			a = scan.nextDouble();
		}    
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		}
		System.out.println("b = ");
		try{
			b = scan.nextDouble();
		}    
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		}
		System.out.println("с = ");
		try{
			c = scan.nextDouble();
		}    
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		}
		
	}

}
