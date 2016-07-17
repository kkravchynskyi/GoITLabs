import java.util.ArrayList;


public class RoseBuch extends ClassFlower{
	
	private ArrayList<ClassFlower> roseBuch;
	
	public RoseBuch() {
		super();
		this.roseBuch = new ArrayList<ClassFlower>();
	}

	public ArrayList<ClassFlower> getRoseBuch() {
		return roseBuch;
	}

	public void setRoseBuch(ArrayList<ClassFlower> roseBuch) {
		this.roseBuch = roseBuch;
	}
	
	public void printRoseBuch() {
		System.out.println(" Chamomile : ");
    	for(int i =0; i < roseBuch.size(); i++)
			System.out.println(roseBuch.get(i).toString());
	}

}
