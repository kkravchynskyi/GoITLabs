package module10;

import java.util.Random;

public class RunTask {

	static Cesar ces = new Cesar();
	
	public static void main(String[] args) {
		String str = "";
		str = UtilsModule10.inputText();
		int first = 0;
		int second = 0;
		Random rand = new Random();
		while (UtilsModule10.nod(first, second) != 1 ){
			first = rand.nextInt(100);
			second = rand.nextInt(100);
		}
		str = ces.cryptoCesar(str, first, second, 0);
		System.out.println("Coding str : " + str);
		UtilsModule10.saveFile("text.txt", str);
		str = UtilsModule10.loadFile("text.txt");
		System.out.println("Load from file str : " + str);
		str = ces.cryptoCesar(str, first, second, 1);
		System.out.println("Decoding str : " + str);

	}

}
