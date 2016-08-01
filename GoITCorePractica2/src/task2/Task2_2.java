package task2;

import java.util.Scanner;

public class Task2_2 {
	
	private static int a, b;
	private static Scanner scan = new Scanner(System.in);
	
	
	static void input(){
		System.out.println("input two integer numbers > 0");
		System.out.println("first : ");
		a = scan.nextInt();
		if( a < 0) {
			System.out.println(" first number is not > 0");
			input();
			return;
		}
		System.out.println("second : ");
		b = scan.nextInt();
		if (b < 0) {
			System.out.println(" second number is not > 0");
			input();
			return;
		}
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
