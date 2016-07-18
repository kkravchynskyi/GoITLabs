package module10;

public class RunTask {

	public static Cesar ces = new Cesar();
	
	public static void main(String[] args) {
		String str = "";
		str = UtilsModule10.inputText();
		str = ces.crypt(str, 5, 20);
		System.out.println("Coding str : " + str);
		UtilsModule10.saveFile("text.txt", str);
		str = UtilsModule10.loadFile("text.txt");
		System.out.println("Load from file str : " + str);
		str = ces.decrypt(str, 5, 20);
		System.out.println("Decoding str : " + str);

	}

}
