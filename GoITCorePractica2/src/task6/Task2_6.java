package task6;

import java.util.Scanner;

public class Task2_6 {
	
	private static int a, b;
	private static Scanner scan = new Scanner(System.in);
	
	static void input(){
		System.out.println("input integer number  > 0 :");
		a = scan.nextInt();
		System.out.println(" input number bit to change  i : [1 ..32]");
		b = scan.nextInt();
	}	
	
	
	static String changeIBit(int number, int i){
		String s = Integer.toBinaryString(a);	
		String res = "";
		char[] arrCh = new char[s.length()];
		arrCh =s.toCharArray();
		System.out.println(s.length());
		if(i <= s.length()){
			for (int j = 0; j < s.length(); j++){
				if ( i != (s.length() - j)) res = res + arrCh[j];
				else res = res + '0';
			}    
		}
		return res;		
	}
	
	static int stringBinaryToInt(String str){
		int a = 0, i = 0;
		char[] arrCh = new char[str.length()];
		arrCh =str.toCharArray();	
		for(int j = str.length() - 1 ; j >= 0; j--){
			if (arrCh[j] == '1'){
				a = (a + (1 << i));
			}
			i++;
		}	
		return a;
	}
	
	public static void main(String[] args) {
		input();
		String s = Integer.toBinaryString(a);
		System.out.println(" binary code " + a + " is : " + s);
		s = changeIBit(a,b);
		System.out.println(" change to 0 bit number " + b);	
		System.out.println("binary code after change : " + s);
		System.out.println(" Integer number after change : " + Integer.parseUnsignedInt(s, 2));
		System.out.println(" Second metod binary code string to integer : " + 
		                      stringBinaryToInt(s));
	}

}
