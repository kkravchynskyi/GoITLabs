package module5;

import java.util.Scanner;

public class UtilsModuleFive {
	
	@SuppressWarnings("resource")
	public static void inputDataArray(WorksWithArray arr){
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while (flag){
			System.out.println("Input size array double  from 1 to 20");
			int i = scan.nextInt();
			if((i > 0)&&(i < 21)) {
				arr.setSizeArray(i);
				break;
			}
			  else  System.out.println("failed size array"); 
		}
		System.out.println("Input " +  arr.getSizeArray() 
				+ " double array elements");
		for(int i =0; i < arr.getSizeArray(); i++){
			System.out.println(" " + i + " elements :");
			double x = scan.nextDouble();
			arr.setElementArray(i, x);
		}
	}
	
	public static void printArray(WorksWithArray arr){
		System.out.println(" Array : ");
		arrayToString(arr);
	}
	
	public static void printSortArray(WorksWithArray arr){
		System.out.println(" Sorted array : ");
		arrayToString(arr);		
	}
	
	public static void arrayToString(WorksWithArray arr){
		System.out.print("[");
		for(int i=0; i < arr.getSizeArray()-1; i++){			
			    System.out.print(arr.getElelementArray(i) + ", ");
		}
		System.out.println(arr.getElelementArray(arr.getSizeArray()-1) + "] ");		
	}
	
	public static void  printMinMax(WorksWithArray arr){
		System.out.println("Min and Max array  is : Min = " + arr.getMin() +  " , Max = " + arr.getMax());
	}
	
	

}
