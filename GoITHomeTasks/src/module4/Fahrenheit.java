package module4;

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
		System.out.println("введите значение температуры в градусах цельсия");
		System.out.println("темпер = ");
		setTemperature(scan.nextDouble());
		setTypeTemperature("форенгейту");

	}

}
