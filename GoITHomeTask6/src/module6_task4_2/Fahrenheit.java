package module6_task4_2;


public class Fahrenheit extends Temperature {
	
	

	public Fahrenheit() {
		super.setTypeTemperature("farenheit");
	}

	@Override
	void calculate() {
		setTemperature((getTemperature() * 9.0)/5.0 + 32);
	}


}
