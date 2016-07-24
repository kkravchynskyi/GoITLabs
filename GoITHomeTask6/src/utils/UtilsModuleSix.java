package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import module6.*;

public class UtilsModuleSix {
		
	public static int quantity = 0;
	public static String instrument = "";
	public static List<String> instrInShop = new ArrayList<String>();
	
	public static void createListMusicInstrumet(){
		   instrInShop.add("piano");
	       instrInShop.add("guitar");
	       instrInShop.add("trumpet");
	}
	
	
	public static HashMap<String, Integer> inputAllOrders(){
		HashMap<String, Integer> order = new HashMap<>();
	   //  Scanner scan = new Scanner(System.in);
	   	 int j = inputQuantityInstrument();	
	   	 createListMusicInstrumet();
	     System.out.println("intut name music instrumets and quantity musical instruments: piano, guitar, trumpet");
	     for(int i = 0; i < j; i ++){
	    	 inputNameInstrument();
	    	 inputQuantityInstrumentInOrder();	    
	    	 order.put(instrument, quantity);	    
	     }    
	     return order;
	}
	
	@SuppressWarnings("resource")
	public static int inputQuantityInstrument(){
		Scanner scan = new Scanner(System.in);
		System.out.println("input quantity musical instruments in orders 1..3 ");
	    try{
        	int j = scan.nextInt();
        	return j;
	    }
	    catch( InputMismatchException ex){
	    	 System.out.println("data shoud be an Integer");
	    }
	    return inputQuantityInstrument();
	}
	
	@SuppressWarnings("resource")
	public static void inputNameInstrument(){
	    Scanner scan = new Scanner(System.in);
		System.out.println("input name music instrumet");
		instrument = scan.nextLine();
		if( ! instrInShop.contains(instrument))  //throw new  NullMapException(instrument);
			try {
				throw new  NullMapException(instrument);
			} catch (NullMapException e) {
				System.out.println("don't instrument " + e.getNameNullInstruments() + " in shop");
				//e.printStackTrace();
				inputNameInstrument();
			}		
		
	}
	
	@SuppressWarnings("resource")
	public static void inputQuantityInstrumentInOrder(){
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("input quantity");
			quantity = scan.nextInt();
	     }
	     catch( InputMismatchException ex){
	    	 System.out.printf("data shoud be an Integer");
	    	 inputQuantityInstrumentInOrder();
	     }
	}
	
	
	public static void printMapOrders(HashMap<String, Integer> order){
		System.out.println("orders is : ");
		for (HashMap.Entry<?, ?> entry : order.entrySet())
		      System.out.println(entry.getKey() + " " + entry.getValue());  		
	}
}
