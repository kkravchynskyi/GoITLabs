package module6_4;


public class Fahrenheit extends Temperature {
	
	

	public Fahrenheit() {
		super.setTypeTemperature("farenheit");
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		setTemperature((getTemperature() * 9.0)/5.0 + 32);
	}


}
