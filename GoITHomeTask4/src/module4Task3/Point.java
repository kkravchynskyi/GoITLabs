package module4Task3;

import java.util.ArrayList;

public class Point {
	
	@SuppressWarnings("unused")
	private ArrayList<Double> lst = new ArrayList<Double>();

	private double x;
	private double y;
		    	
	public Point(ArrayList<Double> lst) {
		super();
		this.lst = lst;
		x = lst.get(0);
		y = lst.get(1);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
    
	@Override
	public String toString() {
		return  " Point : (" + getX() + "," + getY() + ") ";		
	}
	
	public double distance(Point p1, Point p2) {
	    return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + 
	                     (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
	  }

}
