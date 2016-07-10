package module4;

import java.util.Scanner;

public class UtilsModuleFour {
	
	@SuppressWarnings("resource")
	public static void inputDataFigures(Cicle f) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		System.out.println("imput radius cicle");
		System.out.println("r = ");
		f.setRadius(scan.nextDouble());		             				
	}
	
	@SuppressWarnings("resource")
	public static void inputDataFigures(Rectangle f) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input side of the rectangle : a, b ");
		System.out.println("a = ");
		f.setA(scan.nextDouble());    
		System.out.println("b = ");
		f.setB(scan.nextDouble());	
	}
	
	@SuppressWarnings("resource")
	public static void inputDataFigures(Triangle f) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input side of the triangle : a, b, c");
		System.out.println("a = ");
		f.setA(scan.nextDouble());
		System.out.println("b = ");
		f.setB(scan.nextDouble());
		System.out.println("с = ");
		f.setC(scan.nextDouble());
	}
	
	@SuppressWarnings("resource")
	public static void inputDataTemperature(Fahrenheit f) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input temperature in celsius");
		System.out.println("temperature = ");
		f.setTemperature(scan.nextDouble());
		
	}
	
	
	@SuppressWarnings("resource")
	public static void inputDataTemperature(Celsius f) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input temperature in fahrenheit");
		System.out.println("temperature = ");
		f.setTemperature(scan.nextDouble());
		
	}
	
	@SuppressWarnings("resource")
	public static void inputPoint(Point p) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input point (x,y)");
		System.out.println("x = ");
		p.setX(scan.nextDouble());
		System.out.println("y = ");
		p.setY(scan.nextDouble());
		
	}
	
}
