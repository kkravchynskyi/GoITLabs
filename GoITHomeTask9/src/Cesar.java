import java.util.ArrayList;
import java.util.List;


public class Cesar {
	
	List<Character> codeChar = new ArrayList<Character>();
	private final static char[] SYMBOLS = {'.', ',', ';', ':', 
		                         '!', '?', '-', ' '};
		
	public Cesar() {
		// Russion
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
	
	// coding
	String crypt(String text, int m, int k) {
        int n = codeChar.size();
        m = m % n;
        k = k % n;
        if (nod(n, m) != 1) {
            return null;
        }
        StringBuilder cryptogram = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = codeChar.indexOf(c);
            index = (index * m + k) % n;
            cryptogram.append(codeChar.get(index));
        }
        return cryptogram.toString();
    }
	
	//decoding
	public String decrypt(String text, int m, int k){
        int n = codeChar.size();
        m = m % n;
        k = k % n;
        int reversedM = -1;
        for (int i = 0; i < n; i++) {
            if ((i * m) % n == 1) {
                reversedM = i;
                break;
            }
        }
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = codeChar.indexOf(c);
            index = (((index - k) * reversedM) % n + n) % n;
            newText.append(codeChar.get(index));
        }
        return newText.toString();

    }


	private static int nod(int a, int b) {
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
