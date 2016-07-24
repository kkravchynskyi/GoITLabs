package module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utils.*;


public class RunTask {

	public static void main(String[] args) {
		
		MusicalShop shop = new MusicalShop();
		// init shop :  piano -2,  guitar 16, trumpet 7
		shop.setPianos(2);
		shop.setGuitars(16);
		shop.setTrumpets(7);		
		System.out.println(shop);	    
		List<MusicalInstrument> delInstrument = new ArrayList<>();
		
		HashMap<String, Integer> order = new HashMap<>(); 
		// order: guitar- 7 и trumpet - 2 .
	    order = UtilsModuleSix.inputAllOrders();
	    UtilsModuleSix.printMapOrders(order);	    	    
	    try{
	    	delInstrument = shop.prepareOrder(order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	    
	    order = new HashMap<>(); 
	    //order piano -1
	    order = UtilsModuleSix.inputAllOrders();
	    UtilsModuleSix.printMapOrders(order);
	    
	    try{
	    	delInstrument = shop.prepareOrder(order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	    
	    order = new HashMap<>(); 
	    // order : piano -1, guitar - 5, trumpet - 5
	    order = UtilsModuleSix.inputAllOrders();
	    UtilsModuleSix.printMapOrders(order);

	    try{
	    	delInstrument = shop.prepareOrder(order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	    	   
	}
		     
}
