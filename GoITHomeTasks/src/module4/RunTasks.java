package module4;

import java.util.Scanner;

public class RunTasks {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		// task1
		geometricFigures geom = new geometricFigures();
		Scanner scan = new Scanner(System.in);
		System.out.println("введите три значения -стороны треугольника / стороны прямоугольника / радиус");
		System.out.println("a = ");
		x = scan.nextDouble();
		geom.setA(x);;
		System.out.println("b = ");
		x = scan.nextDouble();
		geom.setB(x);
		System.out.println("c = ");
		x = scan.nextDouble();
		geom.setC(x);
		geom.setKey(3);
		geom.slove();
		System.out.println(geom.toString());
		geom.setKey(1);
		geom.slove();
		System.out.println(geom.toString());
		geom.setKey(2);
		geom.slove();
		System.out.println(geom.toString());
		// task2
		Forengeyt forent = new Forengeyt();
		System.out.println("введите значении температуры в форенгейтах " );
		x = scan.nextDouble();		
		forent.setForengeyt(x);
		forent.setKey(1);
		forent.slove();
		System.out.println(forent);
		System.out.println("введите значении температуры в цельсии " );
		x = scan.nextDouble();		
		forent.setCelsiy(x);
		forent.setKey(0);
		forent.slove();
		System.out.println(forent);
		
  
	}

}
