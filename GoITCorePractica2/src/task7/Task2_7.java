package task7;

import java.util.Scanner;

public class Task2_7 {
	
	private static String a = "", b = "";
	private static Scanner scan = new Scanner(System.in);
	
	static void inputBinaryString(){
		System.out.println("input first string, symbol may be  [0..1] :");
		a = scan.nextLine();
		if (isNormalStringBinaryCode(a) == false) {
			System.out.println("string is not binary code");
			inputBinaryString();
		}
		System.out.println("input second string, symbol may be  [0..1] :");
		b = scan.nextLine();
		if (isNormalStringBinaryCode(a) == false) {
			System.out.println("string is not binary code");
			inputBinaryString();
		}
		
	}
	
	
	static boolean isNormalStringBinaryCode(String s){
		char[] arrCh = new char[s.length()];
		arrCh =s.toCharArray();
		boolean res = true;
		int i = 0;
		while((i < s.length()) && (res == true)){
			if ((arrCh[i] != '0') && (arrCh[i] != '1')) res = false;
			i++;
		}
		return res;
	}	

	
	public static void main(String[] args) {
		inputBinaryString();
		System.out.println("first number " + a + " 10 notation : " + Integer.parseUnsignedInt(a, 2));
		System.out.println("second number " + b + " 10 notation : " + Integer.parseUnsignedInt(b, 2));
		int sum = Integer.parseUnsignedInt(a, 2) + Integer.parseUnsignedInt(b, 2);
		System.out.println("sum = " + sum);
		System.out.println("sum in binary code : " + Integer.toBinaryString(sum));      
	}

}
