package module5;

import java.util.Arrays;
import java.util.Random;

//1 Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
//2 Выбрать один из алгоритмов сортировки массивов и реализовать его 

public class WorksWithArray {
	
	private int[] arr;
	private int min;
	private int max;
	
	void inputData(){
	  Random rand = new Random(100);
      arr = new int[20];
      for(int i=0; i < arr.length; i++){
    	 arr[i] = rand.nextInt(15) - 5; // случайные значения от -5 до 10
      }
	}
	
	void printArr(){
		System.out.println(" Массив заполненный случайно :");
		System.out.println(Arrays.toString(arr));
	}
	
	void printMinMax(){
		System.out.println(" min эл-т массива : " + min + " max эл-т массива : " + max);
	}
	
	void findMaxMin(){
		max = arr[0];
		min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
	}
	
	void sortSelection(){
		 for (int i = 0; i < arr.length; i++) {
		   /*Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным */
		   int min = arr[i];
		   int min_i = i; 
		   /*В оставшейся части подмножества ищем элемент, который меньше предположенного минимума*/
		   for (int j = i+1; j < arr.length; j++) {
		     //Если находим, запоминаем его индекс
		      if (arr[j] < min) {
		         min = arr[j];
		         min_i = j;
		      }
		   }
		   /*Если нашелся элемент, меньший, чем на текущей позиции меняем их местами*/
		   if (i != min_i) {
		      int tmp = arr[i];
		      arr[i] = arr[min_i];
		      arr[min_i] = tmp;
		   }
		 }
		 printSortArr();
	}
    
	void printSortArr(){
		System.out.println(" Отсортированный массив :");
		System.out.println(Arrays.toString(arr));
	}

}
