package task3;

import java.util.Arrays;
import java.util.Random;

public class Task1_3 {

	static int[] arr = new int[10];
	
	public static void initArray(){
		Random rand = new Random(80);
		for(int i=0; i < arr.length; i++)			
			arr[i] = rand.nextInt(20);
		
	}
	
	static int searchIndexOddNumber(){
		for(int i=0; i < arr.length; i++){
			if(arr[i]%2 == 1 ) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		initArray();
		System.out.println("Array :" + Arrays.toString(arr));
		System.out.println("index odd number is  " + searchIndexOddNumber());

	}

}
