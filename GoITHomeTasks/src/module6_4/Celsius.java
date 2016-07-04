package module6_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Celsius extends Temperature {

	@Override
	void slove() {
		// TODO Auto-generated method stub
		setTemperature(((getTemperature() - 32)*5.0)/9.0);
	}

	@Override
	@SuppressWarnings("resource")
	void inputData() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		setTypeTemperature("цельсию");
		System.out.println("введите значение температуры в форенгейтах");
		System.out.println("темпер = ");
		try{
			setTemperature(scan.nextDouble());
		}    
		catch (InputMismatchException ex){
			System.out.printf("data shoud be an Double");
		}
		
	}

}
