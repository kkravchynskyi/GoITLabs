package module4;


public class Fahrenheit extends Temperature {
	
	

	public Fahrenheit() {
		// TODO Auto-generated constructor stub
		super.setTypeTemperature("farenheit");
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		setTemperature((getTemperature() * 9.0)/5.0 + 32);
	}


}
