


public class RunTask {
	
	public static MusicalShop shop = new MusicalShop();
	public static ClassMusicalInstrument instrument;
	public static Cesar ces = new Cesar();
	
	public static void main(String[] args) {

		String test = "абра кодабра - abcdfg";
		System.out.println(test);
		String str = ces.crypt(test, 5, 20);
		System.out.println(str);
		str = ces.decrypt(str, 5, 20);
		System.out.println(str);
		
        shop.setShop(UtilsTask8.initMusicalShop());
        shop.printShop();
        doCrypt(1);
        System.out.println("Coding name musical instrument");
        shop.printShop();
        doCrypt(0);
        System.out.println("Decoding name musical instrument ");
        shop.printShop();
	}
	
	public static void doCrypt(int flag){
		String str = "";
		for(int i=0; i < shop.getShoop().size(); i++){
        	instrument = new ClassMusicalInstrument();
        	instrument = shop.getShoop().get(i);
        	str = instrument.getName();
        	if(flag == 1){
        		str = ces.crypt(str, 5, 20);
        	}
        	else{
        		str = ces.decrypt(str, 5, 20);
        	}
        	instrument.setName(str);
        	shop.setNameMusicalInstrument(i, instrument);
		}	
	}
	

}
