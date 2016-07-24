package module4Task2;

import java.util.Scanner; 

import module4.UtilsModuleFour;

public class RunTask {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Temperature t = null;
		int i;
		boolean flag = true;
		while(flag){
			System.out.println("Select type temperature 1 - in fahrenheit, 2 - in celsius " );
			i = scan.nextInt();
			switch(i){
	   	 	case 1: Celsius celsius = new Celsius();
	   	 			System.out.println("Input temperature in fahrenheit");
	   	 			celsius.setTemperature(UtilsModuleFour.inputOneValue());
	   	 			t = (Temperature)celsius;
	   	 			flag = false;
	   	 			break;
	   	 	case 2:  Fahrenheit fahrenheit = new Fahrenheit();
	   			 	System.out.println("Input temperature in celsius");
	   			 	fahrenheit.setTemperature(UtilsModuleFour.inputOneValue());
	   			 	t = (Temperature)fahrenheit;
	   			 	flag = false;
	   			 	break;
	   	 	default: System.out.println("You don't choice. ");	 	
		 }
		} // while
		 t.calculate();
		System.out.println(t); 

	}

}
