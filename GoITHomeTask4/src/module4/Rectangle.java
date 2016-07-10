package module4;

public class Rectangle extends Figures {

	private double a;
	private double b;
	
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
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
	void slove() {
		// TODO Auto-generated method stub
		setArea(a*b);
	}

	
}
