package task5;

import java.util.Scanner;

public class Task2_5 {
	
	private static int a;
	private static Scanner scan = new Scanner(System.in);
	
	
	static void input(){
		System.out.println("input integer number  > 0 :");
		a = scan.nextInt();
	}	
	
    static int countLengthBynaryNumb(int n){
    	int count = 0;
    	while((n / (1<< count)) > 0){
			count++;
		}
    	return count;
    }
	
	static String intToBit(int n){
		int count = 0, a = 0;
		String s = "";
		count = countLengthBynaryNumb(n);
		System.out.println(" kol bit = " + count);
		for(int i=count; i>0; i--){
			a =( n / (1 << (i-1)));
			if(a == 1){
				s = s + "1";
				n = n - (1 << (i-1));
			}
			else s = s + "0";
		}
		System.out.println(" s = " + s);
		return s;
	}


	public static void main(String[] args) {
		input();
		String s = Integer.toBinaryString(a);
		System.out.println("binary code number " + a + " is : "  +  s);
		System.out.println("length bynary code is " + s.length());
		intToBit(a);
	}

}
