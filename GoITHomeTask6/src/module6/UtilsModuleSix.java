package module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilsModuleSix {
	
	public static final String piano = "piano";
	public static final String guitar = "guitar";
	public static final String trumpet = "trumpet";
	
	public static int quantity = 0;
	public static String instrument = "";
	
	@SuppressWarnings("resource")
	public static HashMap<String, Integer> inputOrders(){
		int j =0;
		HashMap<String, Integer> order = new HashMap<>();
	     Scanner scan = new Scanner(System.in);
	     System.out.println("input quantity musical instruments in orders");
	     try{
         	 j = scan.nextInt();
	     }
	     catch( InputMismatchException ex){
	    	 System.out.printf("data shoud be an Integer");
			 System.out.println();
			 inputOrders();
			 return order;
	     } 
	     
	     System.out.println("intut name music instrumets and quantity musical instruments: piano, guitar, trumpet");
	     for(int i = 0; i < j; i ++){	
	        inputOrder();		    
	    	order.put(instrument, quantity);	    
	     }
	     return order;
	}
	
	@SuppressWarnings("resource")
	public static void inputOrder()    {   
		 ArrayList<String> instrInShop = new ArrayList<String>();
	       instrInShop.add("piano");
	       instrInShop.add("guitar");
	       instrInShop.add("trumpet");
		Scanner scan = new Scanner(System.in);
		System.out.println("input name music instrumet");
		instrument = scan.nextLine();
		if( ! instrInShop.contains(instrument))  //throw new  NullMapException(instrument);
		try {
			throw new  NullMapException(instrument);
		} catch (NullMapException e) {
			System.out.println("don't instrument " + e.getNameNullInstruments() + " in shop");
			//e.printStackTrace();
			inputOrder();
			return;
		}		
		try{
			System.out.println("input quantity");
			quantity = scan.nextInt();
	     }
	     catch( InputMismatchException ex){
	    	 System.out.printf("data shoud be an Integer");
			 System.out.println();
			 inputOrder();
			 return;
	     } 
	}
	
	
	public static void printMapOrders(HashMap<String, Integer> order){
		System.out.println("orders is : ");
		for (HashMap.Entry<?, ?> entry : order.entrySet())
		      System.out.println(entry.getKey() + " " + entry.getValue());  		
	}
}
