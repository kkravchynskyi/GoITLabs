package module4;
//task3
// Создать класс вычисляющий расстояние между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2).

public class Point {

	private double x;
	private double y;
		
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
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
    
	
	static double distance(Point p1, Point p2) {
	    return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + 
	                     (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
	  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Point p1 = new Point(3, 4);
 		Point p2 = new Point(6, 10);		
 		System.out.println("Расстояние от точки (" + p1.getX() + "," + p1.getY() + ")" 
 		                   + " до точки (" + p2.getX() + "," + p2.getY() + ") равно " + distance(p1,p2));
       

	}

}
