package task3;

import java.util.Scanner;

public class Task2_3 {
	
	private static int a, b;
	private static Scanner scan = new Scanner(System.in);
	
	static void input(){
		System.out.println("input two integer numbers ");
		System.out.println("first : ");
		a = scan.nextInt();
		System.out.println("second : ");
		b = scan.nextInt();
	}
	
	static int average(int x, int y){
		return (x + y)/2;
	}

	public static void main(String[] args) {
		input();
		System.out.println(" average " + a + " and " + b + " is : " +
				           average(a,b));

	}

}
