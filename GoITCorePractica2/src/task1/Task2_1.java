package task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2_1 {
	
	@SuppressWarnings("resource")
	static String input(){
		System.out.println("Input expression a + b where a, b : [0..1a..z]");
		String str = new Scanner(System.in).nextLine();
		str = str.trim(); 
		return str.toLowerCase();
	} // String input
	
	static int stringToNotation36(String s){
		byte[] b = new byte[1];		
		b = s.getBytes();
		Character ch = (char)b[0];
		if (Character.isDigit(ch) == true) return Integer.parseInt(s);
		else return (int)b[0] - 87;
	}
	
    static String sumToNotation36(int sum){
    	String str = "";
    	int a = 0;
    	 while (sum > 0) {
 		    a = sum % 36;
 		    if (a < 10) {
 		    	str = str + a;
 		    }
 		    else {
 		    	str = str + (char)(a + 87);
 		    }
 		    sum /= 36;
 		    }
    	
    	return str;
    }

	public static void main(String[] args) {
		String str = input();
		StringTokenizer st = new StringTokenizer(str," \t\n\r.+");
		int sum =0;
		while (st.hasMoreTokens()) {
			sum +=stringToNotation36(st.nextToken());		      
		}
		System.out.println(sumToNotation36(sum));
	
	}

}
