package module6_4;

import java.util.Scanner;

public class RunTasks {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task1
				
		Figures f = null; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Select figures : 1 - cicle, 2 - triangle, 3 - rectangle " );
		int i = scan.nextInt();
		 switch(i){
	   	 case 1: f = new Cicle();
	         	UtilsModuleFour.inputDataFigures((Cicle)f);
	   		 	break;
	   	case 2:  f = new Triangle();
	   			 UtilsModuleFour.inputDataFigures((Triangle)f);
		 	    break;
	   	case 3: f = new Rectangle();
	   	        UtilsModuleFour.inputDataFigures((Rectangle)f);
		 	    break;	
		 }
		 
		f.calculate();
		System.out.println(f);
		
		// task2			
		Temperature t = null;
		System.out.println("Select type temperature 1 - in fahrenheit, 2 - in celsius " );
		i = scan.nextInt();
		 switch(i){
	   	 case 1: t = new Celsius();
	   	         UtilsModuleFour.inputDataTemperature((Celsius) t);
	   		 	break;
	   	case 2:  t = new Fahrenheit();
	   	         UtilsModuleFour.inputDataTemperature((Fahrenheit) t); 
		 	    break;
		 } 	    
		 t.calculate();
		System.out.println(t);
		
		
  
	}

}
