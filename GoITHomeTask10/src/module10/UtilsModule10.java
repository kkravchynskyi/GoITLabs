package module10;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UtilsModule10 {
	
	@SuppressWarnings("resource")
	public static String inputText(){
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Input text");
		str = scan.nextLine();
		return str;
	}
	
	public static void saveFile(String fileName, String text){
		 try  (PrintWriter pw = new PrintWriter(fileName)) {
			    pw.println(text);
		  }
		  catch (IOException ex) {
		    ex.printStackTrace();
		  }				 				 
	}
	
	public static String loadFile(String fileName){
		String str = "";
		  try (Scanner scanner = new Scanner(new FileReader(fileName))){
			  str = scanner.nextLine();
		  }
		  catch (IOException ex) {
			    ex.printStackTrace();
		}
		return str;
	}
	
	public static int nod(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

}
