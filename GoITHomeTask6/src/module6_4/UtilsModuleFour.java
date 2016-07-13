package module6_4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UtilsModuleFour {
					
	@SuppressWarnings("resource")
	public static void inputDataFigures(Triangle f) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input side of the triangle : a, b, c");
		System.out.println("a = ");
		try{
			f.setA(scan.nextDouble());
			System.out.println("b = ");
			f.setB(scan.nextDouble());
			System.out.println("с = ");
			f.setC(scan.nextDouble());
		}
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		    System.out.println();
		    inputDataFigures(f);
		}
	}
	
	@SuppressWarnings("resource")
	public static void inputDataFigures(Figures f) {
		Scanner scan = new Scanner(System.in);
		if (f instanceof Cicle) {
			System.out.println("imput radius cicle");
			System.out.println("r = ");						
			try{
				((Cicle) f).setRadius(scan.nextDouble());
			}    
			catch (InputMismatchException ex){
			    System.out.printf("data shoud be an Double");
			    System.out.println();
			    inputDataFigures(f);
			}		
		}
		if (f instanceof Rectangle) {
			System.out.println("input side of the rectangle : a, b ");
			System.out.println("a = ");
			try{
			    ((Rectangle) f).setA(scan.nextDouble());    
				System.out.println("b = ");
				((Rectangle) f).setB(scan.nextDouble());
			}
			catch (InputMismatchException ex){
				System.out.printf("data shoud be an Double");
			    System.out.println();
			    inputDataFigures(f);
			}
		}
		if (f instanceof Triangle) {
			System.out.println("input side of the triangle : a, b, c");
			System.out.println("a = ");
			try{
				((Triangle) f).setA(scan.nextDouble());
				System.out.println("b = ");
				((Triangle) f).setB(scan.nextDouble());
				System.out.println("с = ");
				((Triangle) f).setC(scan.nextDouble());
			}
			catch (InputMismatchException ex){
				System.out.printf("data shoud be an Double");
			    System.out.println();
			    inputDataFigures(f);
			}			
		}
		
	}
	
				

	@SuppressWarnings("resource")
	public static void inputDataTemperature(Temperature f) {
		Scanner scan = new Scanner(System.in);
		if (f instanceof Fahrenheit){ 
			System.out.println("input temperature in celsius");
			System.out.println("temperature = ");
			try{
				f.setTemperature(scan.nextDouble());
			}
			catch (InputMismatchException ex){
				System.out.printf("data shoud be an Double");
			    System.out.println();
			    inputDataTemperature(f);
			}			
		}
		if (f instanceof Celsius){
			System.out.println("input temperature in fahrenheit");
			System.out.println("temperature = ");
			try{
				f.setTemperature(scan.nextDouble());
			}
			catch (InputMismatchException ex){
				System.out.printf("data shoud be an Double");
			    System.out.println();
			    inputDataTemperature(f);
			}
		}
		
	}
	
	@SuppressWarnings("resource")
	public static void inputPoint(Point p) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input point (x,y)");
		System.out.println("x = ");
		try{
			p.setX(scan.nextDouble());
			System.out.println("y = ");
			p.setY(scan.nextDouble());
		}
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		    System.out.println();
		    inputPoint(p);
		}
	}
	
}
