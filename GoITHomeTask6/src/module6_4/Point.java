package module6_4;
//task3
// Создать класс вычисляющий расстояние между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2).

public class Point {

	private double x;
	private double y;
		
    
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
	

}
