package module4;


public class Fahrenheit extends Temperature {
	
	

	public Fahrenheit() {
		super();
		// TODO Auto-generated constructor stub
		super.setTypeTemperature("farenheit");
	}

	@Override
	void slove() {
		// TODO Auto-generated method stub
		setTemperature((getTemperature() * 9.0)/5.0 + 32);
	}


}
