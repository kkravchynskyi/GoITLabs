package module9;

public class MusicalInstrument {

    private String type;
    private String name;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
	public String toString() {
		return  " MusicalInstrument : " + getName() + " | " + getPrice() + " | ";		
	}	
}
