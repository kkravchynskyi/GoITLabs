package module4;

// task 3

public class PointsOperetions {
	
	static double distance(Point p1, Point p2) {
	    return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + 
	                     (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		UtilsModuleFour.inputPoint(p1);
		Point p2 = new Point();
		UtilsModuleFour.inputPoint(p2);
        
		System.out.println(" Distance from "  + p1 + " to "  + p2 +
                               " is " + distance(p1,p2));
	}

}


