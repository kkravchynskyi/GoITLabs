package module6_task4_1;

public abstract class Figures {
	
	private double area;
	private String nameFigures;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
    
	
	
	public String getNameFigures() {
		return nameFigures;
	}

	public void setNameFigures(String nameFigures) {
		this.nameFigures = nameFigures;
	}

	abstract void calculate();
	
	
	@Override
	public String toString() {
		return  " Area figure " + getNameFigures() + " is : " + getArea();		
	}


}
