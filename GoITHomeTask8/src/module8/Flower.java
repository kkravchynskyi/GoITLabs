package module8;

public class Flower {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
	public String toString() {
		return  " Flower : " +  getName();		
	}	
}
