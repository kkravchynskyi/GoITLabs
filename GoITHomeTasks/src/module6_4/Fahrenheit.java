package module6_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fahrenheit extends Temperature {
	
	

	@Override
	void slove() {
		// TODO Auto-generated method stub
		setTemperature((getTemperature() * 9.0)/5.0 + 32);
	}

	@Override
	@SuppressWarnings("resource")
	void inputData() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		setTypeTemperature("форенгейту");
		System.out.println("введите значение температуры в градусах цельсия");
		System.out.println("темпер = ");
		try{
			setTemperature(scan.nextDouble());
		}    
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		}

	}

}
