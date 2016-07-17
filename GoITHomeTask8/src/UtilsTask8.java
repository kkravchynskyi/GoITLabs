import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class UtilsTask8 {
	
	public static ArrayList<ClassMusicalInstrument> initMusicalShop(){
		ArrayList<ClassMusicalInstrument> shp = new ArrayList<ClassMusicalInstrument>();
		ClassMusicalInstrument instrum;
		Random rand = new Random(100);
		for(int i=0; i < 10; i++){
			instrum = new ClassMusicalInstrument();
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
	
	public static ArrayList<ClassFlower> initBuket(){
		ArrayList<ClassFlower> buk = new ArrayList<ClassFlower>();
		ClassFlower fl;
		for(int i=0; i < 10; i++){
			fl = new ClassFlower();
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
	
	public static ArrayList<ClassFlower> initRoseBuch(){
		ArrayList<ClassFlower> roseBuch = new ArrayList<ClassFlower>();
		ClassFlower fl = new ClassFlower();
		fl.setName("rose");
		for(int i=0; i < 6; i++){
			roseBuch.add(fl);
		}
		return roseBuch;
	}	
	
	public static HashMap<String,ClassFlower> initMap(Chamomile chamomile, RoseBuch roseBuch){
		HashMap<String,ClassFlower> map1 = new HashMap<String,ClassFlower>();
		for(int i=0; i < chamomile.getChamomile().size(); i++){
			map1.put("Chamomile", chamomile.getChamomile().get(i));
		}
		for(int i=0; i < roseBuch.getRoseBuch().size(); i++){
			map1.put("RoseBuch", roseBuch.getRoseBuch().get(i));
		}	
		return map1;
	}
	
	public static void printMapFlower(HashMap<String,ClassFlower> map){
		System.out.println("Flovers is : ");
		for (HashMap.Entry<?, ?> entry : map.entrySet())
		      System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
		
	}
}
