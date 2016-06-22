package module4;

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
		System.out.println("введите значениея сторон треугольника a, b, c");
		System.out.println("a = ");
		a = scan.nextDouble();
		setNameFigures("треугольник");
		System.out.println("b = ");
		b = scan.nextDouble();
		System.out.println("с = ");
		c = scan.nextDouble();
	}

}
