package module4;

public class Celsius extends Temperature {

	
	
	public Celsius() {
		// TODO Auto-generated constructor stub
		super.setTypeTemperature("celsius");
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		setTemperature(((getTemperature() - 32)*5.0)/9.0);
	}

}
