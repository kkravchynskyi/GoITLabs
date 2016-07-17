import java.util.HashMap;


public class RunTask {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		MusicalShop shop = new MusicalShop();
        shop.setShop(UtilsTask8.initMusicalShop());
        shop.printShop();
        Chamomile chamomile = new Chamomile();
        chamomile.setChamomile(UtilsTask8.initBuket());
        chamomile.printChamomile();
        chamomile.sotrNameFlower();
        chamomile.printChamomile();
        shop.sotrPrice();
        shop.printShop();
        RoseBuch roseBuch = new RoseBuch();
        roseBuch.setRoseBuch(UtilsTask8.initRoseBuch());
        HashMap<String,ClassFlower>  map =  new HashMap<String,ClassFlower>();
        map = UtilsTask8.initMap(chamomile, roseBuch);
        UtilsTask8.printMapFlower(map);       
	}

}
