package task4;

import java.util.Scanner;

public class Task2_4 {
	
	enum CodeSymbol{
		a, b, c, d, e, f, g, h, i, j		
	}
	
	private static Scanner scan = new Scanner(System.in);
	//static CodeSymbol codeSymbol = CodeSymbol.a;
	
	static String input(){
		System.out.println("Input expression abd.. where str : [a..j]");
		String str = scan.nextLine();
		str = str.trim(); 
		return str.toLowerCase();
	} 

	static int parseSymbol(String ch){
		return CodeSymbol.valueOf(ch).ordinal();
	}
	
	static String parseStrToDigit(String str){
		String res = "",  strCh = "";
		for(int i = 0; i < str.length(); i++ ){
			strCh = str.substring(i, i+1);	
			res = res + parseSymbol(strCh);
		}	
		return res;
	}
	
	public static void main(String[] args) {
		String codeStr = input();
		System.out.println("Digit is : " + parseStrToDigit(codeStr));
	}

}
