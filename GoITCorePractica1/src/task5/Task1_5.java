package task5;

import java.util.Arrays;
import java.util.Random;

public class Task1_5 {
	
	static int[][] arr = new int[3][3];
	
	public static void initArray(){
		Random rand = new Random(90);
		for(int i=0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = rand.nextInt(20);
		
	}
	
	public static void printArray(){
		for(int i=0; i < arr.length; i++)
			System.out.println(Arrays.toString(arr[i]));
	}
	
	public static void task(){
		for(int i=0; i < arr.length; i++)
			for(int j=0; j < arr.length; j++){
				if (i%2 == 0){
					System.out.print(" " + arr[j][i]+", ");
				}
				else System.out.print(" " + arr[arr.length - i -j][i]+", ");
					
			}
	}

	public static void main(String[] args) {
		initArray();
		printArray();
		task();
		

	}

}
