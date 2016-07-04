package module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

/*
 * Добавить в магазин инструментов метод, который готовит к отгрузке партию 
 * музыкальных инструментов согласно заказу.
 * Сигнатура метода:
 * public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
 * В заказе (Map<String, Integer> order) хранится название инструмента и 
 * количество необходимых инструментов. Ключем в заказе является одна из строк 
 * "piano", "guitar", "trumpet"
 * Создать свое исключение, которое будет брошено в случае, когда ключ в заказе 
 * другой.
 * Каким-то образом (самостоятельно выбрать решение) обработать ситуацию, когда 
 * количество элементов в заказе отрицательное, нулевое.
 * После выполнения метода из магазина должны пропасть те инструменты, которые 
 * были отгружены.
 * В случае, когда количество запрашиваемых инструментов определенного типа больше, 
 * чем количество доступных инструментов в магазине, должно быть брошено 
 * исключение. Выбрать наиболее подходящее из доступных в стандартной библиотеке 
 * исключений 
 * Пример:
 * в магазине было 2 фортепиано, 16 гитар и 7 труб.
 * пришел заказ на 7 гитар и 2 трубы.
 * после выполнения заказа в магазине осталось 2 фортепиано, 9 гитар и 5 труб
 * пришел заказ на 1 фортепиано
 * после выполнения заказа в магазине осталось 1 фортепиано, 9 гитар и 5 труб
 * пришел заказ на 1 фортепиано, 8 гитар и 6 труб
 * товар не был отгружен (было брошено исключение)
 * в магазине осталось 1 фортепиано, 9 гитар и 5 труб
 */

public class RunTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicalShop shop = new MusicalShop();
		//  в магазине было 2 фортепиано, 16 гитар и 7 труб.
		shop.setPianos(2);
		shop.setGuitars(16);
		shop.setTrumpets(7);
		
		System.out.println(shop);
	    
		List<MusicalInstrument> delInstrument = new ArrayList<>();
		
	    Map<String, Integer> order = new HashMap<>(); 
		// пришел заказ на 7 гитар и 2 трубы.
	    order.put("guitar", 7);
	    order.put("trumpet", 2);
	    
	    try{
	    	delInstrument = prepareOrder(shop, order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	    
	    order = new HashMap<>(); 
	    //пришел заказ на 1 фортепиано
	    order.put("piano", 1);
	    
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
	    order.put("piano", 1);
	    order.put("guitar", 5);
	    order.put("trumpet", 5);
	    
	    try{
	    	delInstrument = prepareOrder(shop, order);
	    }
       catch( IllegalStateException ex){
    	   System.out.printf("orders > shop");
       }
	   
	    System.out.println(shop.printRemoveInstruments(delInstrument));
	    System.out.println(shop);
	}
	
	private static List<MusicalInstrument> prepareOrder(MusicalShop shop, Map<String, Integer> order) {
		
		Integer numberOfGuitarToRemove = order.get("guitar"); 
		if (numberOfGuitarToRemove == null) numberOfGuitarToRemove = 0;
		Integer numberOfPianoToRemove = order.get("piano");
		if (numberOfPianoToRemove == null) numberOfPianoToRemove = 0;
		Integer numberOfTrumpetToRemove = order.get("trumpet");
		if (numberOfTrumpetToRemove == null) numberOfTrumpetToRemove = 0;
		
		
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
