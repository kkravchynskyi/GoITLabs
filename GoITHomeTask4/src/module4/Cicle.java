package module4;

public class Cicle extends Figures {
	
	private static final double PI = 3.1415926535;
	private double radius;
			
	public Cicle() {
		super();
		// TODO Auto-generated constructor stub
		super.setNameFigures("cicle");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void slove() {
		// TODO Auto-generated method stub		 
		setArea (PI * (radius*radius));
	}


}
