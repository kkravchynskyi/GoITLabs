package module8;

import java.util.ArrayList;


public class BouquetFlower extends Flower {
	
	private ArrayList<Flower> bouquet;

	public ArrayList<Flower> getBouquet() {
		return bouquet;
	}

	public void setBouquet(ArrayList<Flower> bouquet) {
		this.bouquet = bouquet;
	}

	public BouquetFlower() {
		super();
		this.bouquet = new ArrayList<Flower>();
	}
	
	public void printBouquet() {
		System.out.println(" Bouquet : ");
    	for(int i =0; i < bouquet.size(); i++)
			System.out.println(bouquet.get(i).toString());
	}
	
	public void sotrNameFlower(){
		Flower tmp = new Flower();
		for (int i = 0; i < bouquet.size(); i++) {
			   String min = bouquet.get(i).getName();
			   int min_i = i; 
			   for (int j = i+1; j < bouquet.size(); j++) {
			      if (bouquet.get(j).getName().compareTo(min) < 0) {
			         min = bouquet.get(j).getName();
			         min_i = j;
			      }
			   }
			   if (i != min_i) {
				  tmp = bouquet.get(i);
				  bouquet.set(i, bouquet.get(min_i));
				  bouquet.set(min_i, tmp);
			   }
			 }
						
	}
}
