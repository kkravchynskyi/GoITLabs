package task6;

import java.util.Arrays;
import java.util.Random;

public class Task1_6 {
	
	static int[][] arr = new int[4][4];
	
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
    	int sizeX = arr.length, sizeY = arr.length;
    	int CorrectY = 0;
    	int CorrectX = 0;
    	  while( sizeY > 0 )
    	  {
    	    for ( int y = 0; y < 4; y++ )
    	    {
    	      for ( int x = 0; x < ( ( sizeX < sizeY ) ? sizeY : sizeX ); x++ )
    	      {
    	        if ( y == 0 && x < sizeX - CorrectX  )
    	        	System.out.print(" " + arr[y + CorrectY][x + CorrectX] + ", "); 
    	            
    	        if ( y == 1 && x < sizeY - CorrectY && x != 0  )
    	        	System.out.print(" " + arr[x + CorrectY][sizeX - 1] + ", ");
    	        	
    	        if ( y == 2 && x < sizeX - CorrectX && x != 0 )
    	        	System.out.print(" " + arr[sizeY - 1][sizeX - (x + 1)] + ", ");
	        	    
    	        if ( y == 3 && x < sizeY - ( CorrectY + 1 ) && x != 0  )
    	        	System.out.print(" " + arr[sizeY - (x + 1)][CorrectY] + ", ");
    	      }
    	    }
    	    sizeY--;
    	    sizeX--;
    	    CorrectY += 1;
    	    CorrectX += 1;
    	  }
    }
	
	public static void main(String[] args) {
		initArray();
		printArray();
		task();
	}

}
