package module4;

import java.util.Scanner;

public class RunTasks {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task1
		//Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.
		
		Figures f = null; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Выбор фигуры: 1 - круг, 2 - треугольник, 3 - прямоугольник " );
		int i = scan.nextInt();
		 switch(i){
	   	 case 1: f = new Cicle();  
	   		 	break;
	   	case 2:  f = new Triangle();	   	
		 	    break;
	   	case 3: f = new Rectangle();	   	         
		 	break;	
		 }	 		
		f.inputData();
		f.slove();
		System.out.println(f);
		
		// task2
		//Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении.
		
		Temperature t = null;
		System.out.println("Выбор вида температуры 1 - в форенгейтах, 2 - в градусах цельсия " );
		i = scan.nextInt();
		 switch(i){
	   	 case 1: t = new Celsius();  
	   		 	break;
	   	case 2:  t = new Fahrenheit();	   	
		 	    break;
		 } 	    
		 t.inputData();
		 t.slove();
		System.out.println(t);
		
		// task3
		// Создать класс вычисляющий расстояние между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2).
		
  
	}

}
