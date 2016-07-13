package module6_4;

public class Triangle extends Figures {
	
	private double a;
	private double b;
	private double c;
	
	

	public Triangle() {
		super.setNameFigures("triangle");
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

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		setArea(Math.sqrt((a*a) + (b*b) + (c*c)));		
	}


}
