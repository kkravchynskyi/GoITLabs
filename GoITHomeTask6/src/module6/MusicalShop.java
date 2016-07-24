package module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MusicalShop {
	
	private int guitars;
	private int pianos;
	private int trumpets;
     	
	public int getGuitars() {
		return guitars;
	}

	public void setGuitars(int guitars) {
		this.guitars = guitars;
	}

	public int getPianos() {
		return pianos;
	}

	public void setPianos(int pianos) {
		this.pianos = pianos;
	}

	public int getTrumpets() {
		return trumpets;
	}

	public void setTrumpets(int trumpets) {
		this.trumpets = trumpets;
	}

	@Override
    public String toString() {
        return "MusicalShop{" + " piano is " + pianos + " guitar is " 
        		+ guitars + " trumpet is " + trumpets;
    } 
	
	public String printRemoveInstruments(List<MusicalInstrument> removeOrder){
		String str = "";
		str = "Remove instruments from shop " + removeOrder.toString();		
		return str;
	}
	
    public List<MusicalInstrument> prepareOrder(HashMap<String, Integer> order) {
		
		Integer numberOfGuitarToRemove = order.get("guitar"); 
		if ((numberOfGuitarToRemove == null)||(numberOfGuitarToRemove < 0) )numberOfGuitarToRemove = 0;
		Integer numberOfPianoToRemove = order.get("piano");
		if ((numberOfPianoToRemove == null)||(numberOfGuitarToRemove < 0)) numberOfPianoToRemove = 0;
		Integer numberOfTrumpetToRemove = order.get("trumpet");
		if ((numberOfTrumpetToRemove == null)||(numberOfGuitarToRemove < 0) ) numberOfTrumpetToRemove = 0;
		
		
        if (getGuitars() < numberOfGuitarToRemove) throw new IllegalStateException();
        if (getTrumpets() < numberOfTrumpetToRemove) throw new IllegalStateException();
        if (getPianos() < numberOfPianoToRemove) throw new IllegalStateException();
        
        
        setGuitars(getGuitars() -  numberOfGuitarToRemove);
        setPianos(getPianos() - numberOfPianoToRemove);
        setTrumpets(getTrumpets() - numberOfTrumpetToRemove);
        
        
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
