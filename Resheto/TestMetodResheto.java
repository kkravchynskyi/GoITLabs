package module;

import java.util.Scanner;

public class TestMetodResheto {
	
	private static Scanner scan = new Scanner(System.in);
	static int arr[]; 
	private static final int MAX_VALUE = Integer.MAX_VALUE;
	
	static int inputCount(){
                // ввод значения до которого ищем простые числа
		System.out.println("Input count number integer type. Max value = " + MAX_VALUE);
		long i = scan.nextLong();
		if (i > MAX_VALUE )
		   inputCount();
		return (int) i;
	}
      
	// поиск простых чисел и запись их в массив 
	static void resheto(int count){
		arr = new int[count+1];		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
	        // Заполнение массива. 0 - не простые числа, 1 - могут быть простыми. Число - индекс массива. Заполняе только не четные числа,
                // т.к. все четные - не простые
		for(int i=3; i < count +1; i+=2){
			arr[i] = 1;
			arr[i+1] = 0;
		}	
		int c =0;  // счетчик итераций
		// в цикле идем с шагом 2  - по нечетным, и проверка до квадрата i		
		for(long i=3; i*i < count+1; i+=2 ){
			
			if (arr[(int)i] != 0){

				for (long j=i*i; j < count; j= j +(i)*2){ 
					
					 arr[(int)j] = 0;
					 c++;						 
				}	
				c++;        
			}
		}
		System.out.println();
		System.out.println("  iteration is =  " + c );
	}
	
        //  вывод чисел из массива
	static void printPrimeNumber(){
		System.out.println("Prime number : ");
		for(int i=2; i < arr.length; i++){
			if (arr[i] != 0)
			    System.out.print(i + ", ");
		}
			
	}

	public static void main(String[] args) {
		resheto(inputCount());
		printPrimeNumber();
	}

}
