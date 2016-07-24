package module4Task2;

public class Celsius extends Temperature {

	
	
	public Celsius() {
		super.setTypeTemperature("celsius");
	}

	@Override
	void calculate() {
		setTemperature(((getTemperature() - 32)*5.0)/9.0);
	}

}
