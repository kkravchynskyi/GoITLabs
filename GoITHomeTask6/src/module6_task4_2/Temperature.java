package module6_task4_2;

public abstract class Temperature {
	
	private double temperature;
	private String typeTemperature;
	
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public String getTypeTemperature() {
		return typeTemperature;
	}
	public void setTypeTemperature(String typeTemperature) {
		this.typeTemperature = typeTemperature;
	}
		
    abstract void calculate();
	
	
	@Override
	public String toString() {
		return  " Temperature in   " + getTypeTemperature() + " is : " + getTemperature();		
	}	
}
