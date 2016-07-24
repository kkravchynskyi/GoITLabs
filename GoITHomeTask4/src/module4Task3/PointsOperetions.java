package module4Task3;

import java.util.ArrayList;

import module4.UtilsModuleFour;

public class PointsOperetions {
		
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("input first point (x,y)");
		list = UtilsModuleFour.inputTwoValue();
		Point p1 = new Point(list);
		System.out.println("input second point (x,y)");
		list = UtilsModuleFour.inputTwoValue();
		Point p2 = new Point(list);
		System.out.println(" Distance from "  + p1 + " to "  + p2 +
                               " is " + p1.distance(p1,p2));
	}

}


