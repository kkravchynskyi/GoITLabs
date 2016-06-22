package module4;

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

	abstract void slove();
	
	abstract void inputData();
	
	@Override
	public String toString() {
		return  " Площадь фигуры " + getNameFigures() + " равна: " + getArea();		
	}	

}
