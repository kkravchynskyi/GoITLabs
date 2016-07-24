package module8;

import java.util.ArrayList;


public class MusicalShop {
	
	

    public MusicalShop() {
		super();
		this.shop = new ArrayList<MusicalInstrument>();
	}

	private ArrayList<MusicalInstrument> shop;

    public ArrayList<MusicalInstrument> getShoop() {
        return shop;
    }

    public void setShop(ArrayList<MusicalInstrument> shop) {
        this.shop = shop;
    }
    
    
	public void printShop() {
    	System.out.println(shop.toString());
	}
	
	public void sotrPrice(){
		MusicalInstrument tmp = new MusicalInstrument();
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
