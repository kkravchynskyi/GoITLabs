package module4;


public class geometricFigures {
	
   private static final double PI = 3.1415926535;	
	
   private double a;
   private double b;
   private double c;
   private double area;
   private int key;
   
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
   
   public double getArea() {
	   return area;
   }
   
   public void setArea(double area) {
	   this.area = area;
   }
   
   public int getKey() {
	   return key;
   }
   
   public void setKey(int key) {
	   this.key = key;
   }
   
   public void slove(){
	   switch(key){
	   	 case 1: 
	   		 area = Math.sqrt((a*a) + (b*b) + (c*c));
	   		 break;
	   	 case 2:	 
	   	     area = a * b;
	   	     break;
	   	 case 3:
	   		 area = PI * (a*a);
	   		 break;
	   
	   } // switch
   } // slove

@Override
public String toString() {
	String str = " Площадь ";
	 switch(key){
   	 case 1: 
   		 str = str + "треугольника при сторонах а = " + getA() + " , b = " + getB() + " , c = " + getC() + " равна " + getArea();
   		 break;
   	 case 2:	 
   		 str = str + "прямоугольника при сторонах а = " + getA() + " , b = " + getB() +  " равна " + getArea();
   	     break;
   	 case 3:
   		str = str + "круга с радиусом r = " + getA() +  " равна " + getArea();
   		 break;
   
   } // switch
	
	return str;
}
   
   
   
}
