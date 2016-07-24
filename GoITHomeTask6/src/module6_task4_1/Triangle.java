package module6_task4_1;

import java.util.ArrayList;

public class Triangle extends Figures {
	
	private double a;
	private double b;
	private double c;
	@SuppressWarnings("unused")
	private ArrayList<Double> lst = new ArrayList<Double>();
	

	public Triangle() {
		super.setNameFigures("triangle");
	}
	
	

	public Triangle(ArrayList<Double> lst) {
		super();
		this.lst = lst;
		super.setNameFigures("triangle");
		a = lst.get(0);
		b = lst.get(1);
		c = lst.get(2);
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
		double p = (a + b + c)/2.0;
		setArea(Math.sqrt(p*((p-a) + (p-b) + (p-c))));		
	}


}
