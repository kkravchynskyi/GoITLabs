package module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


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
	    order = UtilsModuleSix.inputOrders();
	    UtilsModuleSix.printMapOrders(order);
	    	    
	    try{
	    	delInstrument = prepareOrder(shop, order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	    
	    order = new HashMap<>(); 
	    //order piano -1
	    order = UtilsModuleSix.inputOrders();
	    UtilsModuleSix.printMapOrders(order);
	    
	    try{
	    	delInstrument = prepareOrder(shop, order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	    
	    order = new HashMap<>(); 
	    //пришел заказ на 1 фортепиано, 5 гитар и 5 труб
	    // order : piano -1, guitar - 5, trumpet - 5
	    order = UtilsModuleSix.inputOrders();
	    UtilsModuleSix.printMapOrders(order);

	    try{
	    	delInstrument = prepareOrder(shop, order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	    
	    
	}
	
	   
	
	private static List<MusicalInstrument> prepareOrder(MusicalShop shop, HashMap<String, Integer> order) {
		
		Integer numberOfGuitarToRemove = order.get("guitar"); 
		if ((numberOfGuitarToRemove == null)||(numberOfGuitarToRemove < 0) )numberOfGuitarToRemove = 0;
		Integer numberOfPianoToRemove = order.get("piano");
		if ((numberOfPianoToRemove == null)||(numberOfGuitarToRemove < 0)) numberOfPianoToRemove = 0;
		Integer numberOfTrumpetToRemove = order.get("trumpet");
		if ((numberOfTrumpetToRemove == null)||(numberOfGuitarToRemove < 0) ) numberOfTrumpetToRemove = 0;
		
		
        if (shop.getGuitars() < numberOfGuitarToRemove) throw new IllegalStateException();
        if (shop.getTrumpets() < numberOfTrumpetToRemove) throw new IllegalStateException();
        if (shop.getPianos() < numberOfPianoToRemove) throw new IllegalStateException();
        
        
        shop.setGuitars(shop.getGuitars() -  numberOfGuitarToRemove);
        shop.setPianos(shop.getPianos() - numberOfPianoToRemove);
        shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetToRemove);
        
        
        List<MusicalInstrument> result = new ArrayList<>();
        for (int i = 0; i < numberOfGuitarToRemove; i++) {
            result.add(new Guitar());
        }
        for (int i = 0; i < numberOfPianoToRemove; i++) {
            result.add(new Piano());
        }
        
        for (int i = 0; i < numberOfTrumpetToRemove; i++) {
            result.add(new Trumpet());
        }
        
        return result;
    }

}
