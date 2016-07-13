package module6_4;

public class Rectangle extends Figures {

	private double a;
	private double b;
	
	
	
	public Rectangle() {		
		super.setNameFigures("rectngle");
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		setArea(a*b);
	}

	
}
