package module6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	
	
}
