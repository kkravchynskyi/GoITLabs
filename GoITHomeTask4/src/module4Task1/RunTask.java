package module4Task1;

import java.util.ArrayList;
import java.util.Scanner; 

import module4.*;

public class RunTask {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Figures f = null; 
		ArrayList<Double> list = new ArrayList<Double>();
		//Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("Select figures : 1 - cicle, 2 - rectangle, 3 - triangle " );
			int i = scan.nextInt();
			switch(i){
	   	 	case 1: Cicle cicle = new Cicle();
	   	        System.out.println("Input radius cicle");
	   	        cicle.setRadius(UtilsModuleFour.inputOneValue());
	   	        f = (Figures)cicle;
	   	        flag = false;
	   		 	break;
	   	 	case 2: System.out.println("input side of the rectangle : a, b ");
	   			list = UtilsModuleFour.inputTwoValue(); 
	   			Rectangle rectangle = new Rectangle(list);
	   			f = (Figures)rectangle;
	   			flag = false;
		 	    break;
	   	 	case 3: System.out.println("input side of the triangle : a, b, c");
	   			list = UtilsModuleFour.inputThreeValue(); 	   		
	   		    Triangle triangle = new Triangle(list);
	   		    f = (Figures)triangle;
	   		    flag = false;
		 	    break;
	   	 	default: System.out.println("You don't choice. ");		         
			}
		} // while	
		f.calculate();
		System.out.println(f); 

	}

}
