package module6_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle extends Figures {

	private double a;
	private double b;
	
	
	
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

	@Override
	void slove() {
		// TODO Auto-generated method stub
		setArea(a*b);
	}

	@Override
	@SuppressWarnings("resource")
	void inputData() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		setNameFigures("прямоугольник");
		System.out.println("введите значениея сторон прямоугольника a, b ");
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
			System.out.println("data shoud be an Double");
		}
	}

}
