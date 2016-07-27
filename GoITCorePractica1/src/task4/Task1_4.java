package task4;

import java.util.Arrays;
import java.util.Random;

public class Task1_4 {

    static int[] arr = new int[10];
	
	static void initArray(){
		Random rand = new Random(80);
		for(int i=0; i < arr.length; i++)			
			arr[i] = rand.nextInt(20) - 10;
	}
	
	static int searchMaxInArray(){
		int max = arr[0];
		for(int i=1; i < arr.length; i++){
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		initArray();
		System.out.println("Array :" + Arrays.toString(arr));
		System.out.println("max in array is  : " + searchMaxInArray());

	}

}
