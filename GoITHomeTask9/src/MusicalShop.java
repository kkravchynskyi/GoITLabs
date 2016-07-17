
import java.util.ArrayList;


public class MusicalShop {
	
	

    public MusicalShop() {
		super();
		this.shop = new ArrayList<ClassMusicalInstrument>();
	}

	private ArrayList<ClassMusicalInstrument> shop;

    public ArrayList<ClassMusicalInstrument> getShoop() {
        return shop;
    }

    public void setShop(ArrayList<ClassMusicalInstrument> shop) {
        this.shop = shop;
    }
    
    public void setNameMusicalInstrument(int i, ClassMusicalInstrument element){
    	 shop.set(i, element);
    }
    
    
	public void printShop() {
    	for(int i =0; i < shop.size(); i++)
			System.out.println(shop.get(i).toString());
	}
	
	public void sotrPrice(){
		ClassMusicalInstrument tmp = new ClassMusicalInstrument();
		for (int i = 0; i < shop.size(); i++) {
			   double min = shop.get(i).getPrice();
			   int min_i = i; 
			   for (int j = i+1; j < shop.size(); j++) {
			      if (shop.get(j).getPrice() < min) {
			         min = shop.get(j).getPrice();
			         min_i = j;
			      }
			   }
			   if (i != min_i) {
				  tmp = shop.get(i);
			      shop.set(i, shop.get(min_i));
			      shop.set(min_i, tmp);
			   }
			 }
						
	}
}
