package module8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class UtilsTask8 {
	
	public static ArrayList<MusicalInstrument> initMusicalShop(){
		ArrayList<MusicalInstrument> shp = new ArrayList<MusicalInstrument>();
		MusicalInstrument instrum;
		Random rand = new Random(100);
		for(int i=0; i < 10; i++){
			instrum = new MusicalInstrument();
			int j = i % 3;
			double price = rand.nextDouble()* 1000;
			instrum.setPrice(price);
			switch(j){
				case 0: instrum.setName("guitar");
						break;
				case 1: instrum.setName("piano");
						break; 
				case 2: instrum.setName("trumpet");
						break;	
				default: continue;			
			}
			shp.add(instrum);
		}
		return shp;
	}
	
	public static ArrayList<Flower> initBuket(){
		ArrayList<Flower> buk = new ArrayList<Flower>();
		Flower fl;
		for(int i=0; i < 10; i++){
			fl = new Flower();
			int j = i % 3;
			switch(j){
				case 0: fl.setName("rose");
						break;
				case 1: fl.setName("tulip");
						break; 
				case 2: fl.setName("aster");
						break;
			 default: continue;			
			}
			buk.add(fl);
		}				
		return buk;
	}
	
	public static ArrayList<Flower> initRoseBuch(){
		ArrayList<Flower> roseBuch = new ArrayList<Flower>();
		Flower fl = new Flower();
		fl.setName("rose");
		for(int i=0; i < 6; i++){
			roseBuch.add(fl);
		}
		return roseBuch;
	}	
	
	public static HashMap<String,Flower> initMap(BouquetFlower chamomile, RoseBuch roseBuch){
		HashMap<String,Flower> map1 = new HashMap<String,Flower>();
		for(int i=0; i < chamomile.getBouquet().size(); i++){
			map1.put("Chamomile", chamomile.getBouquet().get(i));
		}
		for(int i=0; i < roseBuch.getRoseBuch().size(); i++){
			map1.put("RoseBuch", roseBuch.getRoseBuch().get(i));
		}	
		return map1;
	}
	
	public static void printMapFlower(HashMap<String,Flower> map){
		System.out.println("Flovers is : ");
		for (HashMap.Entry<?, ?> entry : map.entrySet())
		      System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
		
	}
}
