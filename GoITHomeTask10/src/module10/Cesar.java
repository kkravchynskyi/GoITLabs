
package module10;

import java.util.ArrayList;
import java.util.List;


public class Cesar {
	
	public static List<Character> codeChar = new ArrayList<Character>();
	private final static char[] SYMBOLS = {'.', ',', ';', ':', 
		                         '!', '?', '-', ' '};
		
	static{
		for (char c = 'а'; c <= 'я'; c++) {
			codeChar.add(c);
        }
		for (char c = 'А'; c <= 'Я'; c++) {
			codeChar.add(c);
        }
		// English
		for (char c = 'a'; c <= 'z'; c++) {
			codeChar.add(c);
        }
		for (char c = 'A'; c <= 'Z'; c++) {
			codeChar.add(c);
        }
		for (char c = '0'; c <= '9'; c++) {
			codeChar.add(c);
        }
        
		 for (char c : SYMBOLS) {
			 codeChar.add(c);
         }	 
	}


	String cryptoCesar(String text, int m, int k, int key){
		 int n = codeChar.size();
		 int reversedM = -1;
	        m = m % n;
	        k = k % n;
	        if(key == 0){
	        	if (UtilsModule10.nod(n, m) != 1) {
	        		return null;
	        	}
	        } else{
	             for (int i = 0; i < n; i++) {
	                 if ((i * m) % n == 1) {
	                     reversedM = i;
	                     break;
	                 }
	             }
	        }
	        StringBuilder newText = new StringBuilder();
	        StringBuilder cryptogram = new StringBuilder();
	        for (int i = 0; i < text.length(); i++) {
	            char c = text.charAt(i);
	            int index = codeChar.indexOf(c);
	            if (key == 0){
	            	index = (index * m + k) % n;
	                cryptogram.append(codeChar.get(index));
	            } else {
	            	index = (((index - k) * reversedM) % n + n) % n;
	                newText.append(codeChar.get(index));
	            }
	        } 
	        if (key == 0) return cryptogram.toString();
	        else  return newText.toString();	        
	}
		
}
