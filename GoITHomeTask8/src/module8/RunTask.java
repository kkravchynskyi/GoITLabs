package module8;

import java.util.HashMap;


public class RunTask {

	public static  void main(String[] args) {
		MusicalShop shop = new MusicalShop();
        shop.setShop(UtilsTask8.initMusicalShop());
        shop.printShop();
        BouquetFlower bouquet = new BouquetFlower();
        bouquet.setBouquet(UtilsTask8.initBuket());
        bouquet.printBouquet();
        bouquet.sotrNameFlower();
        bouquet.printBouquet();
        shop.sotrPrice();
        shop.printShop();
        RoseBuch roseBuch = new RoseBuch();
        roseBuch.setRoseBuch(UtilsTask8.initRoseBuch());
        HashMap<String,Flower>  map =  new HashMap<String,Flower>();
        map = UtilsTask8.initMap(bouquet, roseBuch);
        UtilsTask8.printMapFlower(map);       
	}

}
