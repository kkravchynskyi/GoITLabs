package module8;

import java.util.ArrayList;


public class RoseBuch extends Flower{
	
	private ArrayList<Flower> roseBuch;
	
	public RoseBuch() {
		super();
		this.roseBuch = new ArrayList<Flower>();
	}

	public ArrayList<Flower> getRoseBuch() {
		return roseBuch;
	}

	public void setRoseBuch(ArrayList<Flower> roseBuch) {
		this.roseBuch = roseBuch;
	}
	
	public void printRoseBuch() {
		System.out.println(" RoseBuch : ");
    	for(int i =0; i < roseBuch.size(); i++)
			System.out.println(roseBuch.get(i).toString());
	}

}
