package module4;

import java.util.Scanner;

public class UtilsModuleFour {
	
	public static Scanner scan = new Scanner(System.in);
	
	
	public static void inputDataFigures(Figures f) {
		if (f instanceof Cicle) {
			System.out.println("imput radius cicle");
			System.out.println("r = ");
			((Cicle) f).setRadius(scan.nextDouble());	
		}
		if (f instanceof Rectangle) {
			System.out.println("input side of the rectangle : a, b ");
			System.out.println("a = ");
			((Rectangle) f).setA(scan.nextDouble());    
			System.out.println("b = ");
			((Rectangle) f).setB(scan.nextDouble());	
		}
		if (f instanceof Triangle) {
			System.out.println("input side of the triangle : a, b, c");
			System.out.println("a = ");
			((Triangle) f).setA(scan.nextDouble());
			System.out.println("b = ");
			((Triangle) f).setB(scan.nextDouble());
			System.out.println("с = ");
			((Triangle) f).setC(scan.nextDouble());
		}
		
	}
	
	public static void inputDataTemperature(Temperature f) {
		if (f instanceof Fahrenheit){ 
			System.out.println("input temperature in celsius");
			System.out.println("temperature = ");
			f.setTemperature(scan.nextDouble());
		}
		if (f instanceof Celsius){
			System.out.println("input temperature in fahrenheit");
			System.out.println("temperature = ");
			f.setTemperature(scan.nextDouble());
		}
		
	}
	
			
	
	public static void inputPoint(Point p) {
		System.out.println("input point (x,y)");
		System.out.println("x = ");
		p.setX(scan.nextDouble());
		System.out.println("y = ");
		p.setY(scan.nextDouble());
		
	}
	
}
