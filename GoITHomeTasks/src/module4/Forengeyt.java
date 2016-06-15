package module4;

public class Forengeyt {
	
     private double celsiy;
     private double forengeyt;
     private int key;
     
	public double getCelsiy() {
		return celsiy;
	}
	public void setCelsiy(double celsiy) {
		this.celsiy = celsiy;
	}
	public double getForengeyt() {
		return forengeyt;
	}
	public void setForengeyt(double forengeyt) {
		this.forengeyt = forengeyt;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
     
    public void slove(){
    	if (key == 0){
    	  // from celsyi to forengeyt
    		forengeyt = ((celsiy * 9.0)/5.0 + 32);    		
    	}
    	else {
    		celsiy = (((forengeyt - 32)*5.0)/9.0);
    	}
    }
	@Override
	public String toString() {
		String str = "";
		if (key == 0){
			str = " значение температуры в цельсии = " + getCelsiy() + "  = значение по форенгейту = " + getForengeyt();
		}
		else str = " значение температуры по форенгейту  = " + getForengeyt()  + "  = значение в цельсии = " + getCelsiy();
		return str;
	}
    
    
}
