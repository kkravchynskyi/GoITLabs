package module6_task4_1;

import java.util.ArrayList;

public class Rectangle extends Figures {

	private double a;
	private double b;
	@SuppressWarnings("unused")
	private ArrayList<Double> lst = new ArrayList<Double>();
	
	
	public Rectangle() {
		super.setNameFigures("rectngle");
	}	
	
	public Rectangle(ArrayList<Double> lst) {
		super();
		this.lst = lst;
		super.setNameFigures("rectngle");
		a = lst.get(0);
		b = lst.get(1);
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
		setArea(a*b);
	}

	
}
