package module4;

import java.util.ArrayList;
import java.util.Scanner; 

public class UtilsModuleFour {
public static Scanner scan = new Scanner(System.in);
	
	
	public static double inputOneValue() {		
		double x = scan.nextDouble();
		return x;
	}
	
	public static ArrayList<Double> inputTwoValue(){
		ArrayList<Double> res = new ArrayList<Double>();
		System.out.println("first value = ");
		res.add(scan.nextDouble());
		System.out.println("second value = ");
		res.add(scan.nextDouble());
		return res;
	}
	
	public static ArrayList<Double> inputThreeValue(){
		ArrayList<Double> res = new ArrayList<Double>();
		System.out.println("first value = ");
		res.add(scan.nextDouble());
		System.out.println("second value = ");
		res.add(scan.nextDouble());
		System.out.println("three value = ");
		res.add(scan.nextDouble());
		return res;
	}
	
}
