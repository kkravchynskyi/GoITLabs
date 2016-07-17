import java.util.ArrayList;
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
	
	
	
	
}
