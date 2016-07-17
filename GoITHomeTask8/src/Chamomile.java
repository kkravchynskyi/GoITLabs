import java.util.ArrayList;


public class Chamomile extends ClassFlower {
	
	private ArrayList<ClassFlower> chamomile;

	public ArrayList<ClassFlower> getChamomile() {
		return chamomile;
	}

	public void setChamomile(ArrayList<ClassFlower> chamomile) {
		this.chamomile = chamomile;
	}

	public Chamomile() {
		super();
		this.chamomile = new ArrayList<ClassFlower>();
	}
	
	public void printChamomile() {
		System.out.println(" Chamomile : ");
    	for(int i =0; i < chamomile.size(); i++)
			System.out.println(chamomile.get(i).toString());
	}
	
	public void sotrNameFlower(){
		ClassFlower tmp = new ClassFlower();
		for (int i = 0; i < chamomile.size(); i++) {
			   String min = chamomile.get(i).getName();
			   int min_i = i; 
			   for (int j = i+1; j < chamomile.size(); j++) {
			      if (chamomile.get(j).getName().compareTo(min) < 0) {
			         min = chamomile.get(j).getName();
			         min_i = j;
			      }
			   }
			   if (i != min_i) {
				  tmp = chamomile.get(i);
				  chamomile.set(i, chamomile.get(min_i));
				  chamomile.set(min_i, tmp);
			   }
			 }
						
	}
}
