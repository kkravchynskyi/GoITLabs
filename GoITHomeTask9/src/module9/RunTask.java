package module9;


public class RunTask {
	
	public static MusicalShop shop = new MusicalShop();
	public static MusicalInstrument instrument;
	public static Cesar ces = new Cesar();
	
	public static void main(String[] args) {

			
        shop.setShop(UtilsTask9.initMusicalShop());
        shop.printShop();
        doCrypt(0);
        System.out.println("Coding name musical instrument");
        shop.printShop();
        doCrypt(1);
        System.out.println("Decoding name musical instrument ");
        shop.printShop();
	}
	
	public static void doCrypt(int flag){
		String str = "";
		for(int i=0; i < shop.getShoop().size(); i++){
        	instrument = new MusicalInstrument();
        	instrument = shop.getShoop().get(i);
        	str = instrument.getName();
        	if(flag == 1){
        		str = ces.cryptoCesar(str, 5, 20, flag);
        	}
        	else{
        		str = ces.cryptoCesar(str, 5, 20, flag);
        	}
        	instrument.setName(str);
        	shop.setNameMusicalInstrument(i, instrument);
		}	
	}
	

}
