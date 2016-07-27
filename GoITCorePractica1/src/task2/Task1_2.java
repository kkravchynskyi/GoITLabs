package task2;

import java.util.Scanner;

public class Task1_2 {

	int x = 13567;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 int x;
		 int sum = 0;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("input integer");
		 x= scan.nextInt();
		 while (x > 0) {
		    sum = sum + (x % 10);
		    x /= 10;
		    }
		 System.out.println("Summa digits " + x + " is : " + sum);
		 
	}

}
