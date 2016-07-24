package utils;

import java.util.ArrayList;
import java.util.Scanner; 
import java.util.InputMismatchException;

public class UtilsModuleFour {
	
	@SuppressWarnings("resource")
	public static double inputOneValue() {
		Scanner scan = new Scanner(System.in);		
		try{
		   System.out.println("first value = ");
		   double x = scan.nextDouble();
		   return x;
		} 
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		    System.out.println();
		}
		return inputOneValue();
	}
	
	@SuppressWarnings("resource")
	public static ArrayList<Double> inputTwoValue(){
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> res = new ArrayList<Double>();
		try{
		    System.out.println("first value = ");
		    res.add(scan.nextDouble());
		    System.out.println("second value = ");
		    res.add(scan.nextDouble());
		    return res;
		}
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		    System.out.println();
		}
		return inputTwoValue();
	}
	
	@SuppressWarnings("resource")
	public static ArrayList<Double> inputThreeValue(){
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> res = new ArrayList<Double>();
		try{
			System.out.println("first value = ");
			res.add(scan.nextDouble());
			System.out.println("second value = ");
			res.add(scan.nextDouble());
			System.out.println("three value = ");
			res.add(scan.nextDouble());
			return res;
		}
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		    System.out.println();
		}
		return inputThreeValue();
	}

}
